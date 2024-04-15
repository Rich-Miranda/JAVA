class CarPrincipal{
    public static void  main (String []args){
        Carro car = new Carro();
        
        car.marca  = "Sandeiro";
        car.modelo = "Renovt";
        car.numPassageiros = 5;
        car.tanqueCheio = 100;
        car.consumoKm = 2.5 ;

        System.out.println(car.marca);
        System.out.println(car.modelo);

        System.out.println();
        Carro fusca = new Carro();
        
        fusca.marca  = "Volkwange";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 4;
        fusca.tanqueCheio = 30;
        fusca.consumoKm = 0.15 ;

        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);
    
    }
}