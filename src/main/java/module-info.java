module mad.graph {
    requires javafx.controls;
    requires javafx.fxml;


    opens mad.graph to javafx.fxml;
    exports mad.graph;
}