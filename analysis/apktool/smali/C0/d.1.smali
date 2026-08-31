.class public final LC0/d;
.super LC0/b;
.source "SourceFile"


# static fields
.field public static e:LC0/d;

.field public static final f:LV0/j;

.field public static final g:LV0/j;


# instance fields
.field public c:LL0/C;

.field public d:LI0/m;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, LV0/j;->r:LV0/j;

    .line 2
    .line 3
    sput-object v0, LC0/d;->f:LV0/j;

    .line 4
    .line 5
    sget-object v0, LV0/j;->q:LV0/j;

    .line 6
    .line 7
    sput-object v0, LC0/d;->g:LV0/j;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final f(I)[I
    .locals 5

    .line 1
    invoke-virtual {p0}, LC0/b;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    invoke-virtual {p0}, LC0/b;->j()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-lt p1, v0, :cond_1

    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    :try_start_0
    iget-object v0, p0, LC0/d;->d:LI0/m;

    .line 25
    .line 26
    if-eqz v0, :cond_a

    .line 27
    .line 28
    invoke-virtual {v0}, LI0/m;->e()Li0/c;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    iget v2, v0, Li0/c;->d:F

    .line 33
    .line 34
    iget v0, v0, Li0/c;->b:F

    .line 35
    .line 36
    sub-float/2addr v2, v0

    .line 37
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 38
    .line 39
    .line 40
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    if-lez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    :goto_0
    iget-object v2, p0, LC0/d;->c:LL0/C;

    .line 46
    .line 47
    const-string v3, "layoutResult"

    .line 48
    .line 49
    if-eqz v2, :cond_9

    .line 50
    .line 51
    invoke-virtual {v2, p1}, LL0/C;->a(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget-object v4, p0, LC0/d;->c:LL0/C;

    .line 56
    .line 57
    if-eqz v4, :cond_8

    .line 58
    .line 59
    invoke-virtual {v4, v2}, LL0/C;->d(I)F

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    int-to-float v0, v0

    .line 64
    add-float/2addr v2, v0

    .line 65
    iget-object v0, p0, LC0/d;->c:LL0/C;

    .line 66
    .line 67
    if-eqz v0, :cond_7

    .line 68
    .line 69
    if-eqz v0, :cond_6

    .line 70
    .line 71
    iget-object v4, v0, LL0/C;->b:LE/a0;

    .line 72
    .line 73
    iget v4, v4, LE/a0;->b:I

    .line 74
    .line 75
    add-int/lit8 v4, v4, -0x1

    .line 76
    .line 77
    invoke-virtual {v0, v4}, LL0/C;->d(I)F

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    cmpg-float v0, v2, v0

    .line 82
    .line 83
    if-gez v0, :cond_4

    .line 84
    .line 85
    iget-object v0, p0, LC0/d;->c:LL0/C;

    .line 86
    .line 87
    if-eqz v0, :cond_3

    .line 88
    .line 89
    invoke-virtual {v0, v2}, LL0/C;->b(F)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    throw v1

    .line 100
    :cond_4
    iget-object v0, p0, LC0/d;->c:LL0/C;

    .line 101
    .line 102
    if-eqz v0, :cond_5

    .line 103
    .line 104
    iget-object v0, v0, LL0/C;->b:LE/a0;

    .line 105
    .line 106
    iget v0, v0, LE/a0;->b:I

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :goto_2
    sget-object v1, LC0/d;->g:LV0/j;

    .line 110
    .line 111
    invoke-virtual {p0, v0, v1}, LC0/d;->n(ILV0/j;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    add-int/lit8 v0, v0, 0x1

    .line 116
    .line 117
    invoke-virtual {p0, p1, v0}, LC0/b;->i(II)[I

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    return-object p1

    .line 122
    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    throw v1

    .line 126
    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    throw v1

    .line 130
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    throw v1

    .line 134
    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    throw v1

    .line 138
    :cond_9
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    throw v1

    .line 142
    :cond_a
    :try_start_1
    const-string p1, "node"

    .line 143
    .line 144
    invoke-static {p1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 148
    :catch_0
    return-object v1
.end method

.method public final l(I)[I
    .locals 5

    .line 1
    invoke-virtual {p0}, LC0/b;->j()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-gtz v0, :cond_0

    .line 11
    .line 12
    return-object v1

    .line 13
    :cond_0
    if-gtz p1, :cond_1

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_1
    :try_start_0
    iget-object v0, p0, LC0/d;->d:LI0/m;

    .line 17
    .line 18
    if-eqz v0, :cond_8

    .line 19
    .line 20
    invoke-virtual {v0}, LI0/m;->e()Li0/c;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget v2, v0, Li0/c;->d:F

    .line 25
    .line 26
    iget v0, v0, Li0/c;->b:F

    .line 27
    .line 28
    sub-float/2addr v2, v0

    .line 29
    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    .line 30
    .line 31
    .line 32
    move-result v0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 33
    invoke-virtual {p0}, LC0/b;->j()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-le v2, p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    move p1, v2

    .line 45
    :goto_0
    iget-object v2, p0, LC0/d;->c:LL0/C;

    .line 46
    .line 47
    const-string v3, "layoutResult"

    .line 48
    .line 49
    if-eqz v2, :cond_7

    .line 50
    .line 51
    invoke-virtual {v2, p1}, LL0/C;->a(I)I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    iget-object v4, p0, LC0/d;->c:LL0/C;

    .line 56
    .line 57
    if-eqz v4, :cond_6

    .line 58
    .line 59
    invoke-virtual {v4, v2}, LL0/C;->d(I)F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    int-to-float v0, v0

    .line 64
    sub-float/2addr v4, v0

    .line 65
    const/4 v0, 0x0

    .line 66
    cmpl-float v0, v4, v0

    .line 67
    .line 68
    if-lez v0, :cond_4

    .line 69
    .line 70
    iget-object v0, p0, LC0/d;->c:LL0/C;

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    invoke-virtual {v0, v4}, LL0/C;->b(F)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    const/4 v0, 0x0

    .line 84
    :goto_1
    invoke-virtual {p0}, LC0/b;->j()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result v1

    .line 92
    if-ne p1, v1, :cond_5

    .line 93
    .line 94
    if-ge v0, v2, :cond_5

    .line 95
    .line 96
    add-int/lit8 v0, v0, 0x1

    .line 97
    .line 98
    :cond_5
    sget-object v1, LC0/d;->f:LV0/j;

    .line 99
    .line 100
    invoke-virtual {p0, v0, v1}, LC0/d;->n(ILV0/j;)I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-virtual {p0, v0, p1}, LC0/b;->i(II)[I

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    return-object p1

    .line 109
    :cond_6
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    throw v1

    .line 113
    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    throw v1

    .line 117
    :cond_8
    :try_start_1
    const-string p1, "node"

    .line 118
    .line 119
    invoke-static {p1}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw v1
    :try_end_1
    .catch Ljava/lang/IllegalStateException; {:try_start_1 .. :try_end_1} :catch_0

    .line 123
    :catch_0
    return-object v1
.end method

.method public final n(ILV0/j;)I
    .locals 4

    .line 1
    iget-object v0, p0, LC0/d;->c:LL0/C;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "layoutResult"

    .line 5
    .line 6
    if-eqz v0, :cond_4

    .line 7
    .line 8
    invoke-virtual {v0, p1}, LL0/C;->c(I)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v3, p0, LC0/d;->c:LL0/C;

    .line 13
    .line 14
    if-eqz v3, :cond_3

    .line 15
    .line 16
    invoke-virtual {v3, v0}, LL0/C;->e(I)LV0/j;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eq p2, v0, :cond_1

    .line 21
    .line 22
    iget-object p2, p0, LC0/d;->c:LL0/C;

    .line 23
    .line 24
    if-eqz p2, :cond_0

    .line 25
    .line 26
    invoke-virtual {p2, p1}, LL0/C;->c(I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    return p1

    .line 31
    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v1

    .line 35
    :cond_1
    iget-object p2, p0, LC0/d;->c:LL0/C;

    .line 36
    .line 37
    if-eqz p2, :cond_2

    .line 38
    .line 39
    iget-object p2, p2, LL0/C;->b:LE/a0;

    .line 40
    .line 41
    invoke-virtual {p2, p1}, LE/a0;->b(I)V

    .line 42
    .line 43
    .line 44
    iget-object p2, p2, LE/a0;->e:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {p1, p2}, Ly4/b;->p(ILjava/util/List;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p2

    .line 56
    check-cast p2, LL0/n;

    .line 57
    .line 58
    iget-object v0, p2, LL0/n;->a:LL0/a;

    .line 59
    .line 60
    iget v1, p2, LL0/n;->d:I

    .line 61
    .line 62
    sub-int/2addr p1, v1

    .line 63
    iget-object v0, v0, LL0/a;->d:LM0/j;

    .line 64
    .line 65
    invoke-virtual {v0, p1}, LM0/j;->e(I)I

    .line 66
    .line 67
    .line 68
    move-result p1

    .line 69
    iget p2, p2, LL0/n;->b:I

    .line 70
    .line 71
    add-int/2addr p1, p2

    .line 72
    add-int/lit8 p1, p1, -0x1

    .line 73
    .line 74
    return p1

    .line 75
    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw v1

    .line 79
    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v1

    .line 83
    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/m;->k(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    throw v1
.end method
