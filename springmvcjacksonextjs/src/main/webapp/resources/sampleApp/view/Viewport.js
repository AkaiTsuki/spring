(function() {
	Ext.define("SampleApp.view.Viewport", {
		extend : "Ext.container.Viewport",
		requires: ["SampleApp.view.StoryGridPanel"],
		
		layout : 'border',
		items: [{
			xtype: 'storygridpanel',
			region: 'center'
		},{
			xtype: 'panel',
			html: 'Copyright@ AkaiTsuki',
			region: 'south'
		}]
	});
}());