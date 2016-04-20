<?php
$x = $_POST['num1'];
$y = $_POST['num2'];

if ($_POST['op'] == "soma")
{
	$z = $x+$y;
	echo "O resultado e: $z";
}
elseif($_POST['op'] == "subtracao")
{
	$z = $x-$y;
	echo "O resultado e: $z";
}
elseif($_POST['op'] == "divisao")
{
	$z = $x/$y;
	echo "O resultado e: $z";
}
elseif($_POST['op'] == "multiplicacao")
{
	$z = $x*$y;
	echo "O resultado e: $z";
}

?>