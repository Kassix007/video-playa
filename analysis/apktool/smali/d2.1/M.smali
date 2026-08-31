.class public final Ld2/M;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/ArrayList;

.field public b:Ljava/util/ArrayList;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/List;

.field public e:I

.field public f:I

.field public g:Ld2/L;

.field public final synthetic h:Landroidx/recyclerview/widget/RecyclerView;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 5
    .line 6
    new-instance p1, Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Ld2/M;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-object v0, p0, Ld2/M;->b:Ljava/util/ArrayList;

    .line 15
    .line 16
    new-instance v0, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v0, p0, Ld2/M;->c:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, Ld2/M;->d:Ljava/util/List;

    .line 28
    .line 29
    const/4 p1, 0x2

    .line 30
    iput p1, p0, Ld2/M;->e:I

    .line 31
    .line 32
    iput p1, p0, Ld2/M;->f:I

    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public final a(Ld2/V;Z)V
    .locals 4

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->j(Ld2/V;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, Ld2/V;->a:Landroid/view/View;

    .line 5
    .line 6
    iget-object v1, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 7
    .line 8
    iget-object v2, v1, Landroidx/recyclerview/widget/RecyclerView;->z0:Ld2/X;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    iget-object v2, v2, Ld2/X;->e:Ld2/W;

    .line 14
    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    iget-object v2, v2, Ld2/W;->e:Ljava/util/WeakHashMap;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Lw1/b;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    invoke-static {v0, v2}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    if-eqz p2, :cond_2

    .line 31
    .line 32
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 33
    .line 34
    if-eqz p2, :cond_2

    .line 35
    .line 36
    iget-object p2, v1, Landroidx/recyclerview/widget/RecyclerView;->v:LZ/m;

    .line 37
    .line 38
    invoke-virtual {p2, p1}, LZ/m;->E(Ld2/V;)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iput-object v3, p1, Ld2/V;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 42
    .line 43
    invoke-virtual {p0}, Ld2/M;->c()Ld2/L;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    iget v0, p1, Ld2/V;->f:I

    .line 51
    .line 52
    invoke-virtual {p2, v0}, Ld2/L;->a(I)Ld2/K;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    iget-object v1, v1, Ld2/K;->a:Ljava/util/ArrayList;

    .line 57
    .line 58
    iget-object p2, p2, Ld2/L;->a:Landroid/util/SparseArray;

    .line 59
    .line 60
    invoke-virtual {p2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    check-cast p2, Ld2/K;

    .line 65
    .line 66
    iget p2, p2, Ld2/K;->b:I

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-gt p2, v0, :cond_3

    .line 73
    .line 74
    return-void

    .line 75
    :cond_3
    invoke-virtual {p1}, Ld2/V;->m()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public final b(I)I
    .locals 4

    .line 1
    iget-object v0, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    if-ltz p1, :cond_1

    .line 4
    .line 5
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 6
    .line 7
    invoke-virtual {v1}, Ld2/S;->b()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-ge p1, v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 14
    .line 15
    iget-boolean v1, v1, Ld2/S;->g:Z

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    return p1

    .line 20
    :cond_0
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    invoke-virtual {v0, p1, v1}, LL0/l;->i(II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1

    .line 28
    :cond_1
    new-instance v1, Ljava/lang/IndexOutOfBoundsException;

    .line 29
    .line 30
    const-string v2, "invalid position "

    .line 31
    .line 32
    const-string v3, ". State item count is "

    .line 33
    .line 34
    invoke-static {v2, v3, p1}, Lk1/i;->l(Ljava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 39
    .line 40
    invoke-virtual {v2}, Ld2/S;->b()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-direct {v1, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    throw v1
.end method

.method public final c()Ld2/L;
    .locals 2

    .line 1
    iget-object v0, p0, Ld2/M;->g:Ld2/L;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ld2/L;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v1, Landroid/util/SparseArray;

    .line 11
    .line 12
    invoke-direct {v1}, Landroid/util/SparseArray;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v1, v0, Ld2/L;->a:Landroid/util/SparseArray;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    iput v1, v0, Ld2/L;->b:I

    .line 19
    .line 20
    iput-object v0, p0, Ld2/M;->g:Ld2/L;

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Ld2/M;->g:Ld2/L;

    .line 23
    .line 24
    return-object v0
.end method

.method public final d()V
    .locals 3

    .line 1
    iget-object v0, p0, Ld2/M;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    add-int/lit8 v1, v1, -0x1

    .line 8
    .line 9
    :goto_0
    if-ltz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ld2/M;->e(I)V

    .line 12
    .line 13
    .line 14
    add-int/lit8 v1, v1, -0x1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 18
    .line 19
    .line 20
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 21
    .line 22
    iget-object v0, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->r0:LQ/J;

    .line 25
    .line 26
    iget-object v1, v0, LQ/J;->d:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, [I

    .line 29
    .line 30
    if-eqz v1, :cond_1

    .line 31
    .line 32
    const/4 v2, -0x1

    .line 33
    invoke-static {v1, v2}, Ljava/util/Arrays;->fill([II)V

    .line 34
    .line 35
    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    iput v1, v0, LQ/J;->c:I

    .line 38
    .line 39
    return-void
.end method

.method public final e(I)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld2/M;->c:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ld2/V;

    .line 8
    .line 9
    const/4 v2, 0x1

    .line 10
    invoke-virtual {p0, v1, v2}, Ld2/M;->a(Ld2/V;Z)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final f(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ld2/V;->j()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget-object v2, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {v2, p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {v0}, Ld2/V;->i()Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p1, v0, Ld2/V;->n:Ld2/M;

    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ld2/M;->j(Ld2/V;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    invoke-virtual {v0}, Ld2/V;->p()Z

    .line 30
    .line 31
    .line 32
    move-result p1

    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget p1, v0, Ld2/V;->j:I

    .line 36
    .line 37
    and-int/lit8 p1, p1, -0x21

    .line 38
    .line 39
    iput p1, v0, Ld2/V;->j:I

    .line 40
    .line 41
    :cond_2
    :goto_0
    invoke-virtual {p0, v0}, Ld2/M;->g(Ld2/V;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    invoke-virtual {v0}, Ld2/V;->g()Z

    .line 49
    .line 50
    .line 51
    move-result p1

    .line 52
    if-nez p1, :cond_3

    .line 53
    .line 54
    iget-object p1, v2, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 55
    .line 56
    invoke-virtual {p1, v0}, Ld2/D;->d(Ld2/V;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    return-void
.end method

.method public final g(Ld2/V;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ld2/V;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p1, Ld2/V;->a:Landroid/view/View;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    iget-object v4, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-nez v0, :cond_f

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto/16 :goto_9

    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Ld2/V;->j()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_e

    .line 26
    .line 27
    invoke-virtual {p1}, Ld2/V;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_d

    .line 32
    .line 33
    iget v0, p1, Ld2/V;->j:I

    .line 34
    .line 35
    and-int/lit8 v0, v0, 0x10

    .line 36
    .line 37
    if-nez v0, :cond_1

    .line 38
    .line 39
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/view/View;->hasTransientState()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    move v0, v3

    .line 48
    goto :goto_0

    .line 49
    :cond_1
    move v0, v2

    .line 50
    :goto_0
    invoke-virtual {p1}, Ld2/V;->g()Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    if-eqz v1, :cond_b

    .line 55
    .line 56
    iget v1, p0, Ld2/M;->f:I

    .line 57
    .line 58
    if-lez v1, :cond_9

    .line 59
    .line 60
    iget v1, p1, Ld2/V;->j:I

    .line 61
    .line 62
    and-int/lit16 v1, v1, 0x20e

    .line 63
    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    goto :goto_5

    .line 67
    :cond_2
    iget-object v1, p0, Ld2/M;->c:Ljava/util/ArrayList;

    .line 68
    .line 69
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    iget v6, p0, Ld2/M;->f:I

    .line 74
    .line 75
    if-lt v5, v6, :cond_3

    .line 76
    .line 77
    if-lez v5, :cond_3

    .line 78
    .line 79
    invoke-virtual {p0, v2}, Ld2/M;->e(I)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v5, v5, -0x1

    .line 83
    .line 84
    :cond_3
    sget-object v6, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 85
    .line 86
    if-lez v5, :cond_8

    .line 87
    .line 88
    iget-object v6, v4, Landroidx/recyclerview/widget/RecyclerView;->r0:LQ/J;

    .line 89
    .line 90
    iget v7, p1, Ld2/V;->c:I

    .line 91
    .line 92
    iget-object v8, v6, LQ/J;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v8, [I

    .line 95
    .line 96
    if-eqz v8, :cond_5

    .line 97
    .line 98
    iget v8, v6, LQ/J;->c:I

    .line 99
    .line 100
    mul-int/lit8 v8, v8, 0x2

    .line 101
    .line 102
    move v9, v2

    .line 103
    :goto_1
    if-ge v9, v8, :cond_5

    .line 104
    .line 105
    iget-object v10, v6, LQ/J;->d:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v10, [I

    .line 108
    .line 109
    aget v10, v10, v9

    .line 110
    .line 111
    if-ne v10, v7, :cond_4

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :cond_4
    add-int/lit8 v9, v9, 0x2

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_5
    add-int/lit8 v5, v5, -0x1

    .line 118
    .line 119
    :goto_2
    if-ltz v5, :cond_7

    .line 120
    .line 121
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Ld2/V;

    .line 126
    .line 127
    iget v6, v6, Ld2/V;->c:I

    .line 128
    .line 129
    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView;->r0:LQ/J;

    .line 130
    .line 131
    iget-object v8, v7, LQ/J;->d:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v8, [I

    .line 134
    .line 135
    if-eqz v8, :cond_7

    .line 136
    .line 137
    iget v8, v7, LQ/J;->c:I

    .line 138
    .line 139
    mul-int/lit8 v8, v8, 0x2

    .line 140
    .line 141
    move v9, v2

    .line 142
    :goto_3
    if-ge v9, v8, :cond_7

    .line 143
    .line 144
    iget-object v10, v7, LQ/J;->d:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v10, [I

    .line 147
    .line 148
    aget v10, v10, v9

    .line 149
    .line 150
    if-ne v10, v6, :cond_6

    .line 151
    .line 152
    add-int/lit8 v5, v5, -0x1

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_6
    add-int/lit8 v9, v9, 0x2

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_7
    add-int/2addr v5, v3

    .line 159
    :cond_8
    :goto_4
    invoke-virtual {v1, v5, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    move v1, v3

    .line 163
    goto :goto_6

    .line 164
    :cond_9
    :goto_5
    move v1, v2

    .line 165
    :goto_6
    if-nez v1, :cond_a

    .line 166
    .line 167
    invoke-virtual {p0, p1, v3}, Ld2/M;->a(Ld2/V;Z)V

    .line 168
    .line 169
    .line 170
    :goto_7
    move v2, v1

    .line 171
    goto :goto_8

    .line 172
    :cond_a
    move v3, v2

    .line 173
    goto :goto_7

    .line 174
    :cond_b
    move v3, v2

    .line 175
    :goto_8
    iget-object v1, v4, Landroidx/recyclerview/widget/RecyclerView;->v:LZ/m;

    .line 176
    .line 177
    invoke-virtual {v1, p1}, LZ/m;->E(Ld2/V;)V

    .line 178
    .line 179
    .line 180
    if-nez v2, :cond_c

    .line 181
    .line 182
    if-nez v3, :cond_c

    .line 183
    .line 184
    if-eqz v0, :cond_c

    .line 185
    .line 186
    const/4 v0, 0x0

    .line 187
    iput-object v0, p1, Ld2/V;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 188
    .line 189
    :cond_c
    return-void

    .line 190
    :cond_d
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 191
    .line 192
    new-instance v0, Ljava/lang/StringBuilder;

    .line 193
    .line 194
    const-string v1, "Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle."

    .line 195
    .line 196
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 211
    .line 212
    .line 213
    throw p1

    .line 214
    :cond_e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 215
    .line 216
    new-instance v1, Ljava/lang/StringBuilder;

    .line 217
    .line 218
    const-string v2, "Tmp detached view should be removed from RecyclerView before it can be recycled: "

    .line 219
    .line 220
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0

    .line 241
    :cond_f
    :goto_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 242
    .line 243
    new-instance v5, Ljava/lang/StringBuilder;

    .line 244
    .line 245
    const-string v6, "Scrapped or attached views may not be recycled. isScrap:"

    .line 246
    .line 247
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p1}, Ld2/V;->i()Z

    .line 251
    .line 252
    .line 253
    move-result p1

    .line 254
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    .line 257
    const-string p1, " isAttached:"

    .line 258
    .line 259
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 263
    .line 264
    .line 265
    move-result-object p1

    .line 266
    if-eqz p1, :cond_10

    .line 267
    .line 268
    move v2, v3

    .line 269
    :cond_10
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    invoke-virtual {v4}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 273
    .line 274
    .line 275
    move-result-object p1

    .line 276
    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object p1

    .line 283
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 284
    .line 285
    .line 286
    throw v0
.end method

.method public final h(Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget v0, p1, Ld2/V;->j:I

    .line 6
    .line 7
    and-int/lit8 v0, v0, 0xc

    .line 8
    .line 9
    iget-object v1, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-virtual {p1}, Ld2/V;->k()Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_3

    .line 19
    .line 20
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    invoke-virtual {p1}, Ld2/V;->c()Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v0, Ld2/h;

    .line 29
    .line 30
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    iget-boolean v0, v0, Ld2/h;->g:Z

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    invoke-virtual {p1}, Ld2/V;->f()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    iget-object v0, p0, Ld2/M;->b:Ljava/util/ArrayList;

    .line 48
    .line 49
    if-nez v0, :cond_2

    .line 50
    .line 51
    new-instance v0, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object v0, p0, Ld2/M;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_2
    iput-object p0, p1, Ld2/V;->n:Ld2/M;

    .line 59
    .line 60
    const/4 v0, 0x1

    .line 61
    iput-boolean v0, p1, Ld2/V;->o:Z

    .line 62
    .line 63
    iget-object v0, p0, Ld2/M;->b:Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_3
    :goto_0
    invoke-virtual {p1}, Ld2/V;->f()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_5

    .line 74
    .line 75
    invoke-virtual {p1}, Ld2/V;->h()Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_5

    .line 80
    .line 81
    iget-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 82
    .line 83
    iget-boolean v0, v0, Ld2/z;->b:Z

    .line 84
    .line 85
    if-eqz v0, :cond_4

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 89
    .line 90
    new-instance v0, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    const-string v2, "Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool."

    .line 93
    .line 94
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    throw p1

    .line 112
    :cond_5
    :goto_1
    iput-object p0, p1, Ld2/V;->n:Ld2/M;

    .line 113
    .line 114
    const/4 v0, 0x0

    .line 115
    iput-boolean v0, p1, Ld2/V;->o:Z

    .line 116
    .line 117
    iget-object v0, p0, Ld2/M;->a:Ljava/util/ArrayList;

    .line 118
    .line 119
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final i(IJ)Ld2/V;
    .locals 27

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v0, p1

    .line 4
    .line 5
    iget-object v2, v1, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 6
    .line 7
    iget-object v3, v2, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 8
    .line 9
    if-ltz v0, :cond_4a

    .line 10
    .line 11
    invoke-virtual {v3}, Ld2/S;->b()I

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    if-ge v0, v4, :cond_4a

    .line 16
    .line 17
    iget-boolean v4, v3, Ld2/S;->g:Z

    .line 18
    .line 19
    const/16 v5, 0x20

    .line 20
    .line 21
    const/4 v8, 0x0

    .line 22
    if-eqz v4, :cond_6

    .line 23
    .line 24
    iget-object v4, v1, Ld2/M;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    if-eqz v4, :cond_4

    .line 27
    .line 28
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_0

    .line 33
    .line 34
    goto :goto_2

    .line 35
    :cond_0
    move v9, v8

    .line 36
    :goto_0
    if-ge v9, v4, :cond_2

    .line 37
    .line 38
    iget-object v10, v1, Ld2/M;->b:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v10

    .line 44
    check-cast v10, Ld2/V;

    .line 45
    .line 46
    invoke-virtual {v10}, Ld2/V;->p()Z

    .line 47
    .line 48
    .line 49
    move-result v11

    .line 50
    if-nez v11, :cond_1

    .line 51
    .line 52
    invoke-virtual {v10}, Ld2/V;->b()I

    .line 53
    .line 54
    .line 55
    move-result v11

    .line 56
    if-ne v11, v0, :cond_1

    .line 57
    .line 58
    invoke-virtual {v10, v5}, Ld2/V;->a(I)V

    .line 59
    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_1
    add-int/lit8 v9, v9, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_2
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 66
    .line 67
    iget-boolean v9, v9, Ld2/z;->b:Z

    .line 68
    .line 69
    if-eqz v9, :cond_4

    .line 70
    .line 71
    iget-object v9, v2, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 72
    .line 73
    invoke-virtual {v9, v0, v8}, LL0/l;->i(II)I

    .line 74
    .line 75
    .line 76
    move-result v9

    .line 77
    if-lez v9, :cond_4

    .line 78
    .line 79
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 80
    .line 81
    invoke-virtual {v10}, Ld2/z;->a()I

    .line 82
    .line 83
    .line 84
    move-result v10

    .line 85
    if-ge v9, v10, :cond_4

    .line 86
    .line 87
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 88
    .line 89
    invoke-virtual {v10, v9}, Ld2/z;->b(I)J

    .line 90
    .line 91
    .line 92
    move-result-wide v9

    .line 93
    move v11, v8

    .line 94
    :goto_1
    if-ge v11, v4, :cond_4

    .line 95
    .line 96
    iget-object v12, v1, Ld2/M;->b:Ljava/util/ArrayList;

    .line 97
    .line 98
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object v12

    .line 102
    check-cast v12, Ld2/V;

    .line 103
    .line 104
    invoke-virtual {v12}, Ld2/V;->p()Z

    .line 105
    .line 106
    .line 107
    move-result v13

    .line 108
    if-nez v13, :cond_3

    .line 109
    .line 110
    iget-wide v13, v12, Ld2/V;->e:J

    .line 111
    .line 112
    cmp-long v13, v13, v9

    .line 113
    .line 114
    if-nez v13, :cond_3

    .line 115
    .line 116
    invoke-virtual {v12, v5}, Ld2/V;->a(I)V

    .line 117
    .line 118
    .line 119
    move-object v10, v12

    .line 120
    goto :goto_3

    .line 121
    :cond_3
    add-int/lit8 v11, v11, 0x1

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_4
    :goto_2
    const/4 v10, 0x0

    .line 125
    :goto_3
    if-eqz v10, :cond_5

    .line 126
    .line 127
    const/4 v4, 0x1

    .line 128
    goto :goto_4

    .line 129
    :cond_5
    move v4, v8

    .line 130
    goto :goto_4

    .line 131
    :cond_6
    move v4, v8

    .line 132
    const/4 v10, 0x0

    .line 133
    :goto_4
    iget-object v9, v1, Ld2/M;->a:Ljava/util/ArrayList;

    .line 134
    .line 135
    iget-object v11, v1, Ld2/M;->c:Ljava/util/ArrayList;

    .line 136
    .line 137
    if-nez v10, :cond_1c

    .line 138
    .line 139
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 140
    .line 141
    .line 142
    move-result v10

    .line 143
    move v12, v8

    .line 144
    :goto_5
    if-ge v12, v10, :cond_9

    .line 145
    .line 146
    invoke-virtual {v9, v12}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v13

    .line 150
    check-cast v13, Ld2/V;

    .line 151
    .line 152
    invoke-virtual {v13}, Ld2/V;->p()Z

    .line 153
    .line 154
    .line 155
    move-result v14

    .line 156
    if-nez v14, :cond_8

    .line 157
    .line 158
    invoke-virtual {v13}, Ld2/V;->b()I

    .line 159
    .line 160
    .line 161
    move-result v14

    .line 162
    if-ne v14, v0, :cond_8

    .line 163
    .line 164
    invoke-virtual {v13}, Ld2/V;->f()Z

    .line 165
    .line 166
    .line 167
    move-result v14

    .line 168
    if-nez v14, :cond_8

    .line 169
    .line 170
    iget-boolean v14, v3, Ld2/S;->g:Z

    .line 171
    .line 172
    if-nez v14, :cond_7

    .line 173
    .line 174
    invoke-virtual {v13}, Ld2/V;->h()Z

    .line 175
    .line 176
    .line 177
    move-result v14

    .line 178
    if-nez v14, :cond_8

    .line 179
    .line 180
    :cond_7
    invoke-virtual {v13, v5}, Ld2/V;->a(I)V

    .line 181
    .line 182
    .line 183
    move-object v10, v13

    .line 184
    const/16 v16, 0x1

    .line 185
    .line 186
    goto/16 :goto_b

    .line 187
    .line 188
    :cond_8
    add-int/lit8 v12, v12, 0x1

    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_9
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 192
    .line 193
    iget-object v10, v10, LB0/G0;->t:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast v10, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 198
    .line 199
    .line 200
    move-result v12

    .line 201
    move v13, v8

    .line 202
    :goto_6
    if-ge v13, v12, :cond_b

    .line 203
    .line 204
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v14

    .line 208
    check-cast v14, Landroid/view/View;

    .line 209
    .line 210
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 211
    .line 212
    .line 213
    move-result-object v15

    .line 214
    const/16 v16, 0x1

    .line 215
    .line 216
    invoke-virtual {v15}, Ld2/V;->b()I

    .line 217
    .line 218
    .line 219
    move-result v7

    .line 220
    if-ne v7, v0, :cond_a

    .line 221
    .line 222
    invoke-virtual {v15}, Ld2/V;->f()Z

    .line 223
    .line 224
    .line 225
    move-result v7

    .line 226
    if-nez v7, :cond_a

    .line 227
    .line 228
    invoke-virtual {v15}, Ld2/V;->h()Z

    .line 229
    .line 230
    .line 231
    move-result v7

    .line 232
    if-nez v7, :cond_a

    .line 233
    .line 234
    goto :goto_7

    .line 235
    :cond_a
    add-int/lit8 v13, v13, 0x1

    .line 236
    .line 237
    goto :goto_6

    .line 238
    :cond_b
    const/16 v16, 0x1

    .line 239
    .line 240
    const/4 v14, 0x0

    .line 241
    :goto_7
    if-eqz v14, :cond_11

    .line 242
    .line 243
    invoke-static {v14}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 244
    .line 245
    .line 246
    move-result-object v7

    .line 247
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 248
    .line 249
    iget-object v12, v10, LB0/G0;->s:Ljava/lang/Object;

    .line 250
    .line 251
    check-cast v12, LO3/T;

    .line 252
    .line 253
    iget-object v13, v10, LB0/G0;->r:Ljava/lang/Object;

    .line 254
    .line 255
    check-cast v13, Ld2/y;

    .line 256
    .line 257
    iget-object v13, v13, Ld2/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 258
    .line 259
    invoke-virtual {v13, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 260
    .line 261
    .line 262
    move-result v13

    .line 263
    if-ltz v13, :cond_10

    .line 264
    .line 265
    invoke-virtual {v12, v13}, LO3/T;->e(I)Z

    .line 266
    .line 267
    .line 268
    move-result v15

    .line 269
    if-eqz v15, :cond_f

    .line 270
    .line 271
    invoke-virtual {v12, v13}, LO3/T;->b(I)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v10, v14}, LB0/G0;->Z(Landroid/view/View;)V

    .line 275
    .line 276
    .line 277
    iget-object v10, v2, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 278
    .line 279
    iget-object v12, v10, LB0/G0;->s:Ljava/lang/Object;

    .line 280
    .line 281
    check-cast v12, LO3/T;

    .line 282
    .line 283
    iget-object v10, v10, LB0/G0;->r:Ljava/lang/Object;

    .line 284
    .line 285
    check-cast v10, Ld2/y;

    .line 286
    .line 287
    iget-object v10, v10, Ld2/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 288
    .line 289
    invoke-virtual {v10, v14}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 290
    .line 291
    .line 292
    move-result v10

    .line 293
    const/4 v13, -0x1

    .line 294
    if-ne v10, v13, :cond_c

    .line 295
    .line 296
    :goto_8
    move v10, v13

    .line 297
    goto :goto_9

    .line 298
    :cond_c
    invoke-virtual {v12, v10}, LO3/T;->e(I)Z

    .line 299
    .line 300
    .line 301
    move-result v15

    .line 302
    if-eqz v15, :cond_d

    .line 303
    .line 304
    goto :goto_8

    .line 305
    :cond_d
    invoke-virtual {v12, v10}, LO3/T;->c(I)I

    .line 306
    .line 307
    .line 308
    move-result v12

    .line 309
    sub-int/2addr v10, v12

    .line 310
    :goto_9
    if-eq v10, v13, :cond_e

    .line 311
    .line 312
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 313
    .line 314
    invoke-virtual {v12, v10}, LB0/G0;->q(I)V

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v14}, Ld2/M;->h(Landroid/view/View;)V

    .line 318
    .line 319
    .line 320
    const/16 v10, 0x2020

    .line 321
    .line 322
    invoke-virtual {v7, v10}, Ld2/V;->a(I)V

    .line 323
    .line 324
    .line 325
    move-object v10, v7

    .line 326
    goto :goto_b

    .line 327
    :cond_e
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 328
    .line 329
    new-instance v3, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v4, "layout index should not be -1 after unhiding a view:"

    .line 332
    .line 333
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 344
    .line 345
    .line 346
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 351
    .line 352
    .line 353
    throw v0

    .line 354
    :cond_f
    new-instance v0, Ljava/lang/RuntimeException;

    .line 355
    .line 356
    new-instance v2, Ljava/lang/StringBuilder;

    .line 357
    .line 358
    const-string v3, "trying to unhide a view that was not hidden"

    .line 359
    .line 360
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 367
    .line 368
    .line 369
    move-result-object v2

    .line 370
    invoke-direct {v0, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    throw v0

    .line 374
    :cond_10
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 375
    .line 376
    new-instance v2, Ljava/lang/StringBuilder;

    .line 377
    .line 378
    const-string v3, "view is not a child, cannot hide "

    .line 379
    .line 380
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 384
    .line 385
    .line 386
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    throw v0

    .line 394
    :cond_11
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 395
    .line 396
    .line 397
    move-result v7

    .line 398
    move v10, v8

    .line 399
    :goto_a
    if-ge v10, v7, :cond_13

    .line 400
    .line 401
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 402
    .line 403
    .line 404
    move-result-object v12

    .line 405
    check-cast v12, Ld2/V;

    .line 406
    .line 407
    invoke-virtual {v12}, Ld2/V;->f()Z

    .line 408
    .line 409
    .line 410
    move-result v13

    .line 411
    if-nez v13, :cond_12

    .line 412
    .line 413
    invoke-virtual {v12}, Ld2/V;->b()I

    .line 414
    .line 415
    .line 416
    move-result v13

    .line 417
    if-ne v13, v0, :cond_12

    .line 418
    .line 419
    invoke-virtual {v12}, Ld2/V;->d()Z

    .line 420
    .line 421
    .line 422
    move-result v13

    .line 423
    if-nez v13, :cond_12

    .line 424
    .line 425
    invoke-virtual {v11, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    move-object v10, v12

    .line 429
    goto :goto_b

    .line 430
    :cond_12
    add-int/lit8 v10, v10, 0x1

    .line 431
    .line 432
    goto :goto_a

    .line 433
    :cond_13
    const/4 v10, 0x0

    .line 434
    :goto_b
    if-eqz v10, :cond_1d

    .line 435
    .line 436
    invoke-virtual {v10}, Ld2/V;->h()Z

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    if-eqz v7, :cond_14

    .line 441
    .line 442
    iget-boolean v7, v3, Ld2/S;->g:Z

    .line 443
    .line 444
    goto :goto_c

    .line 445
    :cond_14
    iget v7, v10, Ld2/V;->c:I

    .line 446
    .line 447
    if-ltz v7, :cond_1b

    .line 448
    .line 449
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 450
    .line 451
    invoke-virtual {v12}, Ld2/z;->a()I

    .line 452
    .line 453
    .line 454
    move-result v12

    .line 455
    if-ge v7, v12, :cond_1b

    .line 456
    .line 457
    iget-boolean v7, v3, Ld2/S;->g:Z

    .line 458
    .line 459
    if-nez v7, :cond_16

    .line 460
    .line 461
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 462
    .line 463
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 464
    .line 465
    .line 466
    iget v7, v10, Ld2/V;->f:I

    .line 467
    .line 468
    if-eqz v7, :cond_16

    .line 469
    .line 470
    :cond_15
    move v7, v8

    .line 471
    goto :goto_c

    .line 472
    :cond_16
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 473
    .line 474
    iget-boolean v12, v7, Ld2/z;->b:Z

    .line 475
    .line 476
    if-eqz v12, :cond_17

    .line 477
    .line 478
    iget-wide v12, v10, Ld2/V;->e:J

    .line 479
    .line 480
    iget v14, v10, Ld2/V;->c:I

    .line 481
    .line 482
    invoke-virtual {v7, v14}, Ld2/z;->b(I)J

    .line 483
    .line 484
    .line 485
    move-result-wide v14

    .line 486
    cmp-long v7, v12, v14

    .line 487
    .line 488
    if-nez v7, :cond_15

    .line 489
    .line 490
    :cond_17
    move/from16 v7, v16

    .line 491
    .line 492
    :goto_c
    if-nez v7, :cond_1a

    .line 493
    .line 494
    const/4 v7, 0x4

    .line 495
    invoke-virtual {v10, v7}, Ld2/V;->a(I)V

    .line 496
    .line 497
    .line 498
    invoke-virtual {v10}, Ld2/V;->i()Z

    .line 499
    .line 500
    .line 501
    move-result v7

    .line 502
    if-eqz v7, :cond_18

    .line 503
    .line 504
    iget-object v7, v10, Ld2/V;->a:Landroid/view/View;

    .line 505
    .line 506
    invoke-virtual {v2, v7, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 507
    .line 508
    .line 509
    iget-object v7, v10, Ld2/V;->n:Ld2/M;

    .line 510
    .line 511
    invoke-virtual {v7, v10}, Ld2/M;->j(Ld2/V;)V

    .line 512
    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_18
    invoke-virtual {v10}, Ld2/V;->p()Z

    .line 516
    .line 517
    .line 518
    move-result v7

    .line 519
    if-eqz v7, :cond_19

    .line 520
    .line 521
    iget v7, v10, Ld2/V;->j:I

    .line 522
    .line 523
    and-int/lit8 v7, v7, -0x21

    .line 524
    .line 525
    iput v7, v10, Ld2/V;->j:I

    .line 526
    .line 527
    :cond_19
    :goto_d
    invoke-virtual {v1, v10}, Ld2/M;->g(Ld2/V;)V

    .line 528
    .line 529
    .line 530
    const/4 v10, 0x0

    .line 531
    goto :goto_e

    .line 532
    :cond_1a
    move/from16 v4, v16

    .line 533
    .line 534
    goto :goto_e

    .line 535
    :cond_1b
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    .line 536
    .line 537
    new-instance v3, Ljava/lang/StringBuilder;

    .line 538
    .line 539
    const-string v4, "Inconsistency detected. Invalid view holder adapter position"

    .line 540
    .line 541
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 542
    .line 543
    .line 544
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 545
    .line 546
    .line 547
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 548
    .line 549
    .line 550
    move-result-object v2

    .line 551
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 552
    .line 553
    .line 554
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v2

    .line 558
    invoke-direct {v0, v2}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 559
    .line 560
    .line 561
    throw v0

    .line 562
    :cond_1c
    const/16 v16, 0x1

    .line 563
    .line 564
    :cond_1d
    :goto_e
    const-wide/16 v17, 0x0

    .line 565
    .line 566
    const-wide v19, 0x7fffffffffffffffL

    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    if-nez v10, :cond_33

    .line 572
    .line 573
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 574
    .line 575
    invoke-virtual {v7, v0, v8}, LL0/l;->i(II)I

    .line 576
    .line 577
    .line 578
    move-result v7

    .line 579
    if-ltz v7, :cond_32

    .line 580
    .line 581
    const-wide/16 v21, 0x3

    .line 582
    .line 583
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 584
    .line 585
    invoke-virtual {v12}, Ld2/z;->a()I

    .line 586
    .line 587
    .line 588
    move-result v12

    .line 589
    if-ge v7, v12, :cond_32

    .line 590
    .line 591
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 592
    .line 593
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 594
    .line 595
    .line 596
    iget-object v12, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 597
    .line 598
    iget-boolean v13, v12, Ld2/z;->b:Z

    .line 599
    .line 600
    if-eqz v13, :cond_25

    .line 601
    .line 602
    invoke-virtual {v12, v7}, Ld2/z;->b(I)J

    .line 603
    .line 604
    .line 605
    move-result-wide v12

    .line 606
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 607
    .line 608
    .line 609
    move-result v10

    .line 610
    add-int/lit8 v10, v10, -0x1

    .line 611
    .line 612
    :goto_f
    if-ltz v10, :cond_21

    .line 613
    .line 614
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 615
    .line 616
    .line 617
    move-result-object v23

    .line 618
    const-wide/16 v24, 0x4

    .line 619
    .line 620
    move-object/from16 v14, v23

    .line 621
    .line 622
    check-cast v14, Ld2/V;

    .line 623
    .line 624
    move/from16 v23, v7

    .line 625
    .line 626
    iget-wide v6, v14, Ld2/V;->e:J

    .line 627
    .line 628
    iget-object v15, v14, Ld2/V;->a:Landroid/view/View;

    .line 629
    .line 630
    cmp-long v6, v6, v12

    .line 631
    .line 632
    if-nez v6, :cond_20

    .line 633
    .line 634
    invoke-virtual {v14}, Ld2/V;->p()Z

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    if-nez v6, :cond_20

    .line 639
    .line 640
    iget v6, v14, Ld2/V;->f:I

    .line 641
    .line 642
    if-nez v6, :cond_1f

    .line 643
    .line 644
    invoke-virtual {v14, v5}, Ld2/V;->a(I)V

    .line 645
    .line 646
    .line 647
    invoke-virtual {v14}, Ld2/V;->h()Z

    .line 648
    .line 649
    .line 650
    move-result v5

    .line 651
    if-eqz v5, :cond_1e

    .line 652
    .line 653
    iget-boolean v5, v3, Ld2/S;->g:Z

    .line 654
    .line 655
    if-nez v5, :cond_1e

    .line 656
    .line 657
    iget v5, v14, Ld2/V;->j:I

    .line 658
    .line 659
    and-int/lit8 v5, v5, -0xf

    .line 660
    .line 661
    or-int/lit8 v5, v5, 0x2

    .line 662
    .line 663
    iput v5, v14, Ld2/V;->j:I

    .line 664
    .line 665
    :cond_1e
    move-object v10, v14

    .line 666
    goto :goto_11

    .line 667
    :cond_1f
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 668
    .line 669
    .line 670
    invoke-virtual {v2, v15, v8}, Landroidx/recyclerview/widget/RecyclerView;->removeDetachedView(Landroid/view/View;Z)V

    .line 671
    .line 672
    .line 673
    invoke-static {v15}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 674
    .line 675
    .line 676
    move-result-object v6

    .line 677
    const/4 v15, 0x0

    .line 678
    iput-object v15, v6, Ld2/V;->n:Ld2/M;

    .line 679
    .line 680
    iput-boolean v8, v6, Ld2/V;->o:Z

    .line 681
    .line 682
    iget v7, v6, Ld2/V;->j:I

    .line 683
    .line 684
    and-int/lit8 v7, v7, -0x21

    .line 685
    .line 686
    iput v7, v6, Ld2/V;->j:I

    .line 687
    .line 688
    invoke-virtual {v1, v6}, Ld2/M;->g(Ld2/V;)V

    .line 689
    .line 690
    .line 691
    :cond_20
    add-int/lit8 v10, v10, -0x1

    .line 692
    .line 693
    move/from16 v7, v23

    .line 694
    .line 695
    goto :goto_f

    .line 696
    :cond_21
    move/from16 v23, v7

    .line 697
    .line 698
    const-wide/16 v24, 0x4

    .line 699
    .line 700
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 701
    .line 702
    .line 703
    move-result v5

    .line 704
    add-int/lit8 v5, v5, -0x1

    .line 705
    .line 706
    :goto_10
    if-ltz v5, :cond_23

    .line 707
    .line 708
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object v6

    .line 712
    check-cast v6, Ld2/V;

    .line 713
    .line 714
    iget-wide v9, v6, Ld2/V;->e:J

    .line 715
    .line 716
    cmp-long v7, v9, v12

    .line 717
    .line 718
    if-nez v7, :cond_24

    .line 719
    .line 720
    invoke-virtual {v6}, Ld2/V;->d()Z

    .line 721
    .line 722
    .line 723
    move-result v7

    .line 724
    if-nez v7, :cond_24

    .line 725
    .line 726
    iget v7, v6, Ld2/V;->f:I

    .line 727
    .line 728
    if-nez v7, :cond_22

    .line 729
    .line 730
    invoke-virtual {v11, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    move-object v10, v6

    .line 734
    goto :goto_11

    .line 735
    :cond_22
    invoke-virtual {v1, v5}, Ld2/M;->e(I)V

    .line 736
    .line 737
    .line 738
    :cond_23
    const/4 v10, 0x0

    .line 739
    goto :goto_11

    .line 740
    :cond_24
    add-int/lit8 v5, v5, -0x1

    .line 741
    .line 742
    goto :goto_10

    .line 743
    :goto_11
    if-eqz v10, :cond_26

    .line 744
    .line 745
    move/from16 v5, v23

    .line 746
    .line 747
    iput v5, v10, Ld2/V;->c:I

    .line 748
    .line 749
    move/from16 v4, v16

    .line 750
    .line 751
    goto :goto_12

    .line 752
    :cond_25
    const-wide/16 v24, 0x4

    .line 753
    .line 754
    :cond_26
    :goto_12
    if-nez v10, :cond_2a

    .line 755
    .line 756
    invoke-virtual {v1}, Ld2/M;->c()Ld2/L;

    .line 757
    .line 758
    .line 759
    move-result-object v5

    .line 760
    iget-object v5, v5, Ld2/L;->a:Landroid/util/SparseArray;

    .line 761
    .line 762
    invoke-virtual {v5, v8}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    .line 763
    .line 764
    .line 765
    move-result-object v5

    .line 766
    check-cast v5, Ld2/K;

    .line 767
    .line 768
    if-eqz v5, :cond_28

    .line 769
    .line 770
    iget-object v5, v5, Ld2/K;->a:Ljava/util/ArrayList;

    .line 771
    .line 772
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 773
    .line 774
    .line 775
    move-result v6

    .line 776
    if-nez v6, :cond_28

    .line 777
    .line 778
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 779
    .line 780
    .line 781
    move-result v6

    .line 782
    add-int/lit8 v6, v6, -0x1

    .line 783
    .line 784
    :goto_13
    if-ltz v6, :cond_28

    .line 785
    .line 786
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 787
    .line 788
    .line 789
    move-result-object v7

    .line 790
    check-cast v7, Ld2/V;

    .line 791
    .line 792
    invoke-virtual {v7}, Ld2/V;->d()Z

    .line 793
    .line 794
    .line 795
    move-result v7

    .line 796
    if-nez v7, :cond_27

    .line 797
    .line 798
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 799
    .line 800
    .line 801
    move-result-object v5

    .line 802
    move-object/from16 v26, v5

    .line 803
    .line 804
    check-cast v26, Ld2/V;

    .line 805
    .line 806
    goto :goto_14

    .line 807
    :cond_27
    add-int/lit8 v6, v6, -0x1

    .line 808
    .line 809
    goto :goto_13

    .line 810
    :cond_28
    const/16 v26, 0x0

    .line 811
    .line 812
    :goto_14
    if-eqz v26, :cond_29

    .line 813
    .line 814
    invoke-virtual/range {v26 .. v26}, Ld2/V;->m()V

    .line 815
    .line 816
    .line 817
    sget-object v5, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 818
    .line 819
    :cond_29
    move-object/from16 v10, v26

    .line 820
    .line 821
    :cond_2a
    if-nez v10, :cond_31

    .line 822
    .line 823
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 824
    .line 825
    .line 826
    move-result-wide v5

    .line 827
    cmp-long v7, p2, v19

    .line 828
    .line 829
    if-eqz v7, :cond_2d

    .line 830
    .line 831
    iget-object v7, v1, Ld2/M;->g:Ld2/L;

    .line 832
    .line 833
    invoke-virtual {v7, v8}, Ld2/L;->a(I)Ld2/K;

    .line 834
    .line 835
    .line 836
    move-result-object v7

    .line 837
    iget-wide v9, v7, Ld2/K;->c:J

    .line 838
    .line 839
    cmp-long v7, v9, v17

    .line 840
    .line 841
    if-eqz v7, :cond_2c

    .line 842
    .line 843
    add-long/2addr v9, v5

    .line 844
    cmp-long v7, v9, p2

    .line 845
    .line 846
    if-gez v7, :cond_2b

    .line 847
    .line 848
    goto :goto_15

    .line 849
    :cond_2b
    move v7, v8

    .line 850
    goto :goto_16

    .line 851
    :cond_2c
    :goto_15
    move/from16 v7, v16

    .line 852
    .line 853
    :goto_16
    if-nez v7, :cond_2d

    .line 854
    .line 855
    const/4 v15, 0x0

    .line 856
    return-object v15

    .line 857
    :cond_2d
    const/4 v15, 0x0

    .line 858
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 859
    .line 860
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 861
    .line 862
    .line 863
    :try_start_0
    const-string v9, "RV CreateView"

    .line 864
    .line 865
    sget v10, Lr1/g;->a:I

    .line 866
    .line 867
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v7, v2}, Ld2/z;->d(Landroid/view/ViewGroup;)Ld2/V;

    .line 871
    .line 872
    .line 873
    move-result-object v10

    .line 874
    iget-object v7, v10, Ld2/V;->a:Landroid/view/View;

    .line 875
    .line 876
    invoke-virtual {v7}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 877
    .line 878
    .line 879
    move-result-object v9

    .line 880
    if-nez v9, :cond_30

    .line 881
    .line 882
    iput v8, v10, Ld2/V;->f:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 883
    .line 884
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 885
    .line 886
    .line 887
    sget-object v9, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 888
    .line 889
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 890
    .line 891
    .line 892
    move-result-object v7

    .line 893
    if-eqz v7, :cond_2e

    .line 894
    .line 895
    new-instance v9, Ljava/lang/ref/WeakReference;

    .line 896
    .line 897
    invoke-direct {v9, v7}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 898
    .line 899
    .line 900
    iput-object v9, v10, Ld2/V;->b:Ljava/lang/ref/WeakReference;

    .line 901
    .line 902
    :cond_2e
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 903
    .line 904
    .line 905
    move-result-wide v11

    .line 906
    iget-object v7, v1, Ld2/M;->g:Ld2/L;

    .line 907
    .line 908
    sub-long/2addr v11, v5

    .line 909
    invoke-virtual {v7, v8}, Ld2/L;->a(I)Ld2/K;

    .line 910
    .line 911
    .line 912
    move-result-object v5

    .line 913
    iget-wide v6, v5, Ld2/K;->c:J

    .line 914
    .line 915
    cmp-long v9, v6, v17

    .line 916
    .line 917
    if-nez v9, :cond_2f

    .line 918
    .line 919
    goto :goto_17

    .line 920
    :cond_2f
    div-long v6, v6, v24

    .line 921
    .line 922
    mul-long v6, v6, v21

    .line 923
    .line 924
    div-long v11, v11, v24

    .line 925
    .line 926
    add-long/2addr v11, v6

    .line 927
    :goto_17
    iput-wide v11, v5, Ld2/K;->c:J

    .line 928
    .line 929
    goto :goto_19

    .line 930
    :catchall_0
    move-exception v0

    .line 931
    goto :goto_18

    .line 932
    :cond_30
    :try_start_1
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 933
    .line 934
    const-string v2, "ViewHolder views must not be attached when created. Ensure that you are not passing \'true\' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)"

    .line 935
    .line 936
    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 940
    :goto_18
    sget v2, Lr1/g;->a:I

    .line 941
    .line 942
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 943
    .line 944
    .line 945
    throw v0

    .line 946
    :cond_31
    const/4 v15, 0x0

    .line 947
    goto :goto_19

    .line 948
    :cond_32
    move v5, v7

    .line 949
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    .line 950
    .line 951
    new-instance v6, Ljava/lang/StringBuilder;

    .line 952
    .line 953
    const-string v7, "Inconsistency detected. Invalid item position "

    .line 954
    .line 955
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 956
    .line 957
    .line 958
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 959
    .line 960
    .line 961
    const-string v0, "(offset:"

    .line 962
    .line 963
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 964
    .line 965
    .line 966
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 967
    .line 968
    .line 969
    const-string v0, ").state:"

    .line 970
    .line 971
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 972
    .line 973
    .line 974
    invoke-virtual {v3}, Ld2/S;->b()I

    .line 975
    .line 976
    .line 977
    move-result v0

    .line 978
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 979
    .line 980
    .line 981
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 982
    .line 983
    .line 984
    move-result-object v0

    .line 985
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 986
    .line 987
    .line 988
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v0

    .line 992
    invoke-direct {v4, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 993
    .line 994
    .line 995
    throw v4

    .line 996
    :cond_33
    const/4 v15, 0x0

    .line 997
    const-wide/16 v21, 0x3

    .line 998
    .line 999
    const-wide/16 v24, 0x4

    .line 1000
    .line 1001
    :goto_19
    iget-object v5, v10, Ld2/V;->a:Landroid/view/View;

    .line 1002
    .line 1003
    if-eqz v4, :cond_35

    .line 1004
    .line 1005
    iget-boolean v6, v3, Ld2/S;->g:Z

    .line 1006
    .line 1007
    if-nez v6, :cond_35

    .line 1008
    .line 1009
    iget v6, v10, Ld2/V;->j:I

    .line 1010
    .line 1011
    and-int/lit16 v7, v6, 0x2000

    .line 1012
    .line 1013
    if-eqz v7, :cond_34

    .line 1014
    .line 1015
    move/from16 v7, v16

    .line 1016
    .line 1017
    goto :goto_1a

    .line 1018
    :cond_34
    move v7, v8

    .line 1019
    :goto_1a
    if-eqz v7, :cond_35

    .line 1020
    .line 1021
    and-int/lit16 v6, v6, -0x2001

    .line 1022
    .line 1023
    iput v6, v10, Ld2/V;->j:I

    .line 1024
    .line 1025
    iget-boolean v6, v3, Ld2/S;->j:Z

    .line 1026
    .line 1027
    if-eqz v6, :cond_35

    .line 1028
    .line 1029
    invoke-static {v10}, Ld2/D;->b(Ld2/V;)V

    .line 1030
    .line 1031
    .line 1032
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 1033
    .line 1034
    invoke-virtual {v10}, Ld2/V;->c()Ljava/util/List;

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1038
    .line 1039
    .line 1040
    new-instance v6, LM/t;

    .line 1041
    .line 1042
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v6, v10}, LM/t;->a(Ld2/V;)V

    .line 1046
    .line 1047
    .line 1048
    invoke-virtual {v2, v10, v6}, Landroidx/recyclerview/widget/RecyclerView;->T(Ld2/V;LM/t;)V

    .line 1049
    .line 1050
    .line 1051
    :cond_35
    iget-boolean v6, v3, Ld2/S;->g:Z

    .line 1052
    .line 1053
    if-eqz v6, :cond_36

    .line 1054
    .line 1055
    invoke-virtual {v10}, Ld2/V;->e()Z

    .line 1056
    .line 1057
    .line 1058
    move-result v6

    .line 1059
    if-eqz v6, :cond_36

    .line 1060
    .line 1061
    iput v0, v10, Ld2/V;->g:I

    .line 1062
    .line 1063
    goto :goto_1c

    .line 1064
    :cond_36
    invoke-virtual {v10}, Ld2/V;->e()Z

    .line 1065
    .line 1066
    .line 1067
    move-result v6

    .line 1068
    if-eqz v6, :cond_39

    .line 1069
    .line 1070
    iget v6, v10, Ld2/V;->j:I

    .line 1071
    .line 1072
    and-int/lit8 v6, v6, 0x2

    .line 1073
    .line 1074
    if-eqz v6, :cond_37

    .line 1075
    .line 1076
    move/from16 v6, v16

    .line 1077
    .line 1078
    goto :goto_1b

    .line 1079
    :cond_37
    move v6, v8

    .line 1080
    :goto_1b
    if-nez v6, :cond_39

    .line 1081
    .line 1082
    invoke-virtual {v10}, Ld2/V;->f()Z

    .line 1083
    .line 1084
    .line 1085
    move-result v6

    .line 1086
    if-eqz v6, :cond_38

    .line 1087
    .line 1088
    goto :goto_1d

    .line 1089
    :cond_38
    :goto_1c
    move v0, v8

    .line 1090
    move/from16 v7, v16

    .line 1091
    .line 1092
    goto/16 :goto_22

    .line 1093
    .line 1094
    :cond_39
    :goto_1d
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 1095
    .line 1096
    invoke-virtual {v6, v0, v8}, LL0/l;->i(II)I

    .line 1097
    .line 1098
    .line 1099
    move-result v6

    .line 1100
    iput-object v2, v10, Ld2/V;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 1101
    .line 1102
    iget v7, v10, Ld2/V;->f:I

    .line 1103
    .line 1104
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1105
    .line 1106
    .line 1107
    move-result-wide v11

    .line 1108
    cmp-long v9, p2, v19

    .line 1109
    .line 1110
    if-eqz v9, :cond_3a

    .line 1111
    .line 1112
    iget-object v9, v1, Ld2/M;->g:Ld2/L;

    .line 1113
    .line 1114
    invoke-virtual {v9, v7}, Ld2/L;->a(I)Ld2/K;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v7

    .line 1118
    iget-wide v13, v7, Ld2/K;->d:J

    .line 1119
    .line 1120
    cmp-long v7, v13, v17

    .line 1121
    .line 1122
    if-eqz v7, :cond_3a

    .line 1123
    .line 1124
    add-long/2addr v13, v11

    .line 1125
    cmp-long v7, v13, p2

    .line 1126
    .line 1127
    if-gez v7, :cond_38

    .line 1128
    .line 1129
    :cond_3a
    iget-object v7, v2, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 1130
    .line 1131
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1132
    .line 1133
    .line 1134
    iput v6, v10, Ld2/V;->c:I

    .line 1135
    .line 1136
    iget-boolean v9, v7, Ld2/z;->b:Z

    .line 1137
    .line 1138
    if-eqz v9, :cond_3b

    .line 1139
    .line 1140
    invoke-virtual {v7, v6}, Ld2/z;->b(I)J

    .line 1141
    .line 1142
    .line 1143
    move-result-wide v13

    .line 1144
    iput-wide v13, v10, Ld2/V;->e:J

    .line 1145
    .line 1146
    :cond_3b
    iget v9, v10, Ld2/V;->j:I

    .line 1147
    .line 1148
    and-int/lit16 v9, v9, -0x208

    .line 1149
    .line 1150
    or-int/lit8 v9, v9, 0x1

    .line 1151
    .line 1152
    iput v9, v10, Ld2/V;->j:I

    .line 1153
    .line 1154
    sget v9, Lr1/g;->a:I

    .line 1155
    .line 1156
    const-string v9, "RV OnBindView"

    .line 1157
    .line 1158
    invoke-static {v9}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 1159
    .line 1160
    .line 1161
    invoke-virtual {v10}, Ld2/V;->c()Ljava/util/List;

    .line 1162
    .line 1163
    .line 1164
    invoke-virtual {v7, v10, v6}, Ld2/z;->c(Ld2/V;I)V

    .line 1165
    .line 1166
    .line 1167
    iget-object v6, v10, Ld2/V;->k:Ljava/util/ArrayList;

    .line 1168
    .line 1169
    if-eqz v6, :cond_3c

    .line 1170
    .line 1171
    invoke-virtual {v6}, Ljava/util/ArrayList;->clear()V

    .line 1172
    .line 1173
    .line 1174
    :cond_3c
    iget v6, v10, Ld2/V;->j:I

    .line 1175
    .line 1176
    and-int/lit16 v6, v6, -0x401

    .line 1177
    .line 1178
    iput v6, v10, Ld2/V;->j:I

    .line 1179
    .line 1180
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v6

    .line 1184
    instance-of v7, v6, Ld2/H;

    .line 1185
    .line 1186
    if-eqz v7, :cond_3d

    .line 1187
    .line 1188
    check-cast v6, Ld2/H;

    .line 1189
    .line 1190
    move/from16 v7, v16

    .line 1191
    .line 1192
    iput-boolean v7, v6, Ld2/H;->c:Z

    .line 1193
    .line 1194
    :cond_3d
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 1195
    .line 1196
    .line 1197
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getNanoTime()J

    .line 1198
    .line 1199
    .line 1200
    move-result-wide v6

    .line 1201
    iget-object v9, v1, Ld2/M;->g:Ld2/L;

    .line 1202
    .line 1203
    iget v13, v10, Ld2/V;->f:I

    .line 1204
    .line 1205
    sub-long/2addr v6, v11

    .line 1206
    invoke-virtual {v9, v13}, Ld2/L;->a(I)Ld2/K;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v9

    .line 1210
    iget-wide v11, v9, Ld2/K;->d:J

    .line 1211
    .line 1212
    cmp-long v13, v11, v17

    .line 1213
    .line 1214
    if-nez v13, :cond_3e

    .line 1215
    .line 1216
    goto :goto_1e

    .line 1217
    :cond_3e
    div-long v11, v11, v24

    .line 1218
    .line 1219
    mul-long v11, v11, v21

    .line 1220
    .line 1221
    div-long v6, v6, v24

    .line 1222
    .line 1223
    add-long/2addr v6, v11

    .line 1224
    :goto_1e
    iput-wide v6, v9, Ld2/K;->d:J

    .line 1225
    .line 1226
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->N:Landroid/view/accessibility/AccessibilityManager;

    .line 1227
    .line 1228
    if-eqz v6, :cond_3f

    .line 1229
    .line 1230
    invoke-virtual {v6}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 1231
    .line 1232
    .line 1233
    move-result v6

    .line 1234
    if-eqz v6, :cond_3f

    .line 1235
    .line 1236
    const/4 v7, 0x1

    .line 1237
    goto :goto_1f

    .line 1238
    :cond_3f
    move v7, v8

    .line 1239
    :goto_1f
    if-eqz v7, :cond_45

    .line 1240
    .line 1241
    sget-object v6, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 1242
    .line 1243
    invoke-virtual {v5}, Landroid/view/View;->getImportantForAccessibility()I

    .line 1244
    .line 1245
    .line 1246
    move-result v6

    .line 1247
    const/4 v7, 0x1

    .line 1248
    if-nez v6, :cond_40

    .line 1249
    .line 1250
    invoke-virtual {v5, v7}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 1251
    .line 1252
    .line 1253
    :cond_40
    iget-object v6, v2, Landroidx/recyclerview/widget/RecyclerView;->z0:Ld2/X;

    .line 1254
    .line 1255
    if-nez v6, :cond_41

    .line 1256
    .line 1257
    goto :goto_21

    .line 1258
    :cond_41
    iget-object v6, v6, Ld2/X;->e:Ld2/W;

    .line 1259
    .line 1260
    if-eqz v6, :cond_44

    .line 1261
    .line 1262
    invoke-static {v5}, Lw1/K;->d(Landroid/view/View;)Landroid/view/View$AccessibilityDelegate;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v9

    .line 1266
    if-nez v9, :cond_42

    .line 1267
    .line 1268
    goto :goto_20

    .line 1269
    :cond_42
    instance-of v11, v9, Lw1/a;

    .line 1270
    .line 1271
    if-eqz v11, :cond_43

    .line 1272
    .line 1273
    check-cast v9, Lw1/a;

    .line 1274
    .line 1275
    iget-object v9, v9, Lw1/a;->a:Lw1/b;

    .line 1276
    .line 1277
    move-object v15, v9

    .line 1278
    goto :goto_20

    .line 1279
    :cond_43
    new-instance v11, Lw1/b;

    .line 1280
    .line 1281
    invoke-direct {v11, v9}, Lw1/b;-><init>(Landroid/view/View$AccessibilityDelegate;)V

    .line 1282
    .line 1283
    .line 1284
    move-object v15, v11

    .line 1285
    :goto_20
    if-eqz v15, :cond_44

    .line 1286
    .line 1287
    if-eq v15, v6, :cond_44

    .line 1288
    .line 1289
    iget-object v9, v6, Ld2/W;->e:Ljava/util/WeakHashMap;

    .line 1290
    .line 1291
    invoke-virtual {v9, v5, v15}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1292
    .line 1293
    .line 1294
    :cond_44
    invoke-static {v5, v6}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 1295
    .line 1296
    .line 1297
    goto :goto_21

    .line 1298
    :cond_45
    const/4 v7, 0x1

    .line 1299
    :goto_21
    iget-boolean v3, v3, Ld2/S;->g:Z

    .line 1300
    .line 1301
    if-eqz v3, :cond_46

    .line 1302
    .line 1303
    iput v0, v10, Ld2/V;->g:I

    .line 1304
    .line 1305
    :cond_46
    move v0, v7

    .line 1306
    :goto_22
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v3

    .line 1310
    if-nez v3, :cond_47

    .line 1311
    .line 1312
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1313
    .line 1314
    .line 1315
    move-result-object v2

    .line 1316
    check-cast v2, Ld2/H;

    .line 1317
    .line 1318
    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1319
    .line 1320
    .line 1321
    goto :goto_23

    .line 1322
    :cond_47
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z

    .line 1323
    .line 1324
    .line 1325
    move-result v6

    .line 1326
    if-nez v6, :cond_48

    .line 1327
    .line 1328
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v2

    .line 1332
    check-cast v2, Ld2/H;

    .line 1333
    .line 1334
    invoke-virtual {v5, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1335
    .line 1336
    .line 1337
    goto :goto_23

    .line 1338
    :cond_48
    move-object v2, v3

    .line 1339
    check-cast v2, Ld2/H;

    .line 1340
    .line 1341
    :goto_23
    iput-object v10, v2, Ld2/H;->a:Ld2/V;

    .line 1342
    .line 1343
    if-eqz v4, :cond_49

    .line 1344
    .line 1345
    if-eqz v0, :cond_49

    .line 1346
    .line 1347
    goto :goto_24

    .line 1348
    :cond_49
    move v7, v8

    .line 1349
    :goto_24
    iput-boolean v7, v2, Ld2/H;->d:Z

    .line 1350
    .line 1351
    return-object v10

    .line 1352
    :cond_4a
    new-instance v4, Ljava/lang/IndexOutOfBoundsException;

    .line 1353
    .line 1354
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1355
    .line 1356
    const-string v6, "Invalid item position "

    .line 1357
    .line 1358
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1359
    .line 1360
    .line 1361
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1362
    .line 1363
    .line 1364
    const-string v6, "("

    .line 1365
    .line 1366
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1367
    .line 1368
    .line 1369
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1370
    .line 1371
    .line 1372
    const-string v0, "). Item count:"

    .line 1373
    .line 1374
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1375
    .line 1376
    .line 1377
    invoke-virtual {v3}, Ld2/S;->b()I

    .line 1378
    .line 1379
    .line 1380
    move-result v0

    .line 1381
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1382
    .line 1383
    .line 1384
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 1385
    .line 1386
    .line 1387
    move-result-object v0

    .line 1388
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1389
    .line 1390
    .line 1391
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v0

    .line 1395
    invoke-direct {v4, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 1396
    .line 1397
    .line 1398
    throw v4
.end method

.method public final j(Ld2/V;)V
    .locals 1

    .line 1
    iget-boolean v0, p1, Ld2/V;->o:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Ld2/M;->b:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    iget-object v0, p0, Ld2/M;->a:Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    :goto_0
    const/4 v0, 0x0

    .line 17
    iput-object v0, p1, Ld2/V;->n:Ld2/M;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    iput-boolean v0, p1, Ld2/V;->o:Z

    .line 21
    .line 22
    iget v0, p1, Ld2/V;->j:I

    .line 23
    .line 24
    and-int/lit8 v0, v0, -0x21

    .line 25
    .line 26
    iput v0, p1, Ld2/V;->j:I

    .line 27
    .line 28
    return-void
.end method

.method public final k()V
    .locals 4

    .line 1
    iget-object v0, p0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 2
    .line 3
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget v0, v0, Ld2/G;->j:I

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    iget v1, p0, Ld2/M;->e:I

    .line 12
    .line 13
    add-int/2addr v1, v0

    .line 14
    iput v1, p0, Ld2/M;->f:I

    .line 15
    .line 16
    iget-object v0, p0, Ld2/M;->c:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    add-int/lit8 v1, v1, -0x1

    .line 23
    .line 24
    :goto_1
    if-ltz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    iget v3, p0, Ld2/M;->f:I

    .line 31
    .line 32
    if-le v2, v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {p0, v1}, Ld2/M;->e(I)V

    .line 35
    .line 36
    .line 37
    add-int/lit8 v1, v1, -0x1

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    return-void
.end method
