.class public final Lcom/google/android/material/datepicker/l;
.super Lcom/google/android/material/datepicker/v;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/android/material/datepicker/v;"
    }
.end annotation


# instance fields
.field public l0:I

.field public m0:Lcom/google/android/material/datepicker/b;

.field public n0:Lcom/google/android/material/datepicker/q;

.field public o0:I

.field public p0:Lcom/google/android/material/datepicker/c;

.field public q0:Landroidx/recyclerview/widget/RecyclerView;

.field public r0:Landroidx/recyclerview/widget/RecyclerView;

.field public s0:Landroid/view/View;

.field public t0:Landroid/view/View;

.field public u0:Landroid/view/View;

.field public v0:Landroid/view/View;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/material/datepicker/v;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final G(Lcom/google/android/material/datepicker/q;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ld2/z;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lcom/google/android/material/datepicker/u;

    .line 8
    .line 9
    iget-object v1, v0, Lcom/google/android/material/datepicker/u;->c:Lcom/google/android/material/datepicker/b;

    .line 10
    .line 11
    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->q:Lcom/google/android/material/datepicker/q;

    .line 12
    .line 13
    invoke-virtual {v1, p1}, Lcom/google/android/material/datepicker/q;->d(Lcom/google/android/material/datepicker/q;)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    iget-object v2, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 18
    .line 19
    iget-object v0, v0, Lcom/google/android/material/datepicker/u;->c:Lcom/google/android/material/datepicker/b;

    .line 20
    .line 21
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->q:Lcom/google/android/material/datepicker/q;

    .line 22
    .line 23
    invoke-virtual {v0, v2}, Lcom/google/android/material/datepicker/q;->d(Lcom/google/android/material/datepicker/q;)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    sub-int v0, v1, v0

    .line 28
    .line 29
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-le v2, v3, :cond_0

    .line 37
    .line 38
    move v2, v5

    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move v2, v4

    .line 41
    :goto_0
    if-lez v0, :cond_1

    .line 42
    .line 43
    move v4, v5

    .line 44
    :cond_1
    iput-object p1, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 45
    .line 46
    if-eqz v2, :cond_2

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    add-int/lit8 v0, v1, -0x3

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->Y(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 58
    .line 59
    new-instance v0, LE1/j;

    .line 60
    .line 61
    const/4 v2, 0x1

    .line 62
    invoke-direct {v0, v1, v2, p0}, LE1/j;-><init>(IILjava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_2
    if-eqz v2, :cond_3

    .line 70
    .line 71
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 72
    .line 73
    add-int/lit8 v0, v1, 0x3

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->Y(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 79
    .line 80
    new-instance v0, LE1/j;

    .line 81
    .line 82
    const/4 v2, 0x1

    .line 83
    invoke-direct {v0, v1, v2, p0}, LE1/j;-><init>(IILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :cond_3
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 91
    .line 92
    new-instance v0, LE1/j;

    .line 93
    .line 94
    const/4 v2, 0x1

    .line 95
    invoke-direct {v0, v1, v2, p0}, LE1/j;-><init>(IILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {p1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 99
    .line 100
    .line 101
    return-void
.end method

.method public final H(I)V
    .locals 4

    .line 1
    iput p1, p0, Lcom/google/android/material/datepicker/l;->o0:I

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ld2/G;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    .line 17
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ld2/z;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Lcom/google/android/material/datepicker/A;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 24
    .line 25
    iget v3, v3, Lcom/google/android/material/datepicker/q;->s:I

    .line 26
    .line 27
    iget-object v0, v0, Lcom/google/android/material/datepicker/A;->c:Lcom/google/android/material/datepicker/l;

    .line 28
    .line 29
    iget-object v0, v0, Lcom/google/android/material/datepicker/l;->m0:Lcom/google/android/material/datepicker/b;

    .line 30
    .line 31
    iget-object v0, v0, Lcom/google/android/material/datepicker/b;->q:Lcom/google/android/material/datepicker/q;

    .line 32
    .line 33
    iget v0, v0, Lcom/google/android/material/datepicker/q;->s:I

    .line 34
    .line 35
    sub-int/2addr v3, v0

    .line 36
    invoke-virtual {p1, v3}, Ld2/G;->n0(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->u0:Landroid/view/View;

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 42
    .line 43
    .line 44
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->v0:Landroid/view/View;

    .line 45
    .line 46
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->s0:Landroid/view/View;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->t0:Landroid/view/View;

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_0
    const/4 v0, 0x1

    .line 61
    if-ne p1, v0, :cond_1

    .line 62
    .line 63
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->u0:Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 66
    .line 67
    .line 68
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->v0:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    .line 72
    .line 73
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->s0:Landroid/view/View;

    .line 74
    .line 75
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->t0:Landroid/view/View;

    .line 79
    .line 80
    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Lcom/google/android/material/datepicker/l;->G(Lcom/google/android/material/datepicker/q;)V

    .line 86
    .line 87
    .line 88
    :cond_1
    return-void
.end method

.method public final s(Landroid/os/Bundle;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, LJ1/q;->s(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    iget-object p1, p0, LJ1/q;->v:Landroid/os/Bundle;

    .line 7
    .line 8
    :cond_0
    const-string v0, "THEME_RES_ID_KEY"

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    iput v0, p0, Lcom/google/android/material/datepicker/l;->l0:I

    .line 15
    .line 16
    const-string v0, "GRID_SELECTOR_KEY"

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 25
    .line 26
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    check-cast v0, Lcom/google/android/material/datepicker/b;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/google/android/material/datepicker/l;->m0:Lcom/google/android/material/datepicker/b;

    .line 33
    .line 34
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    if-nez v0, :cond_1

    .line 41
    .line 42
    const-string v0, "CURRENT_MONTH_KEY"

    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    check-cast p1, Lcom/google/android/material/datepicker/q;

    .line 49
    .line 50
    iput-object p1, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    new-instance p1, Ljava/lang/ClassCastException;

    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 56
    .line 57
    .line 58
    throw p1

    .line 59
    :cond_2
    new-instance p1, Ljava/lang/ClassCastException;

    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/ClassCastException;-><init>()V

    .line 62
    .line 63
    .line 64
    throw p1
.end method

.method public final t(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    .line 1
    new-instance v0, Landroid/view/ContextThemeWrapper;

    .line 2
    .line 3
    invoke-virtual {p0}, LJ1/q;->i()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iget v2, p0, Lcom/google/android/material/datepicker/l;->l0:I

    .line 8
    .line 9
    invoke-direct {v0, v1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Lcom/google/android/material/datepicker/c;

    .line 13
    .line 14
    invoke-direct {v1, v0}, Lcom/google/android/material/datepicker/c;-><init>(Landroid/content/Context;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcom/google/android/material/datepicker/l;->p0:Lcom/google/android/material/datepicker/c;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/view/LayoutInflater;->cloneInContext(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->m0:Lcom/google/android/material/datepicker/b;

    .line 24
    .line 25
    iget-object v1, v1, Lcom/google/android/material/datepicker/b;->q:Lcom/google/android/material/datepicker/q;

    .line 26
    .line 27
    const v2, 0x101020d

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lcom/google/android/material/datepicker/n;->J(Landroid/content/Context;I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v3, :cond_0

    .line 37
    .line 38
    const v3, 0x7f0c0054

    .line 39
    .line 40
    .line 41
    move v6, v5

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const v3, 0x7f0c004f

    .line 44
    .line 45
    .line 46
    move v6, v4

    .line 47
    :goto_0
    invoke-virtual {p1, v3, p2, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p0}, LJ1/q;->C()Landroid/content/Context;

    .line 52
    .line 53
    .line 54
    move-result-object p2

    .line 55
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    const v3, 0x7f06028e

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    const v7, 0x7f06028f

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    add-int/2addr v7, v3

    .line 74
    const v3, 0x7f06028d

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    add-int/2addr v3, v7

    .line 82
    const v7, 0x7f06027e

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 86
    .line 87
    .line 88
    move-result v7

    .line 89
    sget v8, Lcom/google/android/material/datepicker/r;->d:I

    .line 90
    .line 91
    const v9, 0x7f060279

    .line 92
    .line 93
    .line 94
    invoke-virtual {p2, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 95
    .line 96
    .line 97
    move-result v9

    .line 98
    mul-int/2addr v9, v8

    .line 99
    sub-int/2addr v8, v5

    .line 100
    const v10, 0x7f06028c

    .line 101
    .line 102
    .line 103
    invoke-virtual {p2, v10}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 104
    .line 105
    .line 106
    move-result v10

    .line 107
    mul-int/2addr v10, v8

    .line 108
    add-int/2addr v10, v9

    .line 109
    const v8, 0x7f060276

    .line 110
    .line 111
    .line 112
    invoke-virtual {p2, v8}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    .line 113
    .line 114
    .line 115
    move-result p2

    .line 116
    add-int/2addr v3, v7

    .line 117
    add-int/2addr v3, v10

    .line 118
    add-int/2addr v3, p2

    .line 119
    invoke-virtual {p1, v3}, Landroid/view/View;->setMinimumHeight(I)V

    .line 120
    .line 121
    .line 122
    const p2, 0x7f090136

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    check-cast p2, Landroid/widget/GridView;

    .line 130
    .line 131
    new-instance v3, LA1/f;

    .line 132
    .line 133
    const/4 v7, 0x1

    .line 134
    invoke-direct {v3, v7}, LA1/f;-><init>(I)V

    .line 135
    .line 136
    .line 137
    invoke-static {p2, v3}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 138
    .line 139
    .line 140
    iget-object v3, p0, Lcom/google/android/material/datepicker/l;->m0:Lcom/google/android/material/datepicker/b;

    .line 141
    .line 142
    iget v3, v3, Lcom/google/android/material/datepicker/b;->u:I

    .line 143
    .line 144
    new-instance v7, Lcom/google/android/material/datepicker/e;

    .line 145
    .line 146
    if-lez v3, :cond_1

    .line 147
    .line 148
    invoke-direct {v7, v3}, Lcom/google/android/material/datepicker/e;-><init>(I)V

    .line 149
    .line 150
    .line 151
    goto :goto_1

    .line 152
    :cond_1
    invoke-direct {v7}, Lcom/google/android/material/datepicker/e;-><init>()V

    .line 153
    .line 154
    .line 155
    :goto_1
    invoke-virtual {p2, v7}, Landroid/widget/GridView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 156
    .line 157
    .line 158
    iget v1, v1, Lcom/google/android/material/datepicker/q;->t:I

    .line 159
    .line 160
    invoke-virtual {p2, v1}, Landroid/widget/GridView;->setNumColumns(I)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p2, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 164
    .line 165
    .line 166
    const p2, 0x7f090139

    .line 167
    .line 168
    .line 169
    invoke-virtual {p1, p2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 170
    .line 171
    .line 172
    move-result-object p2

    .line 173
    check-cast p2, Landroidx/recyclerview/widget/RecyclerView;

    .line 174
    .line 175
    iput-object p2, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 176
    .line 177
    new-instance p2, Lcom/google/android/material/datepicker/g;

    .line 178
    .line 179
    invoke-direct {p2, p0, v6, v6}, Lcom/google/android/material/datepicker/g;-><init>(Lcom/google/android/material/datepicker/l;II)V

    .line 180
    .line 181
    .line 182
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 183
    .line 184
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ld2/G;)V

    .line 185
    .line 186
    .line 187
    iget-object p2, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    const-string v1, "MONTHS_VIEW_GROUP_TAG"

    .line 190
    .line 191
    invoke-virtual {p2, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance p2, Lcom/google/android/material/datepicker/u;

    .line 195
    .line 196
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->m0:Lcom/google/android/material/datepicker/b;

    .line 197
    .line 198
    new-instance v3, Lk3/c;

    .line 199
    .line 200
    invoke-direct {v3, p0}, Lk3/c;-><init>(Ljava/lang/Object;)V

    .line 201
    .line 202
    .line 203
    invoke-direct {p2, v0, v1, v3}, Lcom/google/android/material/datepicker/u;-><init>(Landroid/view/ContextThemeWrapper;Lcom/google/android/material/datepicker/b;Lk3/c;)V

    .line 204
    .line 205
    .line 206
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 207
    .line 208
    invoke-virtual {v1, p2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ld2/z;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v0}, Landroid/view/ContextThemeWrapper;->getResources()Landroid/content/res/Resources;

    .line 212
    .line 213
    .line 214
    move-result-object v1

    .line 215
    const v3, 0x7f0a0035

    .line 216
    .line 217
    .line 218
    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getInteger(I)I

    .line 219
    .line 220
    .line 221
    move-result v1

    .line 222
    const v3, 0x7f09013c

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 226
    .line 227
    .line 228
    move-result-object v4

    .line 229
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 230
    .line 231
    iput-object v4, p0, Lcom/google/android/material/datepicker/l;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 232
    .line 233
    if-eqz v4, :cond_2

    .line 234
    .line 235
    invoke-virtual {v4, v5}, Landroidx/recyclerview/widget/RecyclerView;->setHasFixedSize(Z)V

    .line 236
    .line 237
    .line 238
    iget-object v4, p0, Lcom/google/android/material/datepicker/l;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 239
    .line 240
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 241
    .line 242
    invoke-direct {v6, v1}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {v4, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ld2/G;)V

    .line 246
    .line 247
    .line 248
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 249
    .line 250
    new-instance v4, Lcom/google/android/material/datepicker/A;

    .line 251
    .line 252
    invoke-direct {v4, p0}, Lcom/google/android/material/datepicker/A;-><init>(Lcom/google/android/material/datepicker/l;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Ld2/z;)V

    .line 256
    .line 257
    .line 258
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->q0:Landroidx/recyclerview/widget/RecyclerView;

    .line 259
    .line 260
    new-instance v4, Lcom/google/android/material/datepicker/h;

    .line 261
    .line 262
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 263
    .line 264
    .line 265
    const/4 v6, 0x0

    .line 266
    invoke-static {v6}, Lcom/google/android/material/datepicker/y;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 267
    .line 268
    .line 269
    invoke-static {v6}, Lcom/google/android/material/datepicker/y;->c(Ljava/util/Calendar;)Ljava/util/Calendar;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->g(Ld2/E;)V

    .line 273
    .line 274
    .line 275
    :cond_2
    const v1, 0x7f09012f

    .line 276
    .line 277
    .line 278
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 279
    .line 280
    .line 281
    move-result-object v4

    .line 282
    if-eqz v4, :cond_3

    .line 283
    .line 284
    invoke-virtual {p1, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 285
    .line 286
    .line 287
    move-result-object v1

    .line 288
    check-cast v1, Lcom/google/android/material/button/MaterialButton;

    .line 289
    .line 290
    const-string v4, "SELECTOR_TOGGLE_TAG"

    .line 291
    .line 292
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 293
    .line 294
    .line 295
    new-instance v4, Lcom/google/android/material/datepicker/i;

    .line 296
    .line 297
    const/4 v6, 0x0

    .line 298
    invoke-direct {v4, v6, p0}, Lcom/google/android/material/datepicker/i;-><init>(ILjava/lang/Object;)V

    .line 299
    .line 300
    .line 301
    invoke-static {v1, v4}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 302
    .line 303
    .line 304
    const v4, 0x7f090131

    .line 305
    .line 306
    .line 307
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    iput-object v4, p0, Lcom/google/android/material/datepicker/l;->s0:Landroid/view/View;

    .line 312
    .line 313
    const-string v6, "NAVIGATION_PREV_TAG"

    .line 314
    .line 315
    invoke-virtual {v4, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    const v4, 0x7f090130

    .line 319
    .line 320
    .line 321
    invoke-virtual {p1, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 322
    .line 323
    .line 324
    move-result-object v4

    .line 325
    iput-object v4, p0, Lcom/google/android/material/datepicker/l;->t0:Landroid/view/View;

    .line 326
    .line 327
    const-string v6, "NAVIGATION_NEXT_TAG"

    .line 328
    .line 329
    invoke-virtual {v4, v6}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 333
    .line 334
    .line 335
    move-result-object v3

    .line 336
    iput-object v3, p0, Lcom/google/android/material/datepicker/l;->u0:Landroid/view/View;

    .line 337
    .line 338
    const v3, 0x7f090135

    .line 339
    .line 340
    .line 341
    invoke-virtual {p1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 342
    .line 343
    .line 344
    move-result-object v3

    .line 345
    iput-object v3, p0, Lcom/google/android/material/datepicker/l;->v0:Landroid/view/View;

    .line 346
    .line 347
    invoke-virtual {p0, v5}, Lcom/google/android/material/datepicker/l;->H(I)V

    .line 348
    .line 349
    .line 350
    iget-object v3, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 351
    .line 352
    invoke-virtual {v3}, Lcom/google/android/material/datepicker/q;->c()Ljava/lang/String;

    .line 353
    .line 354
    .line 355
    move-result-object v3

    .line 356
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 357
    .line 358
    .line 359
    iget-object v3, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 360
    .line 361
    new-instance v4, Lcom/google/android/material/datepicker/j;

    .line 362
    .line 363
    invoke-direct {v4, p0, p2, v1}, Lcom/google/android/material/datepicker/j;-><init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/u;Lcom/google/android/material/button/MaterialButton;)V

    .line 364
    .line 365
    .line 366
    invoke-virtual {v3, v4}, Landroidx/recyclerview/widget/RecyclerView;->h(Ld2/J;)V

    .line 367
    .line 368
    .line 369
    new-instance v3, Lcom/google/android/material/datepicker/k;

    .line 370
    .line 371
    const/4 v4, 0x0

    .line 372
    invoke-direct {v3, v4, p0}, Lcom/google/android/material/datepicker/k;-><init>(ILjava/lang/Object;)V

    .line 373
    .line 374
    .line 375
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 376
    .line 377
    .line 378
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->t0:Landroid/view/View;

    .line 379
    .line 380
    new-instance v3, Lcom/google/android/material/datepicker/f;

    .line 381
    .line 382
    const/4 v4, 0x1

    .line 383
    invoke-direct {v3, p0, p2, v4}, Lcom/google/android/material/datepicker/f;-><init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/u;I)V

    .line 384
    .line 385
    .line 386
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 387
    .line 388
    .line 389
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->s0:Landroid/view/View;

    .line 390
    .line 391
    new-instance v3, Lcom/google/android/material/datepicker/f;

    .line 392
    .line 393
    const/4 v4, 0x0

    .line 394
    invoke-direct {v3, p0, p2, v4}, Lcom/google/android/material/datepicker/f;-><init>(Lcom/google/android/material/datepicker/l;Lcom/google/android/material/datepicker/u;I)V

    .line 395
    .line 396
    .line 397
    invoke-virtual {v1, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    .line 399
    .line 400
    :cond_3
    invoke-static {v0, v2}, Lcom/google/android/material/datepicker/n;->J(Landroid/content/Context;I)Z

    .line 401
    .line 402
    .line 403
    move-result v0

    .line 404
    if-nez v0, :cond_8

    .line 405
    .line 406
    new-instance v0, Ld2/w;

    .line 407
    .line 408
    invoke-direct {v0}, Ld2/w;-><init>()V

    .line 409
    .line 410
    .line 411
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 412
    .line 413
    iget-object v2, v0, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 414
    .line 415
    if-ne v2, v1, :cond_4

    .line 416
    .line 417
    goto :goto_2

    .line 418
    :cond_4
    iget-object v3, v0, Ld2/w;->b:Ld2/Y;

    .line 419
    .line 420
    if-eqz v2, :cond_6

    .line 421
    .line 422
    iget-object v2, v2, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 423
    .line 424
    if-eqz v2, :cond_5

    .line 425
    .line 426
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 427
    .line 428
    .line 429
    :cond_5
    iget-object v2, v0, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 430
    .line 431
    const/4 v4, 0x0

    .line 432
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Ld2/I;)V

    .line 433
    .line 434
    .line 435
    :cond_6
    iput-object v1, v0, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 436
    .line 437
    if-eqz v1, :cond_8

    .line 438
    .line 439
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->getOnFlingListener()Ld2/I;

    .line 440
    .line 441
    .line 442
    move-result-object v1

    .line 443
    if-nez v1, :cond_7

    .line 444
    .line 445
    iget-object v1, v0, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 446
    .line 447
    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->h(Ld2/J;)V

    .line 448
    .line 449
    .line 450
    iget-object v1, v0, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 451
    .line 452
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setOnFlingListener(Ld2/I;)V

    .line 453
    .line 454
    .line 455
    new-instance v1, Landroid/widget/Scroller;

    .line 456
    .line 457
    iget-object v2, v0, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 458
    .line 459
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    new-instance v3, Landroid/view/animation/DecelerateInterpolator;

    .line 464
    .line 465
    invoke-direct {v3}, Landroid/view/animation/DecelerateInterpolator;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-direct {v1, v2, v3}, Landroid/widget/Scroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 469
    .line 470
    .line 471
    invoke-virtual {v0}, Ld2/w;->f()V

    .line 472
    .line 473
    .line 474
    goto :goto_2

    .line 475
    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 476
    .line 477
    const-string p2, "An instance of OnFlingListener already set."

    .line 478
    .line 479
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 480
    .line 481
    .line 482
    throw p1

    .line 483
    :cond_8
    :goto_2
    iget-object v0, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 484
    .line 485
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 486
    .line 487
    iget-object p2, p2, Lcom/google/android/material/datepicker/u;->c:Lcom/google/android/material/datepicker/b;

    .line 488
    .line 489
    iget-object p2, p2, Lcom/google/android/material/datepicker/b;->q:Lcom/google/android/material/datepicker/q;

    .line 490
    .line 491
    invoke-virtual {p2, v1}, Lcom/google/android/material/datepicker/q;->d(Lcom/google/android/material/datepicker/q;)I

    .line 492
    .line 493
    .line 494
    move-result p2

    .line 495
    invoke-virtual {v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->Y(I)V

    .line 496
    .line 497
    .line 498
    iget-object p2, p0, Lcom/google/android/material/datepicker/l;->r0:Landroidx/recyclerview/widget/RecyclerView;

    .line 499
    .line 500
    new-instance v0, LA1/f;

    .line 501
    .line 502
    const/4 v1, 0x2

    .line 503
    invoke-direct {v0, v1}, LA1/f;-><init>(I)V

    .line 504
    .line 505
    .line 506
    invoke-static {p2, v0}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 507
    .line 508
    .line 509
    return-object p1
.end method

.method public final x(Landroid/os/Bundle;)V
    .locals 3

    .line 1
    const-string v0, "THEME_RES_ID_KEY"

    .line 2
    .line 3
    iget v1, p0, Lcom/google/android/material/datepicker/l;->l0:I

    .line 4
    .line 5
    invoke-virtual {p1, v0, v1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    const-string v0, "GRID_SELECTOR_KEY"

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "CALENDAR_CONSTRAINTS_KEY"

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/material/datepicker/l;->m0:Lcom/google/android/material/datepicker/b;

    .line 17
    .line 18
    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "DAY_VIEW_DECORATOR_KEY"

    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 24
    .line 25
    .line 26
    const-string v0, "CURRENT_MONTH_KEY"

    .line 27
    .line 28
    iget-object v1, p0, Lcom/google/android/material/datepicker/l;->n0:Lcom/google/android/material/datepicker/q;

    .line 29
    .line 30
    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putParcelable(Ljava/lang/String;Landroid/os/Parcelable;)V

    .line 31
    .line 32
    .line 33
    return-void
.end method
