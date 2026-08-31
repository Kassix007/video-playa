.class public final LX/j;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/Set;

.field public final b:LR/e;

.field public c:LR/e;

.field public final d:LR/e;

.field public final e:LR/e;

.field public f:Lr/H;

.field public final g:Ljava/util/ArrayList;

.field public final h:Lr/u;

.field public final i:Lr/u;

.field public j:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/util/Set;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LX/j;->a:Ljava/util/Set;

    .line 5
    .line 6
    new-instance p1, LR/e;

    .line 7
    .line 8
    const/16 v0, 0x10

    .line 9
    .line 10
    new-array v1, v0, [LP/x0;

    .line 11
    .line 12
    invoke-direct {p1, v1}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, LX/j;->b:LR/e;

    .line 16
    .line 17
    iput-object p1, p0, LX/j;->c:LR/e;

    .line 18
    .line 19
    new-instance p1, LR/e;

    .line 20
    .line 21
    new-array v1, v0, [Ljava/lang/Object;

    .line 22
    .line 23
    invoke-direct {p1, v1}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iput-object p1, p0, LX/j;->d:LR/e;

    .line 27
    .line 28
    new-instance p1, LR/e;

    .line 29
    .line 30
    new-array v0, v0, [LB5/a;

    .line 31
    .line 32
    invoke-direct {p1, v0}, LR/e;-><init>([Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    iput-object p1, p0, LX/j;->e:LR/e;

    .line 36
    .line 37
    new-instance p1, Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, LX/j;->g:Ljava/util/ArrayList;

    .line 43
    .line 44
    new-instance p1, Lr/u;

    .line 45
    .line 46
    invoke-direct {p1}, Lr/u;-><init>()V

    .line 47
    .line 48
    .line 49
    iput-object p1, p0, LX/j;->h:Lr/u;

    .line 50
    .line 51
    new-instance p1, Lr/u;

    .line 52
    .line 53
    invoke-direct {p1}, Lr/u;-><init>()V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, LX/j;->i:Lr/u;

    .line 57
    .line 58
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 1
    iget-object v0, p0, LX/j;->a:Ljava/util/Set;

    .line 2
    .line 3
    move-object v1, v0

    .line 4
    check-cast v1, Ljava/util/Collection;

    .line 5
    .line 6
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-nez v1, :cond_1

    .line 11
    .line 12
    const-string v1, "Compose:abandons"

    .line 13
    .line 14
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    :try_start_0
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, LP/w0;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, LP/w0;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    return-void

    .line 46
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 47
    .line 48
    .line 49
    throw v0

    .line 50
    :cond_1
    return-void
.end method

.method public final b()V
    .locals 6

    .line 1
    const/high16 v0, -0x80000000

    .line 2
    .line 3
    invoke-virtual {p0, v0}, LX/j;->c(I)V

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LX/j;->d:LR/e;

    .line 7
    .line 8
    iget v1, v0, LR/e;->s:I

    .line 9
    .line 10
    iget-object v2, p0, LX/j;->a:Ljava/util/Set;

    .line 11
    .line 12
    if-eqz v1, :cond_4

    .line 13
    .line 14
    const-string v1, "Compose:onForgotten"

    .line 15
    .line 16
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    :try_start_0
    iget-object v1, p0, LX/j;->f:Lr/H;

    .line 20
    .line 21
    iget v3, v0, LR/e;->s:I

    .line 22
    .line 23
    add-int/lit8 v3, v3, -0x1

    .line 24
    .line 25
    :goto_0
    const/4 v4, -0x1

    .line 26
    if-ge v4, v3, :cond_3

    .line 27
    .line 28
    iget-object v4, v0, LR/e;->q:[Ljava/lang/Object;

    .line 29
    .line 30
    aget-object v4, v4, v3

    .line 31
    .line 32
    instance-of v5, v4, LP/x0;

    .line 33
    .line 34
    if-eqz v5, :cond_0

    .line 35
    .line 36
    move-object v5, v4

    .line 37
    check-cast v5, LP/x0;

    .line 38
    .line 39
    iget-object v5, v5, LP/x0;->a:LP/w0;

    .line 40
    .line 41
    invoke-interface {v2, v5}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-interface {v5}, LP/w0;->e()V

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    goto :goto_3

    .line 50
    :cond_0
    :goto_1
    instance-of v5, v4, LP/i;

    .line 51
    .line 52
    if-eqz v5, :cond_2

    .line 53
    .line 54
    if-eqz v1, :cond_1

    .line 55
    .line 56
    invoke-virtual {v1, v4}, Lr/H;->c(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_1

    .line 61
    .line 62
    check-cast v4, LP/i;

    .line 63
    .line 64
    invoke-interface {v4}, LP/i;->f()V

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_1
    check-cast v4, LP/i;

    .line 69
    .line 70
    invoke-interface {v4}, LP/i;->g()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    :cond_2
    :goto_2
    add-int/lit8 v3, v3, -0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 77
    .line 78
    .line 79
    goto :goto_4

    .line 80
    :goto_3
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 81
    .line 82
    .line 83
    throw v0

    .line 84
    :cond_4
    :goto_4
    iget-object v0, p0, LX/j;->b:LR/e;

    .line 85
    .line 86
    iget v1, v0, LR/e;->s:I

    .line 87
    .line 88
    if-eqz v1, :cond_6

    .line 89
    .line 90
    const-string v1, "Compose:onRemembered"

    .line 91
    .line 92
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    :try_start_1
    iget-object v1, v0, LR/e;->q:[Ljava/lang/Object;

    .line 96
    .line 97
    iget v0, v0, LR/e;->s:I

    .line 98
    .line 99
    const/4 v3, 0x0

    .line 100
    :goto_5
    if-ge v3, v0, :cond_5

    .line 101
    .line 102
    aget-object v4, v1, v3

    .line 103
    .line 104
    check-cast v4, LP/x0;

    .line 105
    .line 106
    iget-object v4, v4, LP/x0;->a:LP/w0;

    .line 107
    .line 108
    invoke-interface {v2, v4}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    invoke-interface {v4}, LP/w0;->b()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    .line 113
    .line 114
    add-int/lit8 v3, v3, 0x1

    .line 115
    .line 116
    goto :goto_5

    .line 117
    :cond_5
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :catchall_1
    move-exception v0

    .line 122
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 123
    .line 124
    .line 125
    throw v0

    .line 126
    :cond_6
    return-void
.end method

.method public final c(I)V
    .locals 10

    .line 1
    iget-object v0, p0, LX/j;->g:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-nez v1, :cond_7

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    const/4 v2, 0x0

    .line 11
    move v5, v1

    .line 12
    move-object v3, v2

    .line 13
    move-object v4, v3

    .line 14
    :goto_0
    iget-object v6, p0, LX/j;->i:Lr/u;

    .line 15
    .line 16
    iget v7, v6, Lr/u;->b:I

    .line 17
    .line 18
    const-string v8, "null cannot be cast to non-null type androidx.collection.MutableIntList"

    .line 19
    .line 20
    if-ge v5, v7, :cond_2

    .line 21
    .line 22
    invoke-virtual {v6, v5}, Lr/u;->c(I)I

    .line 23
    .line 24
    .line 25
    move-result v7

    .line 26
    if-gt p1, v7, :cond_1

    .line 27
    .line 28
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v7

    .line 32
    invoke-virtual {v6, v5}, Lr/u;->d(I)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    iget-object v9, p0, LX/j;->h:Lr/u;

    .line 37
    .line 38
    invoke-virtual {v9, v5}, Lr/u;->d(I)I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-nez v2, :cond_0

    .line 43
    .line 44
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-static {v2}, Lcom/google/android/gms/internal/measurement/n2;->C([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    new-instance v4, Lr/u;

    .line 53
    .line 54
    invoke-direct {v4}, Lr/u;-><init>()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4, v6}, Lr/u;->a(I)V

    .line 58
    .line 59
    .line 60
    new-instance v3, Lr/u;

    .line 61
    .line 62
    invoke-direct {v3}, Lr/u;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3, v9}, Lr/u;->a(I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_0
    invoke-static {v3, v8}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2, v7}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v6}, Lr/u;->a(I)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v3, v9}, Lr/u;->a(I)V

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    if-eqz v2, :cond_7

    .line 89
    .line 90
    invoke-static {v3, v8}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-static {v4, v8}, Lkotlin/jvm/internal/m;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 97
    .line 98
    .line 99
    move-result p1

    .line 100
    add-int/lit8 p1, p1, -0x1

    .line 101
    .line 102
    :goto_1
    if-ge v1, p1, :cond_6

    .line 103
    .line 104
    add-int/lit8 v0, v1, 0x1

    .line 105
    .line 106
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    move v6, v0

    .line 111
    :goto_2
    if-ge v6, v5, :cond_5

    .line 112
    .line 113
    invoke-virtual {v4, v1}, Lr/u;->c(I)I

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    invoke-virtual {v4, v6}, Lr/u;->c(I)I

    .line 118
    .line 119
    .line 120
    move-result v8

    .line 121
    if-lt v7, v8, :cond_3

    .line 122
    .line 123
    if-ne v8, v7, :cond_4

    .line 124
    .line 125
    invoke-virtual {v3, v1}, Lr/u;->c(I)I

    .line 126
    .line 127
    .line 128
    move-result v7

    .line 129
    invoke-virtual {v3, v6}, Lr/u;->c(I)I

    .line 130
    .line 131
    .line 132
    move-result v8

    .line 133
    if-ge v7, v8, :cond_4

    .line 134
    .line 135
    :cond_3
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v7

    .line 139
    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v8

    .line 143
    invoke-interface {v2, v1, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    invoke-interface {v2, v6, v7}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v3, v1}, Lr/u;->c(I)I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    invoke-virtual {v3, v6}, Lr/u;->c(I)I

    .line 154
    .line 155
    .line 156
    move-result v8

    .line 157
    invoke-virtual {v3, v1, v8}, Lr/u;->e(II)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v3, v6, v7}, Lr/u;->e(II)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4, v1}, Lr/u;->c(I)I

    .line 164
    .line 165
    .line 166
    move-result v7

    .line 167
    invoke-virtual {v4, v6}, Lr/u;->c(I)I

    .line 168
    .line 169
    .line 170
    move-result v8

    .line 171
    invoke-virtual {v4, v1, v8}, Lr/u;->e(II)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v4, v6, v7}, Lr/u;->e(II)V

    .line 175
    .line 176
    .line 177
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 178
    .line 179
    goto :goto_2

    .line 180
    :cond_5
    move v1, v0

    .line 181
    goto :goto_1

    .line 182
    :cond_6
    iget-object p1, p0, LX/j;->d:LR/e;

    .line 183
    .line 184
    iget v0, p1, LR/e;->s:I

    .line 185
    .line 186
    invoke-virtual {p1, v0, v2}, LR/e;->e(ILjava/util/List;)V

    .line 187
    .line 188
    .line 189
    :cond_7
    return-void
.end method

.method public final d(Ljava/lang/Object;III)V
    .locals 0

    .line 1
    invoke-virtual {p0, p2}, LX/j;->c(I)V

    .line 2
    .line 3
    .line 4
    if-ltz p4, :cond_0

    .line 5
    .line 6
    if-ge p4, p2, :cond_0

    .line 7
    .line 8
    iget-object p2, p0, LX/j;->g:Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LX/j;->h:Lr/u;

    .line 14
    .line 15
    invoke-virtual {p1, p3}, Lr/u;->a(I)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, LX/j;->i:Lr/u;

    .line 19
    .line 20
    invoke-virtual {p1, p4}, Lr/u;->a(I)V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_0
    iget-object p2, p0, LX/j;->d:LR/e;

    .line 25
    .line 26
    invoke-virtual {p2, p1}, LR/e;->c(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
