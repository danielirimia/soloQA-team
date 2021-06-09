package inventory.controller;

import inventory.repository.InventoryRepository;
import inventory.service.InventoryService;

import java.io.FileNotFoundException;
import java.io.PrintWriter;


import static org.junit.jupiter.api.Assertions.*;

@org.junit.jupiter.api.DisplayName("F01a: Add part test")
class AddPartControllerTest {
    private AddPartController addPartController;
    private InventoryRepository inventoryRepository;

    String name, price, inStock, min, max, partDynamicValue;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        inventoryRepository = new InventoryRepository("data/test_items.txt");
        InventoryService inventoryService = new InventoryService(inventoryRepository);
        addPartController = new AddPartController();
        addPartController.setService(inventoryService);

        // Arrange
        name = "piesa1";
        price = "100.0";
        inStock = "10";
        min = "1";
        max = "50";
        partDynamicValue = "123";
    }

    // clean the DB file
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        PrintWriter writer = null;
        try {
            ClassLoader classLoader = AddPartControllerTest .class.getClassLoader();
            writer = new PrintWriter(classLoader.getResource("data/test_items.txt").getFile());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        writer.print("");
        writer.close();
    }

    @org.junit.jupiter.api.Order(0)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartECPValidName() {
        name = "piesa1";

        //assert
        assertDoesNotThrow(() -> addPartController.addPart(name, price, inStock, min, max, partDynamicValue));
        assertEquals(1, inventoryRepository.getAllParts().size());
    }

    @org.junit.jupiter.api.Order(1)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartECPInvalidName() {
        name = "";

        try {
            addPartController.addPart(name, price, inStock, min, max, partDynamicValue);
            assertFalse(true);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "A name has not been entered. ");
            assertEquals(0, inventoryRepository.getAllParts().size());
        }
    }

    @org.junit.jupiter.api.Order(2)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartECPValidPrice() {
        price = "100";

        //assert
        assertDoesNotThrow(() -> addPartController.addPart(name, price, inStock, min, max, partDynamicValue));
        assertEquals(1, inventoryRepository.getAllParts().size());
    }

    @org.junit.jupiter.api.Order(3)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartECPInvalidPrice() {
        price = "-100";

        try {
            addPartController.addPart(name, price, inStock, min, max, partDynamicValue);
            assertFalse(true);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The price must be greater than 0. ");
            assertEquals(0, inventoryRepository.getAllParts().size());
        }
    }

    @org.junit.jupiter.api.Order(4)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartBVAInvalidName() {
        name = "";

        try {
            addPartController.addPart(name, price, inStock, min, max, partDynamicValue);
            assertFalse(true);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "A name has not been entered. ");
            assertEquals(0, inventoryRepository.getAllParts().size());
        }
    }

    @org.junit.jupiter.api.Order(5)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartBVANullName() {
        name = null;

        try {
            addPartController.addPart(name, price, inStock, min, max, partDynamicValue);
            assertFalse(true);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), null);
            assertEquals(0, inventoryRepository.getAllParts().size());
        }
    }

    @org.junit.jupiter.api.Order(6)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartBVALengthOneName() {
        name = "M";

        //assert
        assertDoesNotThrow(() -> addPartController.addPart(name, price, inStock, min, max, partDynamicValue));
        assertEquals(1, inventoryRepository.getAllParts().size());
    }

    @org.junit.jupiter.api.Order(7)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartBVAPriceZero() {
        price = "0";

        try {
            addPartController.addPart(name, price, inStock, min, max, partDynamicValue);
            assertFalse(true);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The price must be greater than 0. ");
            assertEquals(0, inventoryRepository.getAllParts().size());
        }
    }

    @org.junit.jupiter.api.Order(8)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartBVAPriceNegative() {
        price = "-1";

        try {
            addPartController.addPart(name, price, inStock, min, max, partDynamicValue);
            assertFalse(true);
        } catch (Exception ex) {
            assertEquals(ex.getMessage(), "The price must be greater than 0. ");
            assertEquals(0, inventoryRepository.getAllParts().size());
        }
    }

    @org.junit.jupiter.api.Order(9)
    @org.junit.jupiter.api.Timeout(10)
    @org.junit.jupiter.api.Tag("part")
    @org.junit.jupiter.api.Test
    void addPartBVAPriceOne() {
        price = "1";

        //assert
        assertDoesNotThrow(() -> addPartController.addPart(name, price, inStock, min, max, partDynamicValue));
        assertEquals(1, inventoryRepository.getAllParts().size());
    }
}