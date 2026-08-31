.class public LU/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx1/o;


# instance fields
.field public q:I

.field public r:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 0

    packed-switch p1, :pswitch_data_0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0xff

    .line 4
    iput p1, p0, LU/l;->q:I

    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, LU/l;->r:Ljava/lang/Object;

    return-void

    .line 6
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x12c

    .line 7
    iput p1, p0, LU/l;->q:I

    .line 8
    sget-object p1, Lr/l;->a:Lr/v;

    .line 9
    new-instance p1, Lr/v;

    invoke-direct {p1}, Lr/v;-><init>()V

    .line 10
    iput-object p1, p0, LU/l;->r:Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p2, p0, LU/l;->r:Ljava/lang/Object;

    iput p1, p0, LU/l;->q:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 11
    invoke-static {p1, v0}, Lh/f;->g(Landroid/content/Context;I)I

    move-result v0

    invoke-direct {p0, p1, v0}, LU/l;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lh/b;

    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 14
    invoke-static {p1, p2}, Lh/f;->g(Landroid/content/Context;I)I

    move-result v2

    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    invoke-direct {v0, v1}, Lh/b;-><init>(Landroid/view/ContextThemeWrapper;)V

    iput-object v0, p0, LU/l;->r:Ljava/lang/Object;

    .line 15
    iput p2, p0, LU/l;->q:I

    return-void
.end method

.method public constructor <init>(Lcom/google/android/gms/common/b;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lx3/A;->g(Ljava/lang/Object;)V

    iput-object p1, p0, LU/l;->r:Ljava/lang/Object;

    iput p2, p0, LU/l;->q:I

    return-void
.end method

.method public static final b(LU/l;Lm5/b;Ls5/a;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-object v0, p0, LU/l;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/u;

    .line 4
    .line 5
    instance-of v1, p2, Lb6/h;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    move-object v1, p2

    .line 10
    check-cast v1, Lb6/h;

    .line 11
    .line 12
    iget v2, v1, Lb6/h;->x:I

    .line 13
    .line 14
    const/high16 v3, -0x80000000

    .line 15
    .line 16
    and-int v4, v2, v3

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    sub-int/2addr v2, v3

    .line 21
    iput v2, v1, Lb6/h;->x:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, Lb6/h;

    .line 25
    .line 26
    invoke-direct {v1, p0, p2}, Lb6/h;-><init>(LU/l;Ls5/a;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object p2, v1, Lb6/h;->v:Ljava/lang/Object;

    .line 30
    .line 31
    iget v2, v1, Lb6/h;->x:I

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const/4 v4, 0x6

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x7

    .line 37
    const/4 v7, 0x4

    .line 38
    const/4 v8, 0x1

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-ne v2, v8, :cond_3

    .line 42
    .line 43
    iget p0, v1, Lb6/h;->u:I

    .line 44
    .line 45
    iget-object p1, v1, Lb6/h;->t:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v0, v1, Lb6/h;->s:Ljava/util/LinkedHashMap;

    .line 48
    .line 49
    iget-object v2, v1, Lb6/h;->r:LU/l;

    .line 50
    .line 51
    iget-object v9, v1, Lb6/h;->q:Lm5/b;

    .line 52
    .line 53
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    check-cast p2, La6/l;

    .line 57
    .line 58
    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    iget-object p1, v2, LU/l;->r:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast p1, LD/u;

    .line 64
    .line 65
    invoke-virtual {p1}, LD/u;->e()B

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    if-eq p1, v7, :cond_2

    .line 70
    .line 71
    if-ne p1, v6, :cond_1

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_1
    iget-object p0, v2, LU/l;->r:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p0, LD/u;

    .line 77
    .line 78
    const-string p1, "Expected end of the object or comma"

    .line 79
    .line 80
    invoke-static {p0, p1, v5, v3, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 81
    .line 82
    .line 83
    throw v3

    .line 84
    :cond_2
    move v5, p0

    .line 85
    move-object p0, v2

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 88
    .line 89
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 90
    .line 91
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    throw p0

    .line 95
    :cond_4
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, v4}, LD/u;->f(B)B

    .line 99
    .line 100
    .line 101
    move-result p2

    .line 102
    invoke-virtual {v0}, LD/u;->w()B

    .line 103
    .line 104
    .line 105
    move-result v2

    .line 106
    if-eq v2, v7, :cond_8

    .line 107
    .line 108
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 109
    .line 110
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 111
    .line 112
    .line 113
    move-object v9, p1

    .line 114
    move p1, p2

    .line 115
    :goto_1
    iget-object p2, p0, LU/l;->r:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p2, LD/u;

    .line 118
    .line 119
    invoke-virtual {p2}, LD/u;->b()Z

    .line 120
    .line 121
    .line 122
    move-result v2

    .line 123
    if-eqz v2, :cond_5

    .line 124
    .line 125
    invoke-virtual {p2}, LD/u;->i()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    const/4 v2, 0x5

    .line 130
    invoke-virtual {p2, v2}, LD/u;->f(B)B

    .line 131
    .line 132
    .line 133
    iput-object v9, v1, Lb6/h;->q:Lm5/b;

    .line 134
    .line 135
    iput-object p0, v1, Lb6/h;->r:LU/l;

    .line 136
    .line 137
    iput-object v0, v1, Lb6/h;->s:Ljava/util/LinkedHashMap;

    .line 138
    .line 139
    iput-object p1, v1, Lb6/h;->t:Ljava/lang/String;

    .line 140
    .line 141
    iput v5, v1, Lb6/h;->u:I

    .line 142
    .line 143
    iput v8, v1, Lb6/h;->x:I

    .line 144
    .line 145
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    iput-object v1, v9, Lm5/b;->r:Lq5/c;

    .line 149
    .line 150
    sget-object p0, Lr5/a;->q:Lr5/a;

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_5
    move-object v2, p0

    .line 154
    :goto_2
    iget-object p0, v2, LU/l;->r:Ljava/lang/Object;

    .line 155
    .line 156
    check-cast p0, LD/u;

    .line 157
    .line 158
    if-ne p1, v4, :cond_6

    .line 159
    .line 160
    invoke-virtual {p0, v6}, LD/u;->f(B)B

    .line 161
    .line 162
    .line 163
    goto :goto_3

    .line 164
    :cond_6
    if-eq p1, v7, :cond_7

    .line 165
    .line 166
    :goto_3
    new-instance p0, La6/x;

    .line 167
    .line 168
    invoke-direct {p0, v0}, La6/x;-><init>(Ljava/util/Map;)V

    .line 169
    .line 170
    .line 171
    return-object p0

    .line 172
    :cond_7
    const-string p1, "object"

    .line 173
    .line 174
    invoke-static {p0, p1}, Lb6/e;->f(LD/u;Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v3

    .line 178
    :cond_8
    const-string p0, "Unexpected leading comma"

    .line 179
    .line 180
    invoke-static {v0, p0, v5, v3, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 181
    .line 182
    .line 183
    throw v3
.end method


# virtual methods
.method public a(Landroid/view/View;)Z
    .locals 1

    .line 1
    iget-object p1, p0, LU/l;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    .line 5
    iget v0, p0, LU/l;->q:I

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->B(I)V

    .line 8
    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    return p1
.end method

.method public c(J)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1, p2}, LU/l;->e(J)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    iget v0, p0, LU/l;->q:I

    .line 8
    .line 9
    iget-object v1, p0, LU/l;->r:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, [J

    .line 12
    .line 13
    array-length v2, v1

    .line 14
    if-lt v0, v2, :cond_0

    .line 15
    .line 16
    add-int/lit8 v2, v0, 0x1

    .line 17
    .line 18
    array-length v3, v1

    .line 19
    mul-int/lit8 v3, v3, 0x2

    .line 20
    .line 21
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    const-string v2, "copyOf(...)"

    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/m;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, LU/l;->r:Ljava/lang/Object;

    .line 35
    .line 36
    :cond_0
    aput-wide p1, v1, v0

    .line 37
    .line 38
    iget p1, p0, LU/l;->q:I

    .line 39
    .line 40
    if-lt v0, p1, :cond_1

    .line 41
    .line 42
    add-int/lit8 v0, v0, 0x1

    .line 43
    .line 44
    iput v0, p0, LU/l;->q:I

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public d(Ljava/lang/Float;I)Lu/I;
    .locals 2

    .line 1
    new-instance v0, Lu/I;

    .line 2
    .line 3
    sget-object v1, Lu/y;->b:LC0/Z0;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Lu/I;-><init>(Ljava/lang/Float;Lu/x;)V

    .line 6
    .line 7
    .line 8
    iget-object p1, p0, LU/l;->r:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lr/v;

    .line 11
    .line 12
    invoke-virtual {p1, p2, v0}, Lr/v;->h(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public e(J)Z
    .locals 6

    .line 1
    iget v0, p0, LU/l;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    move v2, v1

    .line 5
    :goto_0
    if-ge v2, v0, :cond_1

    .line 6
    .line 7
    iget-object v3, p0, LU/l;->r:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v3, [J

    .line 10
    .line 11
    aget-wide v4, v3, v2

    .line 12
    .line 13
    cmp-long v3, v4, p1

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    return p1

    .line 19
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    return v1
.end method

.method public f()Lh/f;
    .locals 10

    .line 1
    new-instance v0, Lh/f;

    .line 2
    .line 3
    iget-object v1, p0, LU/l;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lh/b;

    .line 6
    .line 7
    iget-object v2, v1, Lh/b;->a:Landroid/view/ContextThemeWrapper;

    .line 8
    .line 9
    iget v3, p0, LU/l;->q:I

    .line 10
    .line 11
    invoke-direct {v0, v2, v3}, Lh/f;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 12
    .line 13
    .line 14
    iget-object v2, v1, Lh/b;->e:Landroid/view/View;

    .line 15
    .line 16
    iget-object v3, v0, Lh/f;->v:Lh/e;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    iput-object v2, v3, Lh/e;->u:Landroid/view/View;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    iget-object v2, v1, Lh/b;->d:Ljava/lang/CharSequence;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    iput-object v2, v3, Lh/e;->d:Ljava/lang/CharSequence;

    .line 28
    .line 29
    iget-object v4, v3, Lh/e;->s:Landroid/widget/TextView;

    .line 30
    .line 31
    if-eqz v4, :cond_1

    .line 32
    .line 33
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    iget-object v2, v1, Lh/b;->c:Landroid/graphics/drawable/Drawable;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    iput-object v2, v3, Lh/e;->q:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    iget-object v4, v3, Lh/e;->r:Landroid/widget/ImageView;

    .line 43
    .line 44
    if-eqz v4, :cond_2

    .line 45
    .line 46
    const/4 v5, 0x0

    .line 47
    invoke-virtual {v4, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 48
    .line 49
    .line 50
    iget-object v4, v3, Lh/e;->r:Landroid/widget/ImageView;

    .line 51
    .line 52
    invoke-virtual {v4, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    iget-object v2, v1, Lh/b;->f:Ljava/lang/String;

    .line 56
    .line 57
    if-eqz v2, :cond_3

    .line 58
    .line 59
    iput-object v2, v3, Lh/e;->e:Ljava/lang/String;

    .line 60
    .line 61
    iget-object v4, v3, Lh/e;->t:Landroid/widget/TextView;

    .line 62
    .line 63
    if-eqz v4, :cond_3

    .line 64
    .line 65
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 66
    .line 67
    .line 68
    :cond_3
    iget-object v2, v1, Lh/b;->g:Ljava/lang/String;

    .line 69
    .line 70
    if-nez v2, :cond_4

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const/4 v4, -0x1

    .line 74
    iget-object v5, v1, Lh/b;->h:Landroid/content/DialogInterface$OnClickListener;

    .line 75
    .line 76
    invoke-virtual {v3, v4, v2, v5}, Lh/e;->b(ILjava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 77
    .line 78
    .line 79
    :goto_1
    iget-object v2, v1, Lh/b;->i:Ljava/lang/String;

    .line 80
    .line 81
    if-nez v2, :cond_5

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_5
    const/4 v4, -0x2

    .line 85
    iget-object v5, v1, Lh/b;->j:Landroid/content/DialogInterface$OnClickListener;

    .line 86
    .line 87
    invoke-virtual {v3, v4, v2, v5}, Lh/e;->b(ILjava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 88
    .line 89
    .line 90
    :goto_2
    iget-object v2, v1, Lh/b;->k:Ljava/lang/String;

    .line 91
    .line 92
    if-nez v2, :cond_6

    .line 93
    .line 94
    goto :goto_3

    .line 95
    :cond_6
    const/4 v4, -0x3

    .line 96
    iget-object v5, v1, Lh/b;->l:LR4/K;

    .line 97
    .line 98
    invoke-virtual {v3, v4, v2, v5}, Lh/e;->b(ILjava/lang/String;Landroid/content/DialogInterface$OnClickListener;)V

    .line 99
    .line 100
    .line 101
    :goto_3
    iget-object v2, v1, Lh/b;->p:Landroid/widget/ListAdapter;

    .line 102
    .line 103
    const/4 v4, 0x1

    .line 104
    const/4 v5, 0x0

    .line 105
    if-eqz v2, :cond_b

    .line 106
    .line 107
    iget-object v2, v1, Lh/b;->b:Landroid/view/LayoutInflater;

    .line 108
    .line 109
    iget v6, v3, Lh/e;->y:I

    .line 110
    .line 111
    invoke-virtual {v2, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    check-cast v2, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 116
    .line 117
    iget-boolean v6, v1, Lh/b;->r:Z

    .line 118
    .line 119
    if-eqz v6, :cond_7

    .line 120
    .line 121
    iget v6, v3, Lh/e;->z:I

    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    iget v6, v3, Lh/e;->A:I

    .line 125
    .line 126
    :goto_4
    iget-object v7, v1, Lh/b;->p:Landroid/widget/ListAdapter;

    .line 127
    .line 128
    if-eqz v7, :cond_8

    .line 129
    .line 130
    goto :goto_5

    .line 131
    :cond_8
    new-instance v7, Lh/d;

    .line 132
    .line 133
    iget-object v8, v1, Lh/b;->a:Landroid/view/ContextThemeWrapper;

    .line 134
    .line 135
    const v9, 0x1020014

    .line 136
    .line 137
    .line 138
    invoke-direct {v7, v8, v6, v9, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    :goto_5
    iput-object v7, v3, Lh/e;->v:Landroid/widget/ListAdapter;

    .line 142
    .line 143
    iget v6, v1, Lh/b;->s:I

    .line 144
    .line 145
    iput v6, v3, Lh/e;->w:I

    .line 146
    .line 147
    iget-object v6, v1, Lh/b;->q:Landroid/content/DialogInterface$OnClickListener;

    .line 148
    .line 149
    if-eqz v6, :cond_9

    .line 150
    .line 151
    new-instance v6, Lh/a;

    .line 152
    .line 153
    invoke-direct {v6, v1, v3}, Lh/a;-><init>(Lh/b;Lh/e;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 157
    .line 158
    .line 159
    :cond_9
    iget-boolean v6, v1, Lh/b;->r:Z

    .line 160
    .line 161
    if-eqz v6, :cond_a

    .line 162
    .line 163
    invoke-virtual {v2, v4}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 164
    .line 165
    .line 166
    :cond_a
    iput-object v2, v3, Lh/e;->f:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 167
    .line 168
    :cond_b
    iget-boolean v2, v1, Lh/b;->m:Z

    .line 169
    .line 170
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 171
    .line 172
    .line 173
    iget-boolean v2, v1, Lh/b;->m:Z

    .line 174
    .line 175
    if-eqz v2, :cond_c

    .line 176
    .line 177
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 178
    .line 179
    .line 180
    :cond_c
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 181
    .line 182
    .line 183
    iget-object v2, v1, Lh/b;->n:Ll5/b;

    .line 184
    .line 185
    invoke-virtual {v0, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 186
    .line 187
    .line 188
    iget-object v1, v1, Lh/b;->o:Ll/m;

    .line 189
    .line 190
    if-eqz v1, :cond_d

    .line 191
    .line 192
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 193
    .line 194
    .line 195
    :cond_d
    return-object v0
.end method

.method public g()Z
    .locals 2

    .line 1
    iget v0, p0, LU/l;->q:I

    .line 2
    .line 3
    iget-object v1, p0, LU/l;->r:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge v0, v1, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
.end method

.method public h()Z
    .locals 1

    .line 1
    iget-object v0, p0, LU/l;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ln3/a;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public i()I
    .locals 6

    .line 1
    iget-object v0, p0, LU/l;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/String;

    .line 4
    .line 5
    iget v1, p0, LU/l;->q:I

    .line 6
    .line 7
    add-int/lit8 v2, v1, 0x1

    .line 8
    .line 9
    iput v2, p0, LU/l;->q:I

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const v2, 0xd800

    .line 16
    .line 17
    .line 18
    if-ge v1, v2, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    and-int/lit16 v1, v1, 0x1fff

    .line 22
    .line 23
    const/16 v3, 0xd

    .line 24
    .line 25
    :goto_0
    iget v4, p0, LU/l;->q:I

    .line 26
    .line 27
    add-int/lit8 v5, v4, 0x1

    .line 28
    .line 29
    iput v5, p0, LU/l;->q:I

    .line 30
    .line 31
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-lt v4, v2, :cond_1

    .line 36
    .line 37
    and-int/lit16 v4, v4, 0x1fff

    .line 38
    .line 39
    shl-int/2addr v4, v3

    .line 40
    or-int/2addr v1, v4

    .line 41
    add-int/lit8 v3, v3, 0xd

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    shl-int v0, v4, v3

    .line 45
    .line 46
    or-int/2addr v0, v1

    .line 47
    return v0
.end method

.method public j()La6/l;
    .locals 9

    .line 1
    iget-object v0, p0, LU/l;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/u;

    .line 4
    .line 5
    invoke-virtual {v0}, LD/u;->w()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x1

    .line 10
    if-ne v1, v2, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0, v2}, LU/l;->l(Z)La6/B;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 v3, 0x0

    .line 18
    if-nez v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {p0, v3}, LU/l;->l(Z)La6/B;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :cond_1
    const/4 v4, 0x6

    .line 26
    const/4 v5, 0x0

    .line 27
    if-ne v1, v4, :cond_c

    .line 28
    .line 29
    iget v1, p0, LU/l;->q:I

    .line 30
    .line 31
    add-int/2addr v1, v2

    .line 32
    iput v1, p0, LU/l;->q:I

    .line 33
    .line 34
    const/16 v2, 0xc8

    .line 35
    .line 36
    if-ne v1, v2, :cond_5

    .line 37
    .line 38
    new-instance v0, Lb6/g;

    .line 39
    .line 40
    invoke-direct {v0, p0, v5}, Lb6/g;-><init>(LU/l;Lq5/c;)V

    .line 41
    .line 42
    .line 43
    new-instance v1, Lm5/b;

    .line 44
    .line 45
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object v0, v1, Lm5/b;->q:Lb6/g;

    .line 49
    .line 50
    iput-object v1, v1, Lm5/b;->r:Lq5/c;

    .line 51
    .line 52
    sget-object v2, Lm5/a;->a:Lr5/a;

    .line 53
    .line 54
    iput-object v2, v1, Lm5/b;->s:Ljava/lang/Object;

    .line 55
    .line 56
    :cond_2
    :goto_0
    iget-object v0, v1, Lm5/b;->s:Ljava/lang/Object;

    .line 57
    .line 58
    iget-object v3, v1, Lm5/b;->r:Lq5/c;

    .line 59
    .line 60
    if-nez v3, :cond_3

    .line 61
    .line 62
    invoke-static {v0}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    check-cast v0, La6/l;

    .line 66
    .line 67
    goto/16 :goto_3

    .line 68
    .line 69
    :cond_3
    invoke-static {v2, v0}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    :try_start_0
    iget-object v0, v1, Lm5/b;->q:Lb6/g;

    .line 76
    .line 77
    const/4 v4, 0x3

    .line 78
    invoke-static {v4, v0}, Lkotlin/jvm/internal/B;->b(ILjava/lang/Object;)V

    .line 79
    .line 80
    .line 81
    new-instance v4, Lb6/g;

    .line 82
    .line 83
    iget-object v0, v0, Lb6/g;->t:LU/l;

    .line 84
    .line 85
    invoke-direct {v4, v0, v3}, Lb6/g;-><init>(LU/l;Lq5/c;)V

    .line 86
    .line 87
    .line 88
    iput-object v1, v4, Lb6/g;->s:Lm5/b;

    .line 89
    .line 90
    sget-object v0, Lm5/y;->a:Lm5/y;

    .line 91
    .line 92
    invoke-virtual {v4, v0}, Lb6/g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 96
    sget-object v4, Lr5/a;->q:Lr5/a;

    .line 97
    .line 98
    if-eq v0, v4, :cond_2

    .line 99
    .line 100
    invoke-interface {v3, v0}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    goto :goto_0

    .line 104
    :catchall_0
    move-exception v0

    .line 105
    invoke-static {v0}, Lm5/a;->b(Ljava/lang/Throwable;)Lm5/l;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    invoke-interface {v3, v0}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_4
    iput-object v2, v1, Lm5/b;->s:Ljava/lang/Object;

    .line 114
    .line 115
    invoke-interface {v3, v0}, Lq5/c;->resumeWith(Ljava/lang/Object;)V

    .line 116
    .line 117
    .line 118
    goto :goto_0

    .line 119
    :cond_5
    invoke-virtual {v0, v4}, LD/u;->f(B)B

    .line 120
    .line 121
    .line 122
    move-result v1

    .line 123
    invoke-virtual {v0}, LD/u;->w()B

    .line 124
    .line 125
    .line 126
    move-result v2

    .line 127
    const/4 v6, 0x4

    .line 128
    if-eq v2, v6, :cond_b

    .line 129
    .line 130
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 131
    .line 132
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 133
    .line 134
    .line 135
    :cond_6
    invoke-virtual {v0}, LD/u;->b()Z

    .line 136
    .line 137
    .line 138
    move-result v7

    .line 139
    const/4 v8, 0x7

    .line 140
    if-eqz v7, :cond_8

    .line 141
    .line 142
    invoke-virtual {v0}, LD/u;->i()Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    const/4 v7, 0x5

    .line 147
    invoke-virtual {v0, v7}, LD/u;->f(B)B

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, LU/l;->j()La6/l;

    .line 151
    .line 152
    .line 153
    move-result-object v7

    .line 154
    invoke-interface {v2, v1, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, LD/u;->e()B

    .line 158
    .line 159
    .line 160
    move-result v1

    .line 161
    if-eq v1, v6, :cond_6

    .line 162
    .line 163
    if-ne v1, v8, :cond_7

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_7
    const-string v1, "Expected end of the object or comma"

    .line 167
    .line 168
    invoke-static {v0, v1, v3, v5, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 169
    .line 170
    .line 171
    throw v5

    .line 172
    :cond_8
    :goto_1
    if-ne v1, v4, :cond_9

    .line 173
    .line 174
    invoke-virtual {v0, v8}, LD/u;->f(B)B

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_9
    if-eq v1, v6, :cond_a

    .line 179
    .line 180
    :goto_2
    new-instance v0, La6/x;

    .line 181
    .line 182
    invoke-direct {v0, v2}, La6/x;-><init>(Ljava/util/Map;)V

    .line 183
    .line 184
    .line 185
    :goto_3
    iget v1, p0, LU/l;->q:I

    .line 186
    .line 187
    add-int/lit8 v1, v1, -0x1

    .line 188
    .line 189
    iput v1, p0, LU/l;->q:I

    .line 190
    .line 191
    return-object v0

    .line 192
    :cond_a
    const-string v1, "object"

    .line 193
    .line 194
    invoke-static {v0, v1}, Lb6/e;->f(LD/u;Ljava/lang/String;)V

    .line 195
    .line 196
    .line 197
    throw v5

    .line 198
    :cond_b
    const-string v1, "Unexpected leading comma"

    .line 199
    .line 200
    invoke-static {v0, v1, v3, v5, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 201
    .line 202
    .line 203
    throw v5

    .line 204
    :cond_c
    const/16 v2, 0x8

    .line 205
    .line 206
    if-ne v1, v2, :cond_d

    .line 207
    .line 208
    invoke-virtual {p0}, LU/l;->k()La6/e;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    return-object v0

    .line 213
    :cond_d
    invoke-static {v1}, Lb6/e;->j(B)Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const-string v2, "Cannot read Json element because of unexpected "

    .line 218
    .line 219
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v1

    .line 223
    invoke-static {v0, v1, v3, v5, v4}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 224
    .line 225
    .line 226
    throw v5
.end method

.method public k()La6/e;
    .locals 8

    .line 1
    iget-object v0, p0, LU/l;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/u;

    .line 4
    .line 5
    invoke-virtual {v0}, LD/u;->e()B

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-virtual {v0}, LD/u;->w()B

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const/4 v5, 0x4

    .line 16
    if-eq v2, v5, :cond_6

    .line 17
    .line 18
    new-instance v2, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    :cond_0
    :goto_0
    invoke-virtual {v0}, LD/u;->b()Z

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    const/16 v7, 0x9

    .line 28
    .line 29
    if-eqz v6, :cond_3

    .line 30
    .line 31
    invoke-virtual {p0}, LU/l;->j()La6/l;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, LD/u;->e()B

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eq v1, v5, :cond_0

    .line 43
    .line 44
    if-ne v1, v7, :cond_1

    .line 45
    .line 46
    const/4 v6, 0x1

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    move v6, v3

    .line 49
    :goto_1
    iget v7, v0, LD/u;->b:I

    .line 50
    .line 51
    if-eqz v6, :cond_2

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const-string v1, "Expected end of the array or comma"

    .line 55
    .line 56
    invoke-static {v0, v1, v7, v4, v5}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    throw v4

    .line 60
    :cond_3
    const/16 v3, 0x8

    .line 61
    .line 62
    if-ne v1, v3, :cond_4

    .line 63
    .line 64
    invoke-virtual {v0, v7}, LD/u;->f(B)B

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_4
    if-eq v1, v5, :cond_5

    .line 69
    .line 70
    :goto_2
    new-instance v0, La6/e;

    .line 71
    .line 72
    invoke-direct {v0, v2}, La6/e;-><init>(Ljava/util/List;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :cond_5
    const-string v1, "array"

    .line 77
    .line 78
    invoke-static {v0, v1}, Lb6/e;->f(LD/u;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw v4

    .line 82
    :cond_6
    const-string v1, "Unexpected leading comma"

    .line 83
    .line 84
    const/4 v2, 0x6

    .line 85
    invoke-static {v0, v1, v3, v4, v2}, LD/u;->m(LD/u;Ljava/lang/String;ILjava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    throw v4
.end method

.method public l(Z)La6/B;
    .locals 2

    .line 1
    iget-object v0, p0, LU/l;->r:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, LD/u;

    .line 4
    .line 5
    if-nez p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, LD/u;->j()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, LD/u;->i()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    const-string v1, "null"

    .line 19
    .line 20
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    sget-object p1, La6/u;->INSTANCE:La6/u;

    .line 27
    .line 28
    return-object p1

    .line 29
    :cond_1
    new-instance v1, La6/r;

    .line 30
    .line 31
    invoke-direct {v1, v0, p1}, La6/r;-><init>(Ljava/lang/String;Z)V

    .line 32
    .line 33
    .line 34
    return-object v1
.end method

.method public m(J)V
    .locals 5

    .line 1
    iget v0, p0, LU/l;->q:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :goto_0
    if-ge v1, v0, :cond_2

    .line 5
    .line 6
    iget-object v2, p0, LU/l;->r:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v2, [J

    .line 9
    .line 10
    aget-wide v3, v2, v1

    .line 11
    .line 12
    cmp-long v2, p1, v3

    .line 13
    .line 14
    if-nez v2, :cond_1

    .line 15
    .line 16
    iget p1, p0, LU/l;->q:I

    .line 17
    .line 18
    add-int/lit8 p1, p1, -0x1

    .line 19
    .line 20
    :goto_1
    if-ge v1, p1, :cond_0

    .line 21
    .line 22
    iget-object p2, p0, LU/l;->r:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p2, [J

    .line 25
    .line 26
    add-int/lit8 v0, v1, 0x1

    .line 27
    .line 28
    aget-wide v2, p2, v0

    .line 29
    .line 30
    aput-wide v2, p2, v1

    .line 31
    .line 32
    move v1, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_0
    iget p1, p0, LU/l;->q:I

    .line 35
    .line 36
    add-int/lit8 p1, p1, -0x1

    .line 37
    .line 38
    iput p1, p0, LU/l;->q:I

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    return-void
.end method
