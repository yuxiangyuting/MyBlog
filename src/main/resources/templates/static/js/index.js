/**自定义背景颜色
 */

/**渐变色背景
 "*/
$("#body").css(
    "background-image",
    "linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%)"
);
/***/
/**自定义背景图片
 */
/**自定义js代码
 */

$(function () {
    var yiyan = $("#hitokoto").text();
    console.log(yiyan);
    $("#yiyan").text(yiyan);
});
(function (window, document, undefined) {
    var hearts = [];
    window.requestAnimationFrame = (function () {
        return (
            window.requestAnimationFrame ||
            window.webkitRequestAnimationFrame ||
            window.mozRequestAnimationFrame ||
            window.oRequestAnimationFrame ||
            window.msRequestAnimationFrame ||
            function (callback) {
                setTimeout(callback, 1000 / 60);
            }
        );
    })();
    init();

    function init() {
        css(
            ".heart{width: 10px;height: 10px;position: fixed;background: #f00;transform: rotate(45deg);-webkit-transform: rotate(45deg);-moz-transform: rotate(45deg);}.heart:after,.heart:before{content: '';width: inherit;height: inherit;background: inherit;border-radius: 50%;-webkit-border-radius: 50%;-moz-border-radius: 50%;position: absolute;}.heart:after{top: -5px;}.heart:before{left: -5px;}"
        );
        attachEvent();
        gameloop();
    }

    function gameloop() {
        for (var i = 0; i < hearts.length; i++) {
            if (hearts[i].alpha <= 0) {
                document.body.removeChild(hearts[i].el);
                hearts.splice(i, 1);
                continue;
            }
            hearts[i].y--;
            hearts[i].scale += 0.004;
            hearts[i].alpha -= 0.013;
            hearts[i].el.style.cssText =
                "left:" +
                hearts[i].x +
                "px;top:" +
                hearts[i].y +
                "px;opacity:" +
                hearts[i].alpha +
                ";transform:scale(" +
                hearts[i].scale +
                "," +
                hearts[i].scale +
                ") rotate(45deg);background:" +
                hearts[i].color;
        }
        requestAnimationFrame(gameloop);
    }

    function attachEvent() {
        var old = typeof window.onclick === "function" && window.onclick;
        window.onclick = function (event) {
            old && old();
            createHeart(event);
        };
    }

    function createHeart(event) {
        var d = document.createElement("div");
        d.className = "heart";
        hearts.push({
            el: d,
            x: event.clientX - 5,
            y: event.clientY - 5,
            scale: 1,
            alpha: 1,
            color: randomColor(),
        });
        document.body.appendChild(d);
    }

    function css(css) {
        var style = document.createElement("style");
        style.type = "text/css";
        try {
            style.appendChild(document.createTextNode(css));
        } catch (ex) {
            style.styleSheet.cssText = css;
        }
        document.getElementsByTagName("head")[0].appendChild(style);
    }

    function randomColor() {
        return (
            "rgb(" + ~~(Math.random() * 255) +
            "," + ~~(Math.random() * 255) +
            "," + ~~(Math.random() * 255) +
            ")"
        );
    }
})(window, document);
/***/

//设置pjax
var pjax = new Pjax({
    elements: ".pjax,form",
    cacheBust: false,
    debug: false,
    selectors: [
        "title",
        "meta[name=keywords]",
        "meta[name=description]",
        ".p-content-box",
        "#toxBox",
        ".p-right-ad-box",
        ".loadJs",
    ],
});

(adsbygoogle = window.adsbygoogle || []).push({});

function closeNotice() {
    $(".p-notice-box").hide();
}

var chakhsu = function (r) {
    function t() {
        return b[Math.floor(Math.random() * b.length)];
    }

    function e() {
        return String.fromCharCode(94 * Math.random() + 33);
    }

    function n(r) {
        for (
            var n = document.createDocumentFragment(), i = 0;
            r > i;
            i++
        ) {
            var l = document.createElement("span");
            (l.textContent = e()),
                (l.style.color = t()),
                n.appendChild(l);
        }
        return n;
    }

    function i() {
        var t = o[c.skillI];
        c.step
            ? c.step--
            : ((c.step = g),
                c.prefixP < l.length
                    ? (c.prefixP >= 0 && (c.text += l[c.prefixP]),
                        c.prefixP++)
                    : "forward" === c.direction
                    ? c.skillP < t.length
                        ? ((c.text += t[c.skillP]), c.skillP++)
                        : c.delay
                            ? c.delay--
                            : ((c.direction = "backward"), (c.delay = a))
                    : c.skillP > 0
                        ? ((c.text = c.text.slice(0, -1)), c.skillP--)
                        : ((c.skillI = (c.skillI + 1) % o.length),
                            (c.direction = "forward"))),
            (r.textContent = c.text),
            r.appendChild(
                n(
                    c.prefixP < l.length
                        ? Math.min(s, s + c.prefixP)
                        : Math.min(s, t.length - c.skillP)
                )
            ),
            setTimeout(i, d);
    }

    var l = "♥",
        o = ["天下皆白，唯我独黑"].map(function (r) {
            return r + "";
        }),
        a = 2,
        g = 1,
        s = 5,
        d = 75,
        b = [
            "rgb(110,64,170)",
            "rgb(150,61,179)",
            "rgb(191,60,175)",
            "rgb(228,65,157)",
            "rgb(254,75,131)",
            "rgb(255,94,99)",
            "rgb(255,120,71)",
            "rgb(251,150,51)",
            "rgb(226,183,47)",
            "rgb(198,214,60)",
            "rgb(175,240,91)",
            "rgb(127,246,88)",
            "rgb(82,246,103)",
            "rgb(48,239,130)",
            "rgb(29,223,163)",
            "rgb(26,199,194)",
            "rgb(35,171,216)",
            "rgb(54,140,225)",
            "rgb(76,110,219)",
            "rgb(96,84,200)",
        ],
        c = {
            text: "",
            prefixP: -s,
            skillI: 0,
            skillP: 0,
            direction: "forward",
            delay: a,
            step: g,
        };
    i();
};
chakhsu(document.getElementById("chakhsu"));
/**自定义js代码
 */
(function (window, document, undefined) {
    var hearts = [];
    window.requestAnimationFrame = (function () {
        return (
            window.requestAnimationFrame ||
            window.webkitRequestAnimationFrame ||
            window.mozRequestAnimationFrame ||
            window.oRequestAnimationFrame ||
            window.msRequestAnimationFrame ||
            function (callback) {
                setTimeout(callback, 1000 / 60);
            }
        );
    })();
    init();

    function init() {
        css(
            ".heart{width: 10px;height: 10px;position: fixed;background: #f00;transform: rotate(45deg);-webkit-transform: rotate(45deg);-moz-transform: rotate(45deg);}.heart:after,.heart:before{content: '';width: inherit;height: inherit;background: inherit;border-radius: 50%;-webkit-border-radius: 50%;-moz-border-radius: 50%;position: absolute;}.heart:after{top: -5px;}.heart:before{left: -5px;}"
        );
        attachEvent();
        gameloop();
    }

    function gameloop() {
        for (var i = 0; i < hearts.length; i++) {
            if (hearts[i].alpha <= 0) {
                document.body.removeChild(hearts[i].el);
                hearts.splice(i, 1);
                continue;
            }
            hearts[i].y--;
            hearts[i].scale += 0.004;
            hearts[i].alpha -= 0.013;
            hearts[i].el.style.cssText =
                "left:" +
                hearts[i].x +
                "px;top:" +
                hearts[i].y +
                "px;opacity:" +
                hearts[i].alpha +
                ";transform:scale(" +
                hearts[i].scale +
                "," +
                hearts[i].scale +
                ") rotate(45deg);background:" +
                hearts[i].color;
        }
        requestAnimationFrame(gameloop);
    }

    function attachEvent() {
        var old = typeof window.onclick === "function" && window.onclick;
        window.onclick = function (event) {
            old && old();
            createHeart(event);
        };
    }

    function createHeart(event) {
        var d = document.createElement("div");
        d.className = "heart";
        hearts.push({
            el: d,
            x: event.clientX - 5,
            y: event.clientY - 5,
            scale: 1,
            alpha: 1,
            color: randomColor(),
        });
        document.body.appendChild(d);
    }

    function css(css) {
        var style = document.createElement("style");
        style.type = "text/css";
        try {
            style.appendChild(document.createTextNode(css));
        } catch (ex) {
            style.styleSheet.cssText = css;
        }
        document.getElementsByTagName("head")[0].appendChild(style);
    }

    function randomColor() {
        return (
            "rgb(" + ~~(Math.random() * 255) +
            "," + ~~(Math.random() * 255) +
            "," + ~~(Math.random() * 255) +
            ")"
        );
    }
})(window, document);
/***/

/**自定义盒子宽度
 */
$(".p-box").css("width", "80%");
/***/

var isAutoPlay = JSON.parse("false ");
//音乐配置
var player = new skPlayer({
    autoplay: isAutoPlay,
    listshow: false,
    mode: "listloop",
    music: {
        type: "cloud",
        source: "2764311047 ",
    },
});