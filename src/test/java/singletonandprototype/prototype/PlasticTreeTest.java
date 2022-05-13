package singletonandprototype.prototype;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlasticTreeTest {

    private int massInKg;
    private int heightInCentimetres;
    private int position;
    private int otherPosition;

    @BeforeEach
    public void setUp() {
        this.massInKg = 100;
        this.heightInCentimetres = 2000;
        this.position = 25;
        this.otherPosition = 63;
    }

    @Test
    public void givenAPlasticTreePrototypeWhenClonedThenCreateA_Clone() {
        PlasticTree plasticTree = new PlasticTree(massInKg, heightInCentimetres);
        plasticTree.setPosition(position);
        PlasticTree anotherPlasticTree = (PlasticTree) plasticTree.copy();
        anotherPlasticTree.setPosition(otherPosition);

        assertEquals(position, plasticTree.getPosition());
        assertEquals(otherPosition, anotherPlasticTree.getPosition());
    }

    @Test
    public void givenA_ListOfTreesWhenClonedThenCreateListOfClones() {

        // create instances of PlasticTree and PineTree
        PlasticTree plasticTree = new PlasticTree(massInKg, heightInCentimetres);
        PineTree pineTree = new PineTree(massInKg + 42, heightInCentimetres + 300);

        List<Tree> trees = Arrays.asList(plasticTree, pineTree);
        List<Tree> treeClones = trees.stream().map(Tree::copy).collect(toList());

        System.out.println("first copy :" + treeClones.get(0));
        System.out.println("first copy :" + treeClones.get(1));

        assertEquals(123123, treeClones.get(0).getHeight());
        assertEquals(55345, treeClones.get(0).getPosition());

        assertEquals(123123, treeClones.get(1).getHeight());
        assertEquals(55345, treeClones.get(1).getPosition());
    }

}