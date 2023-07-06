// F:\Uni\VAuD\distributed-hashtable\project
import java.util.AbstractMap.SimpleEntry;
import simulator.NodeGenerator;
import simulator.Node;
import launcher.InternalLauncher;
import java.util.Map.Entry;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
class Startup implements NodeGenerator{
public static void main(String[] args){
InternalLauncher.launch(new Startup(),args[0], Integer.parseInt(args[1]), args[2].equals("on"), args[3].equals("on"), args[4].equals("on"), args[5], Integer.parseInt(args[6]), Integer.parseInt(args[7]));}
public String[] nodeTypes(){
return new String[]{"ListNode"};
}
public Node generateNode(String type, String name, boolean runSemisynchron){
if (type.equals("ListNode")) return new nodeTypeListNode(name, runSemisynchron);
return null;
}
}class nodeTypeListNode extends Node{
public nodeTypeListNode (String name, boolean runSemisynchron){super(name,"ListNode",runSemisynchron);}
Edge v1 = null;
Edge v2 = null;
double v3 = Double.NaN;
List<Integer> v4 = new ArrayList<Integer>();
int v5 = 64;
@SuppressWarnings("unchecked")
public Entry<String, Object>[] getAttributes(){
return new SimpleEntry[] {
new SimpleEntry<String, Object>("left",v1), 
new SimpleEntry<String, Object>("right",v2), 
new SimpleEntry<String, Object>("hash_value",v3), 
new SimpleEntry<String, Object>("r",v4), 
new SimpleEntry<String, Object>("R_LENGTH",v5)};}
@SuppressWarnings("unchecked")
public Entry<String, Entry<String, String>[]>[] getFunctions(){
List<Entry<String, Entry<String, String>[]>> attr = new LinkedList<Entry<String, Entry<String, String>[]>>();
attr.add(new SimpleEntry<String, Entry<String, String>[]>("init",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("floatToBitstring",new SimpleEntry[] {
new SimpleEntry<String, String>("F", "double"), 
new SimpleEntry<String, String>("L", "int"), 
new SimpleEntry<String, String>("A", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("prefix",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("A", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("succ",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int"), 
new SimpleEntry<String, String>("V", "simulator.Node"), 
new SimpleEntry<String, String>("B", "int"), 
new SimpleEntry<String, String>("A", "int [] 1")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("g",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "int")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("entry",new SimpleEntry[] {
new SimpleEntry<String, String>("C", "simulator.Node")}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("timeout",new SimpleEntry[] {}));
attr.add(new SimpleEntry<String, Entry<String, String>[]>("linearize",new SimpleEntry[] {
new SimpleEntry<String, String>("V", "simulator.Node")}));
Entry<String, Entry<String, String>[]>[] result = new Entry[attr.size()];
attr.toArray(result);
return result;}
@SuppressWarnings("unchecked")
public Entry<String, Long>[] getFunctionCallCounter(){List<Entry<String, Long>> attr = new LinkedList<Entry<String, Long>>();
attr.add(new SimpleEntry<String, Long>("init",callCounterinit));
attr.add(new SimpleEntry<String, Long>("floatToBitstring",callCounterfloatToBitstring));
attr.add(new SimpleEntry<String, Long>("prefix",callCounterprefix));
attr.add(new SimpleEntry<String, Long>("succ",callCountersucc));
attr.add(new SimpleEntry<String, Long>("g",callCounterg));
attr.add(new SimpleEntry<String, Long>("entry",callCounterentry));
attr.add(new SimpleEntry<String, Long>("timeout",callCountertimeout));
attr.add(new SimpleEntry<String, Long>("linearize",callCounterlinearize));
Entry<String, Long>[] result = new Entry[attr.size()];
attr.toArray(result);
return result;}
protected void messageReceived(Object [] params){
if (params.length<1 || ! (params[0] instanceof String)) return;
if (params[0].equals("init")){
funinit();if ((boolean)params[1]){
print("init returned");
}
}
if (params[0].equals("floatToBitstring")){
funfloatToBitstring((double)params[2], (int)params[3], (List<Integer>)params[4]);if ((boolean)params[1]){
print("floatToBitstring returned");
}
}
if (params[0].equals("prefix")){
funprefix((int)params[2], (simulator.Node)params[3], (List<Integer>)params[4]);if ((boolean)params[1]){
print("prefix returned");
}
}
if (params[0].equals("succ")){
Object result = funsucc((int)params[2], (simulator.Node)params[3], (int)params[4], (List<Integer>)params[5]);
if ((boolean)params[1]){
print("succ returns " + result);
}
}
if (params[0].equals("g")){
Object result = fung((int)params[2]);
if ((boolean)params[1]){
print("g returns " + result);
}
}
if (params[0].equals("entry")){
funentry((simulator.Node)params[2]);if ((boolean)params[1]){
print("entry returned");
}
}
if (params[0].equals("timeout")){
funtimeout();if ((boolean)params[1]){
print("timeout returned");
}
}
if (params[0].equals("linearize")){
funlinearize((simulator.Node)params[2]);if ((boolean)params[1]){
print("linearize returned");
}
}
}
long callCounterinit;
protected void funinit() { callCounterinit++; try {
v3=fung(id(this));
funfloatToBitstring(v3, v5, v4);}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCounterfloatToBitstring;
protected void funfloatToBitstring(double p6, int p7, List<Integer> p8) { callCounterfloatToBitstring++; try {
clearArray(p8,false);
double v9 = p6;
int v10 = 0;
double v11 = Double.NaN;
for(v10=0;(v10<p7);v10=v10+1){{
v11=(v9*2.0);
if((v11>1)){{
addArrayEnd(p8,1);
v9=(v11-1.0);
}
} else {if((v11<1)){{
addArrayEnd(p8,0);
v9=v11;
}
}}}
}while((length(p8)<p7)){{
addArrayEnd(p8,0);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in floatToBitstring: "+e.getMessage()); } return ;} long callCounterprefix;
protected void funprefix(int p12, simulator.Node p13, List<Integer> p14) { callCounterprefix++; try {
List<Integer> v15 = new ArrayList<Integer>();
funfloatToBitstring(fung(id(p13)), v5, v15);clearArray(p14,false);
int v16 = 0;
for(v16=0;(v16<p12);v16=v16+1){{
addArrayEnd(p14,getArrayIndex(v15,0,v16));
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in prefix: "+e.getMessage()); } return ;} long callCountersucc;
protected simulator.Node funsucc(int p17, simulator.Node p18, int p19, List<Integer> p20) { callCountersucc++; try {
List<Integer> v21 = new ArrayList<Integer>();
funprefix(p17, p18, v21);addArrayEnd(v21,p19);
}
 catch (ArithmeticException e){ print("arithmetic exception in succ: "+e.getMessage()); } return null;} long callCounterg;
protected double fung(int p22) { callCounterg++; try {
double v23 = hash(p22);
v23=(v23/Integer.MAX_VALUE);
v23=((v23+1)/2);
{if(this.TRUE)return v23;}}
 catch (ArithmeticException e){ print("arithmetic exception in g: "+e.getMessage()); } return Double.NaN;} long callCounterentry;
protected void funentry(simulator.Node p24) { callCounterentry++; try {
funlinearize(p24);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
if((((v1!=null?((Edge)(v1)).node:null)!=null)&(fung(id((v1!=null?((Edge)(v1)).node:null)))<v3))){{
{if ((v1!=null?((Edge)(v1)).node:null)!=null) (v1!=null?((Edge)(v1)).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(v1!=null?((Edge)(v1)).node:null));}
v1=updateVisualization(v1,null,true,"black");
}
}if((((v2!=null?((Edge)(v2)).node:null)!=null)&(fung(id((v2!=null?((Edge)(v2)).node:null)))>v3))){{
{if ((v2!=null?((Edge)(v2)).node:null)!=null) (v2!=null?((Edge)(v2)).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(v2!=null?((Edge)(v2)).node:null));}
v2=updateVisualization(v2,null,true,"black");
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p25) { callCounterlinearize++; try {
if((fung(id(p25))<v3)){{
if(((v1!=null?((Edge)(v1)).node:null)==null)){{
v1=updateVisualization(v1,p25,true,"black");
}
} else {{
if((fung(id((v1!=null?((Edge)(v1)).node:null)))<fung(id(p25)))){{
{if (p25!=null) p25.send("linearize",false,(v1!=null?((Edge)(v1)).node:null));}
v1=updateVisualization(v1,p25,true,"black");
}
} else {{
{if ((v1!=null?((Edge)(v1)).node:null)!=null) (v1!=null?((Edge)(v1)).node:null).send("linearize",false,p25);}
}
}}
}}
} else {if((fung(id(p25))>v3)){{
if(((v2!=null?((Edge)(v2)).node:null)==null)){{
v2=updateVisualization(v2,p25,true,"black");
}
} else {{
if((fung(id((v2!=null?((Edge)(v2)).node:null)))>fung(id(p25)))){{
{if (p25!=null) p25.send("linearize",false,(v2!=null?((Edge)(v2)).node:null));}
v2=updateVisualization(v2,p25,true,"black");
}
} else {{
{if ((v2!=null?((Edge)(v2)).node:null)!=null) (v2!=null?((Edge)(v2)).node:null).send("linearize",false,p25);}
}
}}
}}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} }
