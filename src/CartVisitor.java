// Visitor Interface
public interface CartVisitor {
    // Method visit for each item type
    void visit(Book book);
    void visit(Clothing clothing);
    void visit(Electronics electronics);
}
