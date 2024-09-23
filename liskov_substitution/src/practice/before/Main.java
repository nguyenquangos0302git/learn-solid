package practice.before;

public class Main {

    public static void main(String[] args) {
        Buyer buyerFirst = new Buyer("City People", "1234567890", "citypeople@gmail.com");
        Buyer buyerSecond = new Buyer("Remote Area People", "1234567890", "remoteareapeople@gmail.com");
        Buyer buyerThird = new Buyer("Foreign People", "1234567890", "foreignpeople@gmail.com");

        Property city = new City(buyerFirst);
        city.rent();
        city.buy();

        Property remoteArea = new RemoteArea(buyerSecond);
        remoteArea.rent();
        remoteArea.buy();

        Property foreign = new Foreign(buyerThird);
        foreign.rent();
        foreign.buy();

    }

}
