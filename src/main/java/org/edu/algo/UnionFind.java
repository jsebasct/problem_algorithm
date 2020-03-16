package org.edu.algo;

public class UnionFind {

    private int[] components;

    public UnionFind(int size) {
        this.components = new int[size];
        for (int i = 0; i < components.length; i++) {
            this.components[i] = i;
        }
    }

    public void union(int first, int last) {
//        int currentValue = this.components[p];
//        this.components[q] = currentValue;
//        this.components[first] = this.components[last];

        for (int i = 0; i < this.components.length; i++) {
            if (this.components[i] ==  first) {
                this.components[i] = this.components[last];
            }
        }

    }

    public boolean connected(int first, int last) {
        return this.components[first] == this.components[last];
    }

    public void showComponent() {
        System.out.println();
        for (int i = 0; i < components.length; i++) {
            System.out.print(this.components[i] + " - ");
        }
    }
}
