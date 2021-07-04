

var num = Math.floor(Math.random() * (10000 - 1000)) + 1000;
var cont = 0;
var d1 = Math.trunc(num / 1000);
var aux1 = num - d1 * 1000
var d2 = Math.trunc(aux1 / 100);
var aux2 = aux1 - d2 * 100
var d3 = Math.trunc(aux2 / 10);
var aux3 = aux2 - d3 * 10
var d4 = aux3;
function PicasYFijas() {
	cont = cont + 1;
	var valor = parseInt(document.getElementById("valor").value);
	var p1 = procesarPicas(valor);
	var f1 = procesarFijas(valor);

	if (cont == 1) {
		document.registro.valor1.value = valor;
		document.registro.valorP1.value = p1;
		document.registro.valorF1.value = f1;
		
		if(f1 == 4){
			document.getElementById("estado").innerHTML = "Ha Ganado!!!"
		}
	}
	if (cont == 2) {
		document.registro.valor2.value = valor;
		document.registro.valorP2.value = p1;
		document.registro.valorF2.value = f1;
		
		if(f1 == 4){
			document.getElementById("estado").innerHTML = "Ha Ganado!!!"
		}
	}
	if (cont == 3) {
		document.registro.valor3.value = valor;
		document.registro.valorP3.value = p1;
		document.registro.valorF3.value = f1;
		
		if(f1 == 4){
			document.getElementById("estado").innerHTML = "Ha Ganado!!!"
		}
	}
	if (cont == 4) {
		document.registro.valor4.value = valor;
		document.registro.valorP4.value = p1;
		document.registro.valorF4.value = f1;
		
		if(f1 == 4){
			document.getElementById("estado").innerHTML = "Ha Ganado!!!"
		}
	}
	if (cont == 5) {
		document.registro.valor5.value = valor;
		document.registro.valorP5.value = p1;
		document.registro.valorF5.value = f1;
		
		if(f1 == 4){
			document.getElementById("estado").innerHTML = "Ha Ganado!!!"
		}
	}
	if (cont == 6){
		document.getElementById("estado").innerHTML = "Ha Perdido!!! el numero era: " + num
	}
	

}

function procesarPicas(number) {
	var con = 0;
	var v1 = Math.trunc(number / 1000);
	var au1 = number - v1 * 1000
	var v2 = Math.trunc(au1 / 100);
	var au2 = au1 - v2 * 100
	var v3 = Math.trunc(au2 / 10);
	var au3 = au2 - v3 * 10
	var v4 = au3;
	if (v1 == d2 || v1 == d3 || v1 == d4) {
		con = con + 1;
	}
	if (v2 == d1 || v2 == d3 || v2 == d4) {
		con = con + 1;
	}
	if (v3 == d2 || v3 == d1 || v3 == d4) {
		con = con + 1;
	}
	if (v4 == d2 || v4 == d3 || v4 == d1) {
		con = con + 1;
	}
	return con;
}

function procesarFijas(number) {
	var c = 0;
	var v1 = Math.trunc(number / 1000);
	var au1 = number - v1 * 1000
	var v2 = Math.trunc(au1 / 100);
	var au2 = au1 - v2 * 100
	var v3 = Math.trunc(au2 / 10);
	var au3 = au2 - v3 * 10
	var v4 = au3;
	console.log(v1,d1);
	console.log(v2,d2);
	console.log(v3,d3);
	console.log(v4,d4);
	if (v1 == d1) {
		c = c + 1;
	}
	if (v2 == d2) {
		c = c + 1;
	}
	if (v3 == d3) {
		c = c + 1;
	}
	if (v4 == d4) {
		c = c + 1;
	}
	
	return c;

}