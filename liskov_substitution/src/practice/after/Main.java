package practice.after;

public class Main {

    public static void main(String[] args) {
        Buyer buyerFirst = new Buyer("City People", "1234567890", "citypeople@gmail.com");
        Buyer buyerSecond = new Buyer("Remote Area People", "1234567890", "remoteareapeople@gmail.com");
        Buyer buyerThird = new Buyer("Foreign People", "1234567890", "foreignpeople@gmail.com");

        Domestic city = new City(buyerFirst);
        city.rent();
        city.buy();

        Domestic remoteArea = new RemoteArea(buyerSecond);
        remoteArea.rent();
        remoteArea.buy();

        Internation foreign = new Foreign(buyerThird);
        foreign.rent();

    }

}
