package Exercise3;

public class ItemTest {
	public static void main(String[] args) {
		WritenItem writenItem = new Book();
		writenItem.setBookAuthor("Srinath");
		writenItem.setUniqueNum(1234);
		writenItem.setTitle("ABCD");
		writenItem.setNumOfCopies(10);
		writenItem.BookDetails();

		WritenItem writtenItem1 = new JournalPaper();
		JournalPaper jp = (JournalPaper) writtenItem1;
		jp.setPublishedYear("2020 Dec");
		jp.journalPaper();

		WritenItem writtenItem2 = new Video();
		Video v = (Video) writtenItem2;
		v.setDirector("Srinath");
		v.setGenre(null);
		v.setReleasedYear(2021);
		v.mediaItem();
	}
}
