.class public final Lm/L;
.super Lm/C0;
.source "SourceFile"

# interfaces
.implements Lm/N;


# instance fields
.field public S:Ljava/lang/CharSequence;

.field public T:Lm/I;

.field public final U:Landroid/graphics/Rect;

.field public V:I

.field public final synthetic W:Lm/O;


# direct methods
.method public constructor <init>(Lm/O;Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    .line 1
    iput-object p1, p0, Lm/L;->W:Lm/O;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const v1, 0x7f03042a

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p2, p3, v1, v0}, Lm/C0;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;II)V

    .line 8
    .line 9
    .line 10
    new-instance p2, Landroid/graphics/Rect;

    .line 11
    .line 12
    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, Lm/L;->U:Landroid/graphics/Rect;

    .line 16
    .line 17
    iput-object p1, p0, Lm/C0;->E:Landroid/view/View;

    .line 18
    .line 19
    const/4 p1, 0x1

    .line 20
    iput-boolean p1, p0, Lm/C0;->O:Z

    .line 21
    .line 22
    iget-object p2, p0, Lm/C0;->P:Lm/y;

    .line 23
    .line 24
    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setFocusable(Z)V

    .line 25
    .line 26
    .line 27
    new-instance p1, Lm/J;

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    invoke-direct {p1, p2, p0}, Lm/J;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lm/C0;->F:Landroid/widget/AdapterView$OnItemClickListener;

    .line 34
    .line 35
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm/L;->S:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-void
.end method

.method public final i(I)V
    .locals 0

    .line 1
    iput p1, p0, Lm/L;->V:I

    .line 2
    .line 3
    return-void
.end method

.method public final k(II)V
    .locals 4

    .line 1
    iget-object v0, p0, Lm/C0;->P:Lm/y;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    invoke-virtual {p0}, Lm/L;->s()V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x2

    .line 11
    iget-object v3, p0, Lm/C0;->P:Lm/y;

    .line 12
    .line 13
    invoke-virtual {v3, v2}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lm/C0;->c()V

    .line 17
    .line 18
    .line 19
    iget-object v2, p0, Lm/C0;->s:Lm/p0;

    .line 20
    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p1}, Landroid/view/View;->setTextDirection(I)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p2}, Landroid/view/View;->setTextAlignment(I)V

    .line 29
    .line 30
    .line 31
    iget-object p1, p0, Lm/L;->W:Lm/O;

    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/widget/AdapterView;->getSelectedItemPosition()I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    iget-object v2, p0, Lm/C0;->s:Lm/p0;

    .line 38
    .line 39
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    const/4 v0, 0x0

    .line 48
    invoke-virtual {v2, v0}, Lm/p0;->setListSelectionHidden(Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2, p2}, Landroid/widget/AdapterView;->setSelection(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Landroid/widget/AbsListView;->getChoiceMode()I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    invoke-virtual {v2, p2, v3}, Landroid/widget/AbsListView;->setItemChecked(IZ)V

    .line 61
    .line 62
    .line 63
    :cond_0
    if-eqz v1, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    if-eqz p1, :cond_2

    .line 71
    .line 72
    new-instance p2, Ll/d;

    .line 73
    .line 74
    const/4 v0, 0x3

    .line 75
    invoke-direct {p2, v0, p0}, Ll/d;-><init>(ILjava/lang/Object;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1, p2}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    .line 79
    .line 80
    .line 81
    new-instance p1, Lm/K;

    .line 82
    .line 83
    invoke-direct {p1, p0, p2}, Lm/K;-><init>(Lm/L;Ll/d;)V

    .line 84
    .line 85
    .line 86
    iget-object p2, p0, Lm/C0;->P:Lm/y;

    .line 87
    .line 88
    invoke-virtual {p2, p1}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 89
    .line 90
    .line 91
    :cond_2
    :goto_0
    return-void
.end method

.method public final o()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    iget-object v0, p0, Lm/L;->S:Ljava/lang/CharSequence;

    .line 2
    .line 3
    return-object v0
.end method

.method public final p(Landroid/widget/ListAdapter;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lm/C0;->p(Landroid/widget/ListAdapter;)V

    .line 2
    .line 3
    .line 4
    check-cast p1, Lm/I;

    .line 5
    .line 6
    iput-object p1, p0, Lm/L;->T:Lm/I;

    .line 7
    .line 8
    return-void
.end method

.method public final s()V
    .locals 10

    .line 1
    iget-object v0, p0, Lm/L;->W:Lm/O;

    .line 2
    .line 3
    iget-object v1, v0, Lm/O;->x:Landroid/graphics/Rect;

    .line 4
    .line 5
    iget-object v2, p0, Lm/C0;->P:Lm/y;

    .line 6
    .line 7
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const/4 v4, 0x1

    .line 12
    if-eqz v3, :cond_1

    .line 13
    .line 14
    invoke-virtual {v3, v1}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 15
    .line 16
    .line 17
    sget-boolean v3, Lm/g1;->a:Z

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-ne v3, v4, :cond_0

    .line 24
    .line 25
    iget v3, v1, Landroid/graphics/Rect;->right:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    iget v3, v1, Landroid/graphics/Rect;->left:I

    .line 29
    .line 30
    neg-int v3, v3

    .line 31
    goto :goto_0

    .line 32
    :cond_1
    const/4 v3, 0x0

    .line 33
    iput v3, v1, Landroid/graphics/Rect;->right:I

    .line 34
    .line 35
    iput v3, v1, Landroid/graphics/Rect;->left:I

    .line 36
    .line 37
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getPaddingLeft()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    invoke-virtual {v0}, Landroid/view/View;->getPaddingRight()I

    .line 42
    .line 43
    .line 44
    move-result v6

    .line 45
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    iget v8, v0, Lm/O;->w:I

    .line 50
    .line 51
    const/4 v9, -0x2

    .line 52
    if-ne v8, v9, :cond_3

    .line 53
    .line 54
    iget-object v8, p0, Lm/L;->T:Lm/I;

    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/widget/PopupWindow;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    invoke-virtual {v0, v8, v2}, Lm/O;->a(Landroid/widget/SpinnerAdapter;Landroid/graphics/drawable/Drawable;)I

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v8

    .line 68
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 73
    .line 74
    .line 75
    move-result-object v8

    .line 76
    iget v8, v8, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 77
    .line 78
    iget v9, v1, Landroid/graphics/Rect;->left:I

    .line 79
    .line 80
    sub-int/2addr v8, v9

    .line 81
    iget v1, v1, Landroid/graphics/Rect;->right:I

    .line 82
    .line 83
    sub-int/2addr v8, v1

    .line 84
    if-le v2, v8, :cond_2

    .line 85
    .line 86
    move v2, v8

    .line 87
    :cond_2
    sub-int v1, v7, v5

    .line 88
    .line 89
    sub-int/2addr v1, v6

    .line 90
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    invoke-virtual {p0, v1}, Lm/C0;->r(I)V

    .line 95
    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_3
    const/4 v1, -0x1

    .line 99
    if-ne v8, v1, :cond_4

    .line 100
    .line 101
    sub-int v1, v7, v5

    .line 102
    .line 103
    sub-int/2addr v1, v6

    .line 104
    invoke-virtual {p0, v1}, Lm/C0;->r(I)V

    .line 105
    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_4
    invoke-virtual {p0, v8}, Lm/C0;->r(I)V

    .line 109
    .line 110
    .line 111
    :goto_1
    sget-boolean v1, Lm/g1;->a:Z

    .line 112
    .line 113
    invoke-virtual {v0}, Landroid/view/View;->getLayoutDirection()I

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-ne v0, v4, :cond_5

    .line 118
    .line 119
    sub-int/2addr v7, v6

    .line 120
    iget v0, p0, Lm/C0;->u:I

    .line 121
    .line 122
    sub-int/2addr v7, v0

    .line 123
    iget v0, p0, Lm/L;->V:I

    .line 124
    .line 125
    sub-int/2addr v7, v0

    .line 126
    add-int/2addr v7, v3

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    iget v0, p0, Lm/L;->V:I

    .line 129
    .line 130
    add-int/2addr v5, v0

    .line 131
    add-int v7, v5, v3

    .line 132
    .line 133
    :goto_2
    iput v7, p0, Lm/C0;->v:I

    .line 134
    .line 135
    return-void
.end method
