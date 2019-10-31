//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.02.27 at 01:43:12 PM CST 
//


package platform.nlp.ltp.xml.bean;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LTPDocument complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LTPDocument">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="para" type="{}LTPParagraph" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LTPDocument", propOrder = {
    "para"
})
public class LTPDocument {

    @XmlElement(required = true)
    protected List<LTPParagraph> para;

    /**
     * Gets the value of the para property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the para property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPara().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LTPParagraph }
     * 
     * 
     */
    public List<LTPParagraph> getPara() {
        if (para == null) {
            para = new ArrayList<LTPParagraph>();
        }
        return this.para;
    }
    
    /*
     * 获取段落个数
     */
    public int size() {
    	return this.getPara().size();
    }
    
    /*
     * 获取此文本第para_index段
     */
    public LTPParagraph paragraph(int para_index) {
    	try{
    		return this.getPara().get(para_index);
    	}catch( Exception e ){
    		System.out.println("段落"+para_index+"不存在！");
    		e.printStackTrace();
    		return null;
    	}
	}
    
    /*
     * 获取此文本第para_index段的第sent_index句话
     */
    public LTPSentence piece(int para_index, int sent_index) {
    	try{
    		return this.getPara().get(para_index).getSent().get(sent_index);
	    }catch( Exception e ){
			System.out.println("段落"+para_index+"的语句"+sent_index+"不存在！");
			e.printStackTrace();
			return null;
		}
	}
    
    /*
     * 获取此文本第para_index段的第sent_index句话的第word_index个单词
     */
    public LTPWord word(int para_index, int sent_index, int word_index) {
    	try{
    		return this.getPara().get(para_index).getSent().get(sent_index).getWord().get(word_index);
	    }catch( Exception e ){
			System.out.println("段落"+para_index+"的语句"+sent_index+"的词语"+word_index+"不存在！");
			e.printStackTrace();
			return null;
		}
	}

}