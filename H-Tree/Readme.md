#H-Tree Construction

Construct an H-tree, given its center (x and y coordinates), starting_length and depth. You can assume that you have a drawLine method. 

As a reminder, [this](https://en.wikipedia.org/wiki/H_tree#/media/File:H_tree.svg) is an example of an H-tree.

How to construct an H-tree?

An H-tree can be constructed by starting with a line segment of arbitrary length, drawing two segments of the same length at right angles to the first through its endpoints, and continuing in the same vein, reducing (dividing) the length of the line segments drawn at each stage by √2.
