package xxl.mathematica.io

class ImportStringTest extends GroovyTestCase {
    void testImportString() {
        XmlBean xmlBean = ImportString.importStringXml("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n" +
                "<XmlBean name=\"12\">\n" +
                "    <Name>xxl</Name>\n" +
                "    <Age>18</Age>\n" +
                "    <Goods>apple</Goods>\n" +
                "    <Goods>orange</Goods>\n" +
                "    <Goods>vegetable</Goods>\n" +
                "</XmlBean>\n", XmlBean.class)
        println(xmlBean)
    }
}
