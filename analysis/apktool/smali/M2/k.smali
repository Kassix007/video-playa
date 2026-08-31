.class public final LM2/k;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:Z

.field public final d:Ljava/lang/Object;

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V
    .locals 0

    .line 1
    iput-object p1, p0, LM2/k;->d:Ljava/lang/Object;

    iput-object p2, p0, LM2/k;->a:Ljava/util/List;

    iput p3, p0, LM2/k;->b:I

    iput-object p4, p0, LM2/k;->e:Ljava/lang/Object;

    iput-object p5, p0, LM2/k;->f:Ljava/lang/Object;

    iput-object p6, p0, LM2/k;->g:Ljava/lang/Object;

    iput-boolean p7, p0, LM2/k;->c:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(LD2/j;Ly2/i;)V
    .locals 4

    .line 1
    iget-object v0, p1, LD2/j;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, LM2/k;->d:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, LD2/j;

    .line 6
    .line 7
    iget-object v2, v1, LD2/j;->a:Landroid/content/Context;

    .line 8
    .line 9
    const-string v3, "Interceptor \'"

    .line 10
    .line 11
    if-ne v0, v2, :cond_4

    .line 12
    .line 13
    iget-object v0, p1, LD2/j;->b:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object v2, LD2/l;->b:LD2/l;

    .line 16
    .line 17
    if-eq v0, v2, :cond_3

    .line 18
    .line 19
    iget-object v0, p1, LD2/j;->c:LF2/b;

    .line 20
    .line 21
    iget-object v2, v1, LD2/j;->c:LF2/b;

    .line 22
    .line 23
    if-ne v0, v2, :cond_2

    .line 24
    .line 25
    iget-object v0, p1, LD2/j;->v:Landroidx/lifecycle/q;

    .line 26
    .line 27
    iget-object v2, v1, LD2/j;->v:Landroidx/lifecycle/q;

    .line 28
    .line 29
    if-ne v0, v2, :cond_1

    .line 30
    .line 31
    iget-object p1, p1, LD2/j;->w:LE2/i;

    .line 32
    .line 33
    iget-object v0, v1, LD2/j;->w:LE2/i;

    .line 34
    .line 35
    if-ne p1, v0, :cond_0

    .line 36
    .line 37
    return-void

    .line 38
    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p2, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    .line 47
    .line 48
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 56
    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p2

    .line 65
    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p2, "\' cannot modify the request\'s lifecycle."

    .line 74
    .line 75
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 83
    .line 84
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p2

    .line 92
    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    .line 93
    .line 94
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    const-string p2, "\' cannot modify the request\'s target."

    .line 101
    .line 102
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    throw p2

    .line 119
    :cond_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    .line 127
    const-string p2, "\' cannot set the request\'s data to null."

    .line 128
    .line 129
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 137
    .line 138
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 143
    .line 144
    .line 145
    throw p2

    .line 146
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    invoke-direct {p1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string p2, "\' cannot modify the request\'s context."

    .line 155
    .line 156
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 164
    .line 165
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    throw p2
.end method

.method public b(LD2/j;Ls5/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    instance-of v0, p2, Ly2/j;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, Ly2/j;

    .line 7
    .line 8
    iget v1, v0, Ly2/j;->u:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Ly2/j;->u:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Ly2/j;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, Ly2/j;-><init>(LM2/k;Ls5/c;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, Ly2/j;->s:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Ly2/j;->u:I

    .line 28
    .line 29
    const/4 v2, 0x1

    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    if-ne v1, v2, :cond_1

    .line 33
    .line 34
    iget-object p1, v0, Ly2/j;->r:Ly2/i;

    .line 35
    .line 36
    iget-object v0, v0, Ly2/j;->q:LM2/k;

    .line 37
    .line 38
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    throw p1

    .line 50
    :cond_2
    invoke-static {p2}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    iget-object p2, p0, LM2/k;->a:Ljava/util/List;

    .line 54
    .line 55
    iget v1, p0, LM2/k;->b:I

    .line 56
    .line 57
    if-lez v1, :cond_3

    .line 58
    .line 59
    add-int/lit8 v3, v1, -0x1

    .line 60
    .line 61
    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    check-cast v3, Ly2/i;

    .line 66
    .line 67
    invoke-virtual {p0, p1, v3}, LM2/k;->a(LD2/j;Ly2/i;)V

    .line 68
    .line 69
    .line 70
    :cond_3
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    check-cast p2, Ly2/i;

    .line 75
    .line 76
    add-int/lit8 v6, v1, 0x1

    .line 77
    .line 78
    iget-object v1, p0, LM2/k;->f:Ljava/lang/Object;

    .line 79
    .line 80
    move-object v8, v1

    .line 81
    check-cast v8, LE2/h;

    .line 82
    .line 83
    new-instance v3, LM2/k;

    .line 84
    .line 85
    iget-object v1, p0, LM2/k;->d:Ljava/lang/Object;

    .line 86
    .line 87
    move-object v4, v1

    .line 88
    check-cast v4, LD2/j;

    .line 89
    .line 90
    iget-object v1, p0, LM2/k;->g:Ljava/lang/Object;

    .line 91
    .line 92
    move-object v9, v1

    .line 93
    check-cast v9, Lt2/c;

    .line 94
    .line 95
    iget-boolean v10, p0, LM2/k;->c:Z

    .line 96
    .line 97
    iget-object v5, p0, LM2/k;->a:Ljava/util/List;

    .line 98
    .line 99
    move-object v7, p1

    .line 100
    invoke-direct/range {v3 .. v10}, LM2/k;-><init>(Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 101
    .line 102
    .line 103
    iput-object p0, v0, Ly2/j;->q:LM2/k;

    .line 104
    .line 105
    iput-object p2, v0, Ly2/j;->r:Ly2/i;

    .line 106
    .line 107
    iput v2, v0, Ly2/j;->u:I

    .line 108
    .line 109
    invoke-virtual {p2, v3, v0}, Ly2/i;->d(LM2/k;Ls5/c;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    sget-object v0, Lr5/a;->q:Lr5/a;

    .line 114
    .line 115
    if-ne p1, v0, :cond_4

    .line 116
    .line 117
    return-object v0

    .line 118
    :cond_4
    move-object v0, p2

    .line 119
    move-object p2, p1

    .line 120
    move-object p1, v0

    .line 121
    move-object v0, p0

    .line 122
    :goto_1
    check-cast p2, LD2/k;

    .line 123
    .line 124
    invoke-virtual {p2}, LD2/k;->a()LD2/j;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-virtual {v0, v1, p1}, LM2/k;->a(LD2/j;Ly2/i;)V

    .line 129
    .line 130
    .line 131
    return-object p2
.end method

.method public c(Ls5/c;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget-object v0, p0, LM2/k;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v2, v0

    .line 4
    check-cast v2, LU2/g;

    .line 5
    .line 6
    instance-of v0, p1, LM2/j;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, LM2/j;

    .line 12
    .line 13
    iget v1, v0, LM2/j;->t:I

    .line 14
    .line 15
    const/high16 v3, -0x80000000

    .line 16
    .line 17
    and-int v4, v1, v3

    .line 18
    .line 19
    if-eqz v4, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v3

    .line 22
    iput v1, v0, LM2/j;->t:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, LM2/j;

    .line 26
    .line 27
    invoke-direct {v0, p0, p1}, LM2/j;-><init>(LM2/k;Ls5/c;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p1, v0, LM2/j;->r:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, LM2/j;->t:I

    .line 33
    .line 34
    const/4 v9, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v9, :cond_1

    .line 38
    .line 39
    iget-object v0, v0, LM2/j;->q:LM2/h;

    .line 40
    .line 41
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 46
    .line 47
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    invoke-static {p1}, Lm5/a;->e(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    iget-object p1, p0, LM2/k;->a:Ljava/util/List;

    .line 57
    .line 58
    iget v1, p0, LM2/k;->b:I

    .line 59
    .line 60
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    check-cast p1, LM2/h;

    .line 65
    .line 66
    add-int/lit8 v4, v1, 0x1

    .line 67
    .line 68
    iget-object v1, p0, LM2/k;->e:Ljava/lang/Object;

    .line 69
    .line 70
    move-object v5, v1

    .line 71
    check-cast v5, LU2/g;

    .line 72
    .line 73
    iget-object v1, p0, LM2/k;->f:Ljava/lang/Object;

    .line 74
    .line 75
    move-object v6, v1

    .line 76
    check-cast v6, LV2/h;

    .line 77
    .line 78
    new-instance v1, LM2/k;

    .line 79
    .line 80
    iget-object v3, p0, LM2/k;->g:Ljava/lang/Object;

    .line 81
    .line 82
    move-object v7, v3

    .line 83
    check-cast v7, LI2/i;

    .line 84
    .line 85
    iget-boolean v8, p0, LM2/k;->c:Z

    .line 86
    .line 87
    iget-object v3, p0, LM2/k;->a:Ljava/util/List;

    .line 88
    .line 89
    invoke-direct/range {v1 .. v8}, LM2/k;-><init>(Ljava/lang/Object;Ljava/util/List;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    .line 90
    .line 91
    .line 92
    iput-object p1, v0, LM2/j;->q:LM2/h;

    .line 93
    .line 94
    iput v9, v0, LM2/j;->t:I

    .line 95
    .line 96
    invoke-virtual {p1, v1, v0}, LM2/h;->d(LM2/k;Ls5/c;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    sget-object v1, Lr5/a;->q:Lr5/a;

    .line 101
    .line 102
    if-ne v0, v1, :cond_3

    .line 103
    .line 104
    return-object v1

    .line 105
    :cond_3
    move-object v10, v0

    .line 106
    move-object v0, p1

    .line 107
    move-object p1, v10

    .line 108
    :goto_1
    check-cast p1, LU2/j;

    .line 109
    .line 110
    invoke-interface {p1}, LU2/j;->a()LU2/g;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    iget-object v3, v1, LU2/g;->a:Landroid/content/Context;

    .line 115
    .line 116
    iget-object v4, v2, LU2/g;->a:Landroid/content/Context;

    .line 117
    .line 118
    const-string v5, "Interceptor \'"

    .line 119
    .line 120
    if-ne v3, v4, :cond_6

    .line 121
    .line 122
    iget-object v3, v1, LU2/g;->b:Ljava/lang/Object;

    .line 123
    .line 124
    sget-object v4, LU2/l;->a:LU2/l;

    .line 125
    .line 126
    if-eq v3, v4, :cond_5

    .line 127
    .line 128
    iget-object v1, v1, LU2/g;->n:LV2/i;

    .line 129
    .line 130
    iget-object v2, v2, LU2/g;->n:LV2/i;

    .line 131
    .line 132
    if-ne v1, v2, :cond_4

    .line 133
    .line 134
    return-object p1

    .line 135
    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    const-string v0, "\' cannot modify the request\'s size resolver. Use `Interceptor.Chain.withSize` instead."

    .line 144
    .line 145
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    throw v0

    .line 162
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v0, "\' cannot set the request\'s data to null."

    .line 171
    .line 172
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 180
    .line 181
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    throw v0

    .line 189
    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    invoke-direct {p1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    const-string v0, "\' cannot modify the request\'s context."

    .line 198
    .line 199
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p1

    .line 206
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 207
    .line 208
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object p1

    .line 212
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    throw v0
.end method
