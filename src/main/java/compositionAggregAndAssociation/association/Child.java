package compositionAggregAndAssociation.association;

//Association is the weakest relationship between the three. It isn't a “has-a” relationship, none of the objects are parts or members of another.
//
//Association only means that the objects “know” each other. For example, a mother and her child.

import java.util.List;

class Child {
}

class Mother {
    List<Child> children;
}


/*
    class Child {
        Mother mother;
    }

    class Mother {
        List<Child> children;
    }
 */



//But wait, how can we tell if a reference means aggregation or association?
//
//Well, we can't. The difference is only logical: whether one of the objects is part of the other or not.
//
//Also, we have to maintain the references manually on both ends as we did with aggregation: