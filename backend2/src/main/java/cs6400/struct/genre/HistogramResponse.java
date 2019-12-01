package cs6400.struct.genre;

public class HistogramResponse {
    String name;
    List<HistogramElement> element;

    public HistogramResponse(String name, List<HistogramElement> element) {
        this.name = name;
        this.element = element;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HistogramElement> getElement() {
        return element;
    }

    public void setElement(List<HistogramElement> element) {
        this.element = element;
    }
}
