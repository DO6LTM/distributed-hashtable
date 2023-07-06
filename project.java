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
attr.add(new SimpleEntry<String, Entry<String, String>[]>("g",new SimpleEntry[] {
new SimpleEntry<String, String>("I", "simulator.Node")}));
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
if (params[0].equals("g")){
Object result = fung((simulator.Node)params[2]);
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
v3=fung(this);
double v6 = v3;
int v7 = 0;
double v8 = Double.NaN;
for(v7=0;(v7<v5);v7=v7+1){{
v8=(v6*2.0);
print(v6);if((v8>1)){{
addArrayEnd(v4,1);
v6=(v8-1.0);
}
} else {if((v8<1)){{
addArrayEnd(v4,0);
v6=v8;
}
}}}
}while((length(v4)<v5)){{
addArrayEnd(v4,0);
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in init: "+e.getMessage()); } return ;} long callCounterg;
protected double fung(simulator.Node p9) { callCounterg++; try {
double v10 = hash(p9);
v10=(v10/Integer.MAX_VALUE);
{if(this.TRUE)return v10;}}
 catch (ArithmeticException e){ print("arithmetic exception in g: "+e.getMessage()); } return Double.NaN;} long callCounterentry;
protected void funentry(simulator.Node p11) { callCounterentry++; try {
funlinearize(p11);}
 catch (ArithmeticException e){ print("arithmetic exception in entry: "+e.getMessage()); } return ;} long callCountertimeout;
protected void funtimeout() { callCountertimeout++; try {
if((((v1!=null?((Edge)(v1)).node:null)!=null)&(id((v1!=null?((Edge)(v1)).node:null))<id(this)))){{
{if ((v1!=null?((Edge)(v1)).node:null)!=null) (v1!=null?((Edge)(v1)).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(v1!=null?((Edge)(v1)).node:null));}
v1=updateVisualization(v1,null,true,"black");
}
}if((((v2!=null?((Edge)(v2)).node:null)!=null)&(id((v2!=null?((Edge)(v2)).node:null))>id(this)))){{
{if ((v2!=null?((Edge)(v2)).node:null)!=null) (v2!=null?((Edge)(v2)).node:null).send("linearize",false,this);}
}
} else {{
{if (this!=null) this.send("linearize",false,(v2!=null?((Edge)(v2)).node:null));}
v2=updateVisualization(v2,null,true,"black");
}
}}
 catch (ArithmeticException e){ print("arithmetic exception in timeout: "+e.getMessage()); } return ;} long callCounterlinearize;
protected void funlinearize(simulator.Node p12) { callCounterlinearize++; try {
if((id(p12)<id(this))){{
if(((v1!=null?((Edge)(v1)).node:null)==null)){{
v1=updateVisualization(v1,p12,true,"black");
}
} else {{
if((id((v1!=null?((Edge)(v1)).node:null))<id(p12))){{
{if (p12!=null) p12.send("linearize",false,(v1!=null?((Edge)(v1)).node:null));}
v1=updateVisualization(v1,p12,true,"black");
}
} else {{
{if ((v1!=null?((Edge)(v1)).node:null)!=null) (v1!=null?((Edge)(v1)).node:null).send("linearize",false,p12);}
}
}}
}}
} else {if((id(p12)>id(this))){{
if(((v2!=null?((Edge)(v2)).node:null)==null)){{
v2=updateVisualization(v2,p12,true,"black");
}
} else {{
if((id((v2!=null?((Edge)(v2)).node:null))>id(p12))){{
{if (p12!=null) p12.send("linearize",false,(v2!=null?((Edge)(v2)).node:null));}
v2=updateVisualization(v2,p12,true,"black");
}
} else {{
{if ((v2!=null?((Edge)(v2)).node:null)!=null) (v2!=null?((Edge)(v2)).node:null).send("linearize",false,p12);}
}
}}
}}
}}}
 catch (ArithmeticException e){ print("arithmetic exception in linearize: "+e.getMessage()); } return ;} }
