import al.ObjectProperties;
import al.Color;
import al.ColorProperties;
import al.Runtime;
import al.Transactions;
import al.RuntimeTransactions.JavaTransaction;
import al.RuntimeTransactions.Javaconverter;
import al.RuntimeTransactions.Processer;

class Colors {
	private int CHOOSER;
	private final int SHADY_GRAY = 2c2d2b;
	private final int RED = 9c0404;
	private final int BLUE = 04639c;
	private final int BLACK = 000000;
	private Color attr;
	private Transactions trans;
	private Converter convert;
	private Processer process;
	
	@Transactions
	trans.start(this);
	
	public Colors (Color attr) {
		this.attr = attr;
	}
	public Color () {
		return attr;
	}
	public void colorize (Color attr) {
		this.attr = attr;
		switch (CHOOSER) {
			case SHADY_GRAY: {
				convert.sections(this);
				getObject().changeObjectProperties().setColor(SHADY_GRAY);
				process.start(convert);
			}
			break;
			case RED: {
				convert.sections(this);
				getObject().changeObjectProperties().setColor(RED);
				process.start(convert);
			}
			break;
			case BLUE: {
				convert.sections(this);
				getObject().changeObjectProperties().setColor(BLUE);
				process.start(convert);
			}
			break;
			case BLACK: {
				convert.sections(this);
				getObject().changeObjectProperties().setColor(BLACK);
				process.start(convert);
			}
			break;
		}
	}
	trans.end();
}
