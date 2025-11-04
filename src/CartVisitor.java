public interface CartVisitor {
    void visit(Book book);
    void visit(Clothing clothing);
    void visit(Electronics electronics);
}
