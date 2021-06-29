
function BBServiceURL() {
	return 'ws://localhost:8080/bbService';
}

class WSBBChannel {
	constructor(URL, callback) {
		this.URL = URL;
		this.wsocket = new WebSocket(URL);
		this.wsocket.onopen = (evt) => this.onOpen(evt);
		this.wsocket.onmessage = (evt) => this.onMessage(evt);
		this.wsocket.onerror = (evt) => this.onError(evt);
		this.receivef = callback;
	}
	onOpen(evt) {
		console.log("In onOpen", evt);
	}
	onMessage(evt) {
		console.log("In onMessage", evt);
		// Este if permite que el primer mensaje del servidor no se tenga en cuenta.
		// El primer mensaje solo confirma que se estableci� la conexi�n.
		// De ah� en adelante intercambiaremos solo puntos(x,y) con el servidor
		if (evt.data != "Connection established.") {
			this.receivef(evt.data);
		}
	}
	onError(evt) {
		console.error("In onError", evt);
	}
	send(x, y) {
		let msg = '{ "x": ' + (x) + ', "y": ' + (y) + "}";
		console.log("sending: ", msg);
		this.wsocket.send(msg);
	}
}

class BBCanvas extends React.Component {
	constructor(props) {
		super(props);
		this.comunicationWS = this.comunicationWS =
			new WSBBChannel(BBServiceURL(), new WSBBChannel(BBServiceURL(),

				(msg) => {
					var obj = JSON.parse(msg); var obj = JSON.parse(msg);
					console.log("On func call back ", msg); console.log("On func call back ", msg);
					this.drawPoint(obj.x, obj.y); this.drawPoint(obj.x, obj.y);
				}));

		this.myp5 = null;
		this.state = { loadingState: 'Loading Canvas ...' }
		this.sketch = function(p) {
			let x = 100;
			let y = 100;
			p.setup = function() {
				p.createCanvas(700, 410);
			};
			p.draw = function() {
				if (p.mouseIsPressed === true) {
					p.fill(0, 0, 0);
					p.ellipse(p.mouseX, p.mouseY, 20, 20);
				}
				if (p.mouseIsPressed === false) {
					p.fill(255, 255, 255);
				}
			};
		}
	}
	componentDidMount() {
		this.myp5 = new p5(this.sketch, 'container');
		this.setState({ loadingState: 'Canvas Loaded' });
	}
	render() {
		return (
			<div>
				<h4>Drawing status: {this.state.loadingState}</h4>
			</div>);
	}
}


class Editor extends React.Component {
	render() {
		return (
			<div>
				<h1>Hello, {this.props.name}</h1>
				<hr />
				<div id="toolstatus"></div>
				<hr />
				<div id="container"></div>
				<BBCanvas />
				<hr />
				<div id="info"></div>
			</div>
		);
	}
}


ReactDOM.render(
	<Editor name="Miguel Castellanos" />,
	document.getElementById('root')
);