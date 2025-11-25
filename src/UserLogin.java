public abstract class UserLogin extends javax.swing.JFrame {
    
    public UserLogin() {
        initComponents();
    }
    
    // Abstract method to be implemented by subclasses
    protected abstract void initComponents();

    // Common methods can go here
    protected void showLogin() {
        this.setVisible(true);
    }
    
    // Optionally, you can define common fields or methods here
}
