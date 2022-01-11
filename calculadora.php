<html>
<title> </title>
<head>
</head>
<?php 
 /**
  * @author DAW-JDMC
  * @version visual-Studio-Code 1.63
  * @param integer $Numero1 recoge el valor 1
  * @param integer $Numero2 recoge el valor 2
  * @param integer $suma resultado de sumar los valores
  * @param integer $resta resultado de restar los valores
  * @param integer $mult resultado de multiplicar los valores
  * @param integer $div resultado de dividir los valores
  */
 
$Numero1=$_REQUEST['n1'];
$Numero2=$_REQUEST['n2'];
$Opciones=$_REQUEST['Operacion'];
switch ($Opciones) {
	case 1: $suma = $Numero1 + $Numero2;
	echo "la suma es:  " . $suma;
	break;
	case 2: $resta = $Numero1 - $Numero2;
	echo "la resta es:  " . $resta;
	break;
	case 3: $mult = $Numero1 * $Numero2;
	echo "la Multiplicacion es:   " . $mult;
	break;
	
	case 4: 
	if($Numero2 > 0){
		$div = $Numero1 / $Numero2;
		echo "la Divicion es:   " . $div;
	}else{
		echo "Error!!, el divisor tiene que ser mayor que cero.";
	}
	
	break;
}
?>
</body>
</html