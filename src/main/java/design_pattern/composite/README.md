# Composite Pattern

Applied when we want to treat composites of objects and individual objects uniformly</br>

Anything that can be modelled as Treee=(or any hierarchical structure) is a potential candidate for Composite Patter</br>

If we look more closely, this pattern helps us to remove conditional with polymorphism.</br>

Imagine that we have a tree like structure and we need to have different impl for leaf nodes and non-leaf nodes.</br>
If we do not use Composite Pattern, we will have to use 'if-else' statements to figure out whether it is a leaf node or not and then apply the appropriate algorithm accordingly</br>
Composite Pattern can help us treat leaf and non-leaf nodes uniformly