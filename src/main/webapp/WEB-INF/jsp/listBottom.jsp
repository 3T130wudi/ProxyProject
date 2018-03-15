<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
</div>
</section>
<script src="js/jquery-1.12.4.js"></script>
<script src="js/bootstrap.min.js"></script>
<script class="include" type="text/javascript" src="js/jquery.dcjqaccordion.2.7.js"></script>
<script src="js/jquery.scrollTo.min.js"></script>
<script src="js/jquery.nicescroll.js" type="text/javascript"></script>
<!--common script for all pages-->
<script src="js/common-scripts.js"></script>

<script>
    //custom select box
    $(function(){
        $('select.styled').customSelect();
    });

</script>

<SCRIPT LANGUAGE="JavaScript">
function sub(btn,a){
var tds = btn.parentElement.parentElement.children;
var td = (tds[0]).innerHTML ;
var td1 = (tds[1]).innerHTML ;
var td2 = (tds[3]).innerHTML ;
document.getElementById('id1').value=td;
document.getElementById('name1').value=td1;
document.getElementById('type1').value=td2;
}
</SCRIPT>

<SCRIPT LANGUAGE="JavaScript">
    function subs(btn){
        var tds = btn.parentElement.parentElement.children;
        var td = (tds[0]).innerHTML ;
        var td1 = (tds[1]).innerHTML ;
        var td2 = (tds[2]).innerHTML ;
        var td4 = (tds[4]).innerHTML ;
        document.getElementById('userid1').value=td;
        document.getElementById('name1').value=td1;
        document.getElementById('roleId1').value=td2;
        document.getElementById('type1').value=td4;
    }
</SCRIPT>

</body>
</html>