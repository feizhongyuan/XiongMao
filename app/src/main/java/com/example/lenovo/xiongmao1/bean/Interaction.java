package com.example.lenovo.xiongmao1.bean;

import java.util.List;

public class Interaction {


    /**
     * data : {"bigImg":[{"image":"轮播图片","title":"标题","url":"专题或正文url","id":"视频id、视频集id 或直播id","type":"1为直播 2为视频  3为视频集 4为专题 5为正文","stype":"1为熊猫单视角直播 2为熊猫直播 3为直播中国单视角直播 4为直播中国直播 5为CCTV直播","order":"序号"}],"area":{"title":"专区标题","image":"专区图片","url":"专区链接","id":"专区id","listscroll":[{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","vid":"视频集id","pid":"视频id","order":"序号"}],"listh":[{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","order":"序号"}],"lists":[{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","order":"序号"}],"topiclist":[{"image":"图片","listurl":"专题页数据地址","title":"标题","order":"序号"}]},"pandaeye":{"pandaeyetitle":"熊猫大标题","pandaeyelogo":"熊猫眼logo","items":[{"title":"熊猫眼标题","bgcolor":"类型背景颜色","texttype":"熊猫眼标题类型","url":"熊猫眼标题类型url","order":"序号"}],"pandaeyelist":"动态接口id"},"pandalive":{"title":"熊猫标题","list":[{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]},"walllive":{"title":"长城标题","list":[{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]},"chinalive":{"title":"直播中国标题","list":[{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]},"interactive":{"title":"互动标题","interactiveone":[{"image":"互动图片","title":"互动标题","url":"互动url","order":"序号"}],"interactivetwo":[{"image":"互动图片","title":"互动标题","url":"互动url","order":"序号"}]},"cctv":{"title":"cctv大标题","listlive":[{"title":"CCTV多语种直播标题","id":"CCTV多语种直播流id","order":"序号"}],"listurl":"动态接口地址"},"list":[{"listUrl":"列表接口url  （维护对应视频列表或图文列表接口）","title":"样式1","type":"1  样式1或者样式2","order":"序号"}]}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * bigImg : [{"image":"轮播图片","title":"标题","url":"专题或正文url","id":"视频id、视频集id 或直播id","type":"1为直播 2为视频  3为视频集 4为专题 5为正文","stype":"1为熊猫单视角直播 2为熊猫直播 3为直播中国单视角直播 4为直播中国直播 5为CCTV直播","order":"序号"}]
         * area : {"title":"专区标题","image":"专区图片","url":"专区链接","id":"专区id","listscroll":[{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","vid":"视频集id","pid":"视频id","order":"序号"}],"listh":[{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","order":"序号"}],"lists":[{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","order":"序号"}],"topiclist":[{"image":"图片","listurl":"专题页数据地址","title":"标题","order":"序号"}]}
         * pandaeye : {"pandaeyetitle":"熊猫大标题","pandaeyelogo":"熊猫眼logo","items":[{"title":"熊猫眼标题","bgcolor":"类型背景颜色","texttype":"熊猫眼标题类型","url":"熊猫眼标题类型url","order":"序号"}],"pandaeyelist":"动态接口id"}
         * pandalive : {"title":"熊猫标题","list":[{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]}
         * walllive : {"title":"长城标题","list":[{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]}
         * chinalive : {"title":"直播中国标题","list":[{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]}
         * interactive : {"title":"互动标题","interactiveone":[{"image":"互动图片","title":"互动标题","url":"互动url","order":"序号"}],"interactivetwo":[{"image":"互动图片","title":"互动标题","url":"互动url","order":"序号"}]}
         * cctv : {"title":"cctv大标题","listlive":[{"title":"CCTV多语种直播标题","id":"CCTV多语种直播流id","order":"序号"}],"listurl":"动态接口地址"}
         * list : [{"listUrl":"列表接口url  （维护对应视频列表或图文列表接口）","title":"样式1","type":"1  样式1或者样式2","order":"序号"}]
         */

        private AreaBean area;
        private PandaeyeBean pandaeye;
        private PandaliveBean pandalive;
        private WallliveBean walllive;
        private ChinaliveBean chinalive;
        private InteractiveBean interactive;
        private CctvBean cctv;
        private List<BigImgBean> bigImg;
        private List<ListBeanXXX> list;

        public AreaBean getArea() {
            return area;
        }

        public void setArea(AreaBean area) {
            this.area = area;
        }

        public PandaeyeBean getPandaeye() {
            return pandaeye;
        }

        public void setPandaeye(PandaeyeBean pandaeye) {
            this.pandaeye = pandaeye;
        }

        public PandaliveBean getPandalive() {
            return pandalive;
        }

        public void setPandalive(PandaliveBean pandalive) {
            this.pandalive = pandalive;
        }

        public WallliveBean getWalllive() {
            return walllive;
        }

        public void setWalllive(WallliveBean walllive) {
            this.walllive = walllive;
        }

        public ChinaliveBean getChinalive() {
            return chinalive;
        }

        public void setChinalive(ChinaliveBean chinalive) {
            this.chinalive = chinalive;
        }

        public InteractiveBean getInteractive() {
            return interactive;
        }

        public void setInteractive(InteractiveBean interactive) {
            this.interactive = interactive;
        }

        public CctvBean getCctv() {
            return cctv;
        }

        public void setCctv(CctvBean cctv) {
            this.cctv = cctv;
        }

        public List<BigImgBean> getBigImg() {
            return bigImg;
        }

        public void setBigImg(List<BigImgBean> bigImg) {
            this.bigImg = bigImg;
        }

        public List<ListBeanXXX> getList() {
            return list;
        }

        public void setList(List<ListBeanXXX> list) {
            this.list = list;
        }

        public static class AreaBean {
            /**
             * title : 专区标题
             * image : 专区图片
             * url : 专区链接
             * id : 专区id
             * listscroll : [{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","vid":"视频集id","pid":"视频id","order":"序号"}]
             * listh : [{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","order":"序号"}]
             * lists : [{"image":"视频图片","url":"视频url","title":"视频标题","videoLength":"视频时长","id":"视频id","order":"序号"}]
             * topiclist : [{"image":"图片","listurl":"专题页数据地址","title":"标题","order":"序号"}]
             */

            private String title;
            private String image;
            private String url;
            private String id;
            private List<ListscrollBean> listscroll;
            private List<ListhBean> listh;
            private List<ListsBean> lists;
            private List<TopiclistBean> topiclist;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public List<ListscrollBean> getListscroll() {
                return listscroll;
            }

            public void setListscroll(List<ListscrollBean> listscroll) {
                this.listscroll = listscroll;
            }

            public List<ListhBean> getListh() {
                return listh;
            }

            public void setListh(List<ListhBean> listh) {
                this.listh = listh;
            }

            public List<ListsBean> getLists() {
                return lists;
            }

            public void setLists(List<ListsBean> lists) {
                this.lists = lists;
            }

            public List<TopiclistBean> getTopiclist() {
                return topiclist;
            }

            public void setTopiclist(List<TopiclistBean> topiclist) {
                this.topiclist = topiclist;
            }

            public static class ListscrollBean {
                /**
                 * image : 视频图片
                 * url : 视频url
                 * title : 视频标题
                 * videoLength : 视频时长
                 * id : 视频id
                 * vid : 视频集id
                 * pid : 视频id
                 * order : 序号
                 */

                private String image;
                private String url;
                private String title;
                private String videoLength;
                private String id;
                private String vid;
                private String pid;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getVideoLength() {
                    return videoLength;
                }

                public void setVideoLength(String videoLength) {
                    this.videoLength = videoLength;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getVid() {
                    return vid;
                }

                public void setVid(String vid) {
                    this.vid = vid;
                }

                public String getPid() {
                    return pid;
                }

                public void setPid(String pid) {
                    this.pid = pid;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }

            public static class ListhBean {
                /**
                 * image : 视频图片
                 * url : 视频url
                 * title : 视频标题
                 * videoLength : 视频时长
                 * id : 视频id
                 * order : 序号
                 */

                private String image;
                private String url;
                private String title;
                private String videoLength;
                private String id;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getVideoLength() {
                    return videoLength;
                }

                public void setVideoLength(String videoLength) {
                    this.videoLength = videoLength;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }

            public static class ListsBean {
                /**
                 * image : 视频图片
                 * url : 视频url
                 * title : 视频标题
                 * videoLength : 视频时长
                 * id : 视频id
                 * order : 序号
                 */

                private String image;
                private String url;
                private String title;
                private String videoLength;
                private String id;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getVideoLength() {
                    return videoLength;
                }

                public void setVideoLength(String videoLength) {
                    this.videoLength = videoLength;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }

            public static class TopiclistBean {
                /**
                 * image : 图片
                 * listurl : 专题页数据地址
                 * title : 标题
                 * order : 序号
                 */

                private String image;
                private String listurl;
                private String title;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getListurl() {
                    return listurl;
                }

                public void setListurl(String listurl) {
                    this.listurl = listurl;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class PandaeyeBean {
            /**
             * pandaeyetitle : 熊猫大标题
             * pandaeyelogo : 熊猫眼logo
             * items : [{"title":"熊猫眼标题","bgcolor":"类型背景颜色","texttype":"熊猫眼标题类型","url":"熊猫眼标题类型url","order":"序号"}]
             * pandaeyelist : 动态接口id
             */

            private String pandaeyetitle;
            private String pandaeyelogo;
            private String pandaeyelist;
            private List<ItemsBean> items;

            public String getPandaeyetitle() {
                return pandaeyetitle;
            }

            public void setPandaeyetitle(String pandaeyetitle) {
                this.pandaeyetitle = pandaeyetitle;
            }

            public String getPandaeyelogo() {
                return pandaeyelogo;
            }

            public void setPandaeyelogo(String pandaeyelogo) {
                this.pandaeyelogo = pandaeyelogo;
            }

            public String getPandaeyelist() {
                return pandaeyelist;
            }

            public void setPandaeyelist(String pandaeyelist) {
                this.pandaeyelist = pandaeyelist;
            }

            public List<ItemsBean> getItems() {
                return items;
            }

            public void setItems(List<ItemsBean> items) {
                this.items = items;
            }

            public static class ItemsBean {
                /**
                 * title : 熊猫眼标题
                 * bgcolor : 类型背景颜色
                 * texttype : 熊猫眼标题类型
                 * url : 熊猫眼标题类型url
                 * order : 序号
                 */

                private String title;
                private String bgcolor;
                private String texttype;
                private String url;
                private String order;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getBgcolor() {
                    return bgcolor;
                }

                public void setBgcolor(String bgcolor) {
                    this.bgcolor = bgcolor;
                }

                public String getTexttype() {
                    return texttype;
                }

                public void setTexttype(String texttype) {
                    this.texttype = texttype;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class PandaliveBean {
            /**
             * title : 熊猫标题
             * list : [{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]
             */

            private String title;
            private List<ListBean> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ListBean> getList() {
                return list;
            }

            public void setList(List<ListBean> list) {
                this.list = list;
            }

            public static class ListBean {
                /**
                 * image : 视频图片
                 * url : 视频url
                 * title : 视频标题
                 * id : 视频id
                 * order : 序号
                 */

                private String image;
                private String url;
                private String title;
                private String id;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class WallliveBean {
            /**
             * title : 长城标题
             * list : [{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]
             */

            private String title;
            private List<ListBeanX> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ListBeanX> getList() {
                return list;
            }

            public void setList(List<ListBeanX> list) {
                this.list = list;
            }

            public static class ListBeanX {
                /**
                 * image : 视频图片
                 * url : 视频url
                 * title : 视频标题
                 * id : 视频id
                 * order : 序号
                 */

                private String image;
                private String url;
                private String title;
                private String id;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class ChinaliveBean {
            /**
             * title : 直播中国标题
             * list : [{"image":"视频图片","url":"视频url","title":"视频标题","id":"视频id","order":"序号"}]
             */

            private String title;
            private List<ListBeanXX> list;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ListBeanXX> getList() {
                return list;
            }

            public void setList(List<ListBeanXX> list) {
                this.list = list;
            }

            public static class ListBeanXX {
                /**
                 * image : 视频图片
                 * url : 视频url
                 * title : 视频标题
                 * id : 视频id
                 * order : 序号
                 */

                private String image;
                private String url;
                private String title;
                private String id;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class InteractiveBean {
            /**
             * title : 互动标题
             * interactiveone : [{"image":"互动图片","title":"互动标题","url":"互动url","order":"序号"}]
             * interactivetwo : [{"image":"互动图片","title":"互动标题","url":"互动url","order":"序号"}]
             */

            private String title;
            private List<InteractiveoneBean> interactiveone;
            private List<InteractivetwoBean> interactivetwo;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<InteractiveoneBean> getInteractiveone() {
                return interactiveone;
            }

            public void setInteractiveone(List<InteractiveoneBean> interactiveone) {
                this.interactiveone = interactiveone;
            }

            public List<InteractivetwoBean> getInteractivetwo() {
                return interactivetwo;
            }

            public void setInteractivetwo(List<InteractivetwoBean> interactivetwo) {
                this.interactivetwo = interactivetwo;
            }

            public static class InteractiveoneBean {
                /**
                 * image : 互动图片
                 * title : 互动标题
                 * url : 互动url
                 * order : 序号
                 */

                private String image;
                private String title;
                private String url;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }

            public static class InteractivetwoBean {
                /**
                 * image : 互动图片
                 * title : 互动标题
                 * url : 互动url
                 * order : 序号
                 */

                private String image;
                private String title;
                private String url;
                private String order;

                public String getImage() {
                    return image;
                }

                public void setImage(String image) {
                    this.image = image;
                }

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class CctvBean {
            /**
             * title : cctv大标题
             * listlive : [{"title":"CCTV多语种直播标题","id":"CCTV多语种直播流id","order":"序号"}]
             * listurl : 动态接口地址
             */

            private String title;
            private String listurl;
            private List<ListliveBean> listlive;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getListurl() {
                return listurl;
            }

            public void setListurl(String listurl) {
                this.listurl = listurl;
            }

            public List<ListliveBean> getListlive() {
                return listlive;
            }

            public void setListlive(List<ListliveBean> listlive) {
                this.listlive = listlive;
            }

            public static class ListliveBean {
                /**
                 * title : CCTV多语种直播标题
                 * id : CCTV多语种直播流id
                 * order : 序号
                 */

                private String title;
                private String id;
                private String order;

                public String getTitle() {
                    return title;
                }

                public void setTitle(String title) {
                    this.title = title;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getOrder() {
                    return order;
                }

                public void setOrder(String order) {
                    this.order = order;
                }
            }
        }

        public static class BigImgBean {
            /**
             * image : 轮播图片
             * title : 标题
             * url : 专题或正文url
             * id : 视频id、视频集id 或直播id
             * type : 1为直播 2为视频  3为视频集 4为专题 5为正文
             * stype : 1为熊猫单视角直播 2为熊猫直播 3为直播中国单视角直播 4为直播中国直播 5为CCTV直播
             * order : 序号
             */

            private String image;
            private String title;
            private String url;
            private String id;
            private String type;
            private String stype;
            private String order;

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getStype() {
                return stype;
            }

            public void setStype(String stype) {
                this.stype = stype;
            }

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }
        }

        public static class ListBeanXXX {
            /**
             * listUrl : 列表接口url  （维护对应视频列表或图文列表接口）
             * title : 样式1
             * type : 1  样式1或者样式2
             * order : 序号
             */

            private String listUrl;
            private String title;
            private String type;
            private String order;

            public String getListUrl() {
                return listUrl;
            }

            public void setListUrl(String listUrl) {
                this.listUrl = listUrl;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getOrder() {
                return order;
            }

            public void setOrder(String order) {
                this.order = order;
            }
        }
    }
}
