package cz.educanet;

public class Room {
    private String description;
    private String title;

    private Room top;
    private Room left;
    private Room right;

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Room getTop() {
        return top;
    }
    public void setTop(Room top) {
        this.top = top;
    }

    public Room getLeft() {
        return left;
    }
    public void setLeft(Room left) {
        this.left = left;
    }

    public Room getRight() {
        return right;
    }
    public void setRight(Room right) {
        this.right = right;
    }
}
