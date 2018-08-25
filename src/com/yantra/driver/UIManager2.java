

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.yantra.core.interfaces.ILogAndReport;
import com.yantra.core.interfaces.IUIManager;


/**
 * @author akashtyagi
 *
 */
public class UIManager2 implements IUIManager,ILogAndReport {
	
	final Logger logger = Logger.getLogger(UIManager2.class);

	/**
	 * 
	 */

	/* (non-Javadoc)
	 * @see com.yantra.core.IUIManager#Click()
	 */
	@Override
	public void ClickElement(WebElement _locator) {
		// TODO Auto-generated method stub
		_locator.click();
		WriteLogAndReport(logger, "info", "info", "Clicked on Locator:" + _locator.toString());
		//logger.info("Clicked on Locator:" + _locator.toString());

			
	}

	/* (non-Javadoc)
	 * @see com.yantra.core.IUIManager#SetText()
	 */
	@Override
	public void SetElementText(WebElement _locator,String text) {
		// TODO Auto-generated method stub
		_locator.sendKeys(text);
		WriteLogAndReport(logger, "info", "info", "Set Locator with Text. Locator: " + _locator.toString() + " with text as : " + text);

	}

	@Override
	public String GetElementText(WebElement _locator) {
		// TODO Auto-generated method stub
		String temp1 = _locator.getText();

		WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator: " + _locator.toString() + "  Text Fetched : " + temp1);
		return temp1;


	}

	@Override
	public String GetElementAttribute(WebElement _locator,String s_att) {
		// TODO Auto-generated method stub
		String temp1 = _locator.getAttribute(s_att);

		WriteLogAndReport(logger, "info", "info", "Text Fetched from Locator's attribute. Locator: " + _locator.toString() + "  Attribute Name : " + s_att + " Attribute Value: " + temp1 );
		return temp1;
	}


	@Override
	public HashMap<Integer, HashMap<Integer, String>> GetUITableText(WebElement _locator) {
		// TODO Auto-generated method stub
		List<WebElement> o_col_rows = _locator.findElements(By.tagName("tr"));
		int i_row_count = o_col_rows.size();
		List<WebElement> o_col_clms;
		int i_clm_count;
		String cell_text;
		//HashMap<Integer,HashMap<Integer,String>> o = new 
		
		HashMap<Integer, HashMap<Integer, String>> result_map= new HashMap<Integer,HashMap<Integer,String>>();
		HashMap<Integer, String> o_col_map=null;;
		
		for (int i=0;i<i_row_count;i++) {
			o_col_clms = o_col_rows.get(i).findElements(By.tagName("td"));
			i_clm_count = o_col_clms.size();
			for(int j=0;j<i_clm_count;j++) {
				cell_text = o_col_clms.get(j).getText();
				//System.out.println(cell_text);
				o_col_map.put(j, cell_text);
			}
			result_map.put(i, o_col_map);
		}
		
		return result_map;
		
	}//end method

	@Override
	public int[] GetUITableRowClmWithCellText(WebElement _locator, String s_expected_text) {

		List<WebElement> o_col_rows = _locator.findElements(By.tagName("tr"));
		int i_row_count = o_col_rows.size();
		List<WebElement> o_col_clms;
		int i_clm_count;
		String cell_text; 
		int[] a_row_clm=null;
		
		HashMap<Integer, HashMap<Integer, String>> result_map= new HashMap<Integer,HashMap<Integer,String>>();
		HashMap<Integer, String> o_col_map=null;;
		
		for (int i=0;i<i_row_count;i++) {
			o_col_clms = o_col_rows.get(i).findElements(By.tagName("td"));
			i_clm_count = o_col_clms.size();
			for(int j=0;j<i_clm_count;j++) {
				cell_text = o_col_clms.get(j).getText();
				if (cell_text.equalsIgnoreCase(s_expected_text)){
					a_row_clm[0]=i;
					a_row_clm[1]=j;
					
				}
				//System.out.println(cell_text);
				o_col_map.put(j, cell_text);
			}
			result_map.put(i, o_col_map);
		}
		
		return a_row_clm;
		
	}

	@Override
	public List<WebElement> GetUITableChildItemsWithRowAndClm(WebElement _locator,int row, int clm, By desc) {
		
		List<WebElement> o_collection_rows = _locator.findElements(By.tagName("tr"));
		
		List<WebElement> o_collection_clms = o_collection_rows.get(row).findElements(By.tagName("td"));
		List<WebElement> o_collection_child_items = o_collection_clms.get(clm).findElements(desc);
		return o_collection_child_items;

	}//end method

}//end class
