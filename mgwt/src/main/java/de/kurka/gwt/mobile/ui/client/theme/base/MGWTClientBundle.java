package de.kurka.gwt.mobile.ui.client.theme.base;

import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.DataResource;

public interface MGWTClientBundle extends ClientBundle {

	@Source("css/progressbar.css")
	ProgressBarCss getProgressBarCss();

	@Source("css/progressindicator.css")
	ProgressIndicatorCss getProgressIndicatorCss();

	@Source("css/headerpanel.css")
	HeaderPanelCss getHeaderPanelCss();

	@Source("css/headerbutton.css")
	HeaderButtonCss getHeaderButtonCss();

	@Source("css/slider.css")
	SliderCss getSliderCss();

	@Source("css/list.css")
	ListCss getListCss();

	@Source("css/searchbox.css")
	MSearchBoxCss getSearchBoxCss();

	@Source("css/buttonbar.css")
	ButtonBarCss getButtonBarCss();

	@Source("resources/buttons/UIButtonBarAction.png")
	DataResource buttonBarActionImage();

	@Source("resources/buttons/UIButtonBarArrowDown.png")
	DataResource buttonBarArrowDownImage();

	@Source("resources/buttons/UIButtonBarArrowUp.png")
	DataResource buttonBarArrowUpImage();

	@Source("resources/buttons/UIButtonBarArrowLeft.png")
	DataResource buttonBarArrowLeftImage();

	@Source("resources/buttons/UIButtonBarArrowRight.png")
	DataResource buttonBarArrowRightImage();

	@Source("resources/buttons/UIButtonBarBookmarks.png")
	DataResource buttonBarBookmarksImage();

	@Source("resources/buttons/UIButtonBarCamera.png")
	DataResource buttonBarCameraImage();

	@Source("resources/buttons/UIButtonBarCompose.png")
	DataResource buttonBarComposeImage();

	@Source("resources/buttons/UIButtonBarContactAdd.png")
	DataResource buttonBarContactAddImage();

	@Source("resources/buttons/UIButtonBarDelete.png")
	DataResource buttonBarDeleteImage();

	@Source("resources/buttons/UIButtonBarFastForward.png")
	DataResource buttonBarFastForwardImage();

	@Source("resources/buttons/UIButtonBarInfo.png")
	DataResource buttonBarInfoImage();

	@Source("resources/buttons/UIButtonBarLocate.png")
	DataResource buttonBarLocateImage();

	@Source("resources/buttons/UIButtonBarNew.png")
	DataResource buttonBarNewImage();

	@Source("resources/buttons/UIButtonBarNextSlide.png")
	DataResource buttonBarNextSlideImage();

	@Source("resources/buttons/UIButtonBarOrganize.png")
	DataResource buttonBarOrganizeImage();

	@Source("resources/buttons/UIButtonBarPause.png")
	DataResource buttonBarPauseImage();

	@Source("resources/buttons/UIButtonBarPlay.png")
	DataResource buttonBarPlayImage();

	@Source("resources/buttons/UIButtonBarPlus.png")
	DataResource buttonBarPlusImage();

	@Source("resources/buttons/UIButtonBarPressedIndicator.png")
	DataResource buttonBarPressedIndicatorImage();

	@Source("resources/buttons/UIButtonBarPreviousSlide.png")
	DataResource buttonBarPreviousSlideImage();

	@Source("resources/buttons/UIButtonBarRefresh.png")
	DataResource buttonBarRefreshImage();

	@Source("resources/buttons/UIButtonBarReply.png")
	DataResource buttonBarReplyImage();

	@Source("resources/buttons/UIButtonBarRewind.png")
	DataResource buttonBarRewindImage();

	@Source("resources/buttons/UIButtonBarSearch.png")
	DataResource buttonBarSearchImage();

	@Source("resources/buttons/UIButtonBarStop.png")
	DataResource buttonBarStopImage();

	@Source("resources/buttons/UIButtonBarTrash.png")
	DataResource buttonBarTrashImage();

}
