(function(){
	Ext.define('SampleApp.view.StoryGridPanel',{
		extend: 'Ext.grid.Panel',
		alias: 'widget.storygridpanel',
		height: 350,
		
		columns : [{
			text: 'ID',
			flex: 1,
			dataIndex: 'id'
		},{
			text: 'Content',
			flex: 1,
			dataIndex: 'content'
		}],
		
		store: Ext.create('Ext.data.Store',{
			fields:['id','content'],
			proxy: {
				type: 'ajax',
				url: '/springmvcsample/sampleApplication/jackson/story',
				reader: {
					type: 'json',
					root: 'contents'
				}
			},
			autoLoad: true
		})
	});
}());