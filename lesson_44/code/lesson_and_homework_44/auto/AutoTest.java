package lesson_and_homework_44.auto;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AutoTest {
    List<Auto> autos;
    @BeforeEach
    public void seUp(){
        autos = new ArrayList<>();
        autos.add(new Auto("BMW", "Model3", 25000.0));
        autos.add(new Auto("Audi", "A4", 30000.0));
        autos.add(new Auto("BMW", "Model2", 22000.0));
        autos.add(new Auto("Audi", "A3", 28000.0));
        autos.add(new Auto("BMW", "Model2", 20000.0));
    }

    @Test
    public void testAutoByBrandSize() {

        Map<String, Set<Auto>> autoByBrandMap = Auto.autoByBrand(autos);

        assertEquals(2, autoByBrandMap.size());
    }

    @Test
    public void testAutoByBrandContainsKeys() {

        Map<String, Set<Auto>> autoByBrandMap = Auto.autoByBrand(autos);

        assertTrue(autoByBrandMap.containsKey("BMW"));
        assertTrue(autoByBrandMap.containsKey("Audi"));
    }

    @Test
    public void testAutoByBrandSetSize() {

        Map<String, Set<Auto>> autoByBrandMap = Auto.autoByBrand(autos);

        Set<Auto> bmwAutos = autoByBrandMap.get("BMW");
        Set<Auto> audiAutos = autoByBrandMap.get("Audi");

        assertEquals(3, bmwAutos.size());
        assertEquals(2, audiAutos.size());
    }

    @Test
    public void testAutoByBrandModelOrder() {
        autos.add(new Auto("BMW", "Model2", 20000.0));

        Map<String, Set<Auto>> autoByBrandMap = Auto.autoByBrand(autos);

        Set<Auto> bmwAutos = autoByBrandMap.get("BMW");
        List<Auto> bmwAutosList = new ArrayList<>(bmwAutos);

        assertEquals(3, bmwAutosList.size());
        assertTrue(bmwAutosList.get(0).getPrice() < bmwAutosList.get(1).getPrice());
    }
}