package jj_io.bb_DataExample;

import java.io.*;

public class Test {
	public static void main(String[] args) {

		// write the data out:
		try (DataOutputStream out = new DataOutputStream(
				new FileOutputStream("./src/jj_io/bb_DataExample/invoice1.txt"));) {

			double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
			int[] units = { 12, 8, 13, 29, 50 };
			String[] descs = { "Java T-shirt", "Java Mug", "Duke Juggling Dolls", "Java Pin", "Java Key Chain" };

			for (int i = 0; i < prices.length; i++) {
				out.writeDouble(prices[i]);
				out.writeChar('\t');
				out.writeInt(units[i]);
				out.writeChar('\t');
				out.writeChars(descs[i]);
				out.writeChar('\n');
			}
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// read it in again
		double total = 0.0;
		try (DataInputStream in = new DataInputStream(
				new FileInputStream("./src/jj_io/bb_DataExample/invoice1.txt"));) {

			double price;
			int unit;
			StringBuffer desc;

			while (true) {
				price = in.readDouble();
				in.readChar(); // throws out the tab
				unit = in.readInt();
				in.readChar(); // throws out the tab
				char chr;
				desc = new StringBuffer(20);
				char lineSep = System.getProperty("line.separator").charAt(0);
				while ((chr = in.readChar()) != lineSep)
					desc.append(chr);
				System.out.println("You've ordered " + unit + " units of " + desc + " at $" + price);
				total = total + unit * price;
			}
		} catch ( EOFException e ) {
			// do nothing
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("For a TOTAL of: $" + total);
	}
}
