public class HomeWorkThree {
    public static void main(String...args) {
        //  планета в безопасности?
        boolean isPlanetSafe;

        //     атмосфера в порядке
        boolean theAtmosphereIsOk = true;
        //      летит астероид
        boolean flyingAsteroid = false;
        //      землетрясение
        boolean earthQuake = true;
        //      цунами
        boolean tsunami = true;
        //      загрязнение
        boolean pollution = false;
        //      вырубка лесов
        boolean deforestation = true;
        //      разрушение озонового слоя
        boolean ozoneDepletion = false;
        //      засуха
        boolean drought = true;
        //      глобальное потепление
        boolean globalWarming = false;
        //      войны
        boolean wars = false;


        isPlanetSafe = theAtmosphereIsOk && earthQuake || !pollution && wars || drought && !globalWarming
                && !tsunami && !deforestation || flyingAsteroid || ozoneDepletion;


        System.out.println("Планета в безопасности? " + isPlanetSafe);

    }

}