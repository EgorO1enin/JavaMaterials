import java.awt.print.Book;
import java.util.Objects;

@Override
public boolean equals(Object obj){
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Book otherbook = (Book) obj;
    return Objects.equals(title, otherbook.title) && (number1 == otherbook.number1);

}