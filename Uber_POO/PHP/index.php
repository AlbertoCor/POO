<?php
require_once("car.php");
require_once("uberX.php");
require_once("uberPool.php")
require_once("account.php");

$uberX = new UberX("ASDF123", new Account("Alberto Hack", "ALB465", "Lancer", "LancerEvo"));
$uberX->printDataCar();

$uberPool = new UberPool("QWEQR124", new Account("Rosy", "XZC145"), "Mazda 3", "Mazda")
$uberPool->printDataCar(),

?>