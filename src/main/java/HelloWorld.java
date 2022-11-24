import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class HelloWorld {

    public static void main(String [] args) {
        Country brazil = new Country("BR", "Brazil", "BRL");
        Country argentina = new Country("AR", "Argentina", "ARP");

        log.info(brazil.toString());
        log.info(argentina.toString());

        log.info("Brazil == Argentina == {}", brazil.equals(argentina));

    }

}
