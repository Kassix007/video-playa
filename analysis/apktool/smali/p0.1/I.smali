.class public final Lp0/I;
.super Lp0/G;
.source "SourceFile"


# instance fields
.field public final A:F

.field public final B:F

.field public final C:F

.field public final D:F

.field public final q:Ljava/lang/String;

.field public final r:Ljava/util/List;

.field public final s:I

.field public final t:Lj0/B;

.field public final u:F

.field public final v:Lj0/B;

.field public final w:F

.field public final x:F

.field public final y:I

.field public final z:I


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;ILj0/B;FLj0/B;FFIIFFFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lp0/I;->q:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lp0/I;->r:Ljava/util/List;

    .line 7
    .line 8
    iput p3, p0, Lp0/I;->s:I

    .line 9
    .line 10
    iput-object p4, p0, Lp0/I;->t:Lj0/B;

    .line 11
    .line 12
    iput p5, p0, Lp0/I;->u:F

    .line 13
    .line 14
    iput-object p6, p0, Lp0/I;->v:Lj0/B;

    .line 15
    .line 16
    iput p7, p0, Lp0/I;->w:F

    .line 17
    .line 18
    iput p8, p0, Lp0/I;->x:F

    .line 19
    .line 20
    iput p9, p0, Lp0/I;->y:I

    .line 21
    .line 22
    iput p10, p0, Lp0/I;->z:I

    .line 23
    .line 24
    iput p11, p0, Lp0/I;->A:F

    .line 25
    .line 26
    iput p12, p0, Lp0/I;->B:F

    .line 27
    .line 28
    iput p13, p0, Lp0/I;->C:F

    .line 29
    .line 30
    iput p14, p0, Lp0/I;->D:F

    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_6

    .line 7
    .line 8
    const-class v2, Lp0/I;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto/16 :goto_0

    .line 17
    .line 18
    :cond_1
    check-cast p1, Lp0/I;

    .line 19
    .line 20
    iget-object v2, p0, Lp0/I;->q:Ljava/lang/String;

    .line 21
    .line 22
    iget-object v3, p1, Lp0/I;->q:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-nez v2, :cond_2

    .line 29
    .line 30
    return v1

    .line 31
    :cond_2
    iget-object v2, p0, Lp0/I;->t:Lj0/B;

    .line 32
    .line 33
    iget-object v3, p1, Lp0/I;->t:Lj0/B;

    .line 34
    .line 35
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-nez v2, :cond_3

    .line 40
    .line 41
    return v1

    .line 42
    :cond_3
    iget v2, p0, Lp0/I;->u:F

    .line 43
    .line 44
    iget v3, p1, Lp0/I;->u:F

    .line 45
    .line 46
    cmpg-float v2, v2, v3

    .line 47
    .line 48
    if-nez v2, :cond_6

    .line 49
    .line 50
    iget-object v2, p0, Lp0/I;->v:Lj0/B;

    .line 51
    .line 52
    iget-object v3, p1, Lp0/I;->v:Lj0/B;

    .line 53
    .line 54
    invoke-static {v2, v3}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-nez v2, :cond_4

    .line 59
    .line 60
    return v1

    .line 61
    :cond_4
    iget v2, p0, Lp0/I;->w:F

    .line 62
    .line 63
    iget v3, p1, Lp0/I;->w:F

    .line 64
    .line 65
    cmpg-float v2, v2, v3

    .line 66
    .line 67
    if-nez v2, :cond_6

    .line 68
    .line 69
    iget v2, p0, Lp0/I;->x:F

    .line 70
    .line 71
    iget v3, p1, Lp0/I;->x:F

    .line 72
    .line 73
    cmpg-float v2, v2, v3

    .line 74
    .line 75
    if-nez v2, :cond_6

    .line 76
    .line 77
    iget v2, p0, Lp0/I;->y:I

    .line 78
    .line 79
    iget v3, p1, Lp0/I;->y:I

    .line 80
    .line 81
    if-ne v2, v3, :cond_6

    .line 82
    .line 83
    iget v2, p0, Lp0/I;->z:I

    .line 84
    .line 85
    iget v3, p1, Lp0/I;->z:I

    .line 86
    .line 87
    if-ne v2, v3, :cond_6

    .line 88
    .line 89
    iget v2, p0, Lp0/I;->A:F

    .line 90
    .line 91
    iget v3, p1, Lp0/I;->A:F

    .line 92
    .line 93
    cmpg-float v2, v2, v3

    .line 94
    .line 95
    if-nez v2, :cond_6

    .line 96
    .line 97
    iget v2, p0, Lp0/I;->B:F

    .line 98
    .line 99
    iget v3, p1, Lp0/I;->B:F

    .line 100
    .line 101
    cmpg-float v2, v2, v3

    .line 102
    .line 103
    if-nez v2, :cond_6

    .line 104
    .line 105
    iget v2, p0, Lp0/I;->C:F

    .line 106
    .line 107
    iget v3, p1, Lp0/I;->C:F

    .line 108
    .line 109
    cmpg-float v2, v2, v3

    .line 110
    .line 111
    if-nez v2, :cond_6

    .line 112
    .line 113
    iget v2, p0, Lp0/I;->D:F

    .line 114
    .line 115
    iget v3, p1, Lp0/I;->D:F

    .line 116
    .line 117
    cmpg-float v2, v2, v3

    .line 118
    .line 119
    if-nez v2, :cond_6

    .line 120
    .line 121
    iget v2, p0, Lp0/I;->s:I

    .line 122
    .line 123
    iget v3, p1, Lp0/I;->s:I

    .line 124
    .line 125
    if-ne v2, v3, :cond_6

    .line 126
    .line 127
    iget-object v2, p0, Lp0/I;->r:Ljava/util/List;

    .line 128
    .line 129
    iget-object p1, p1, Lp0/I;->r:Ljava/util/List;

    .line 130
    .line 131
    invoke-static {v2, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result p1

    .line 135
    if-nez p1, :cond_5

    .line 136
    .line 137
    return v1

    .line 138
    :cond_5
    return v0

    .line 139
    :cond_6
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lp0/I;->q:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lp0/I;->r:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    const/4 v0, 0x0

    .line 19
    iget-object v3, p0, Lp0/I;->t:Lj0/B;

    .line 20
    .line 21
    if-eqz v3, :cond_0

    .line 22
    .line 23
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v3, v0

    .line 29
    :goto_0
    add-int/2addr v2, v3

    .line 30
    mul-int/2addr v2, v1

    .line 31
    iget v3, p0, Lp0/I;->u:F

    .line 32
    .line 33
    invoke-static {v3, v2, v1}, Lk1/i;->b(FII)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    iget-object v3, p0, Lp0/I;->v:Lj0/B;

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    :cond_1
    add-int/2addr v2, v0

    .line 46
    mul-int/2addr v2, v1

    .line 47
    iget v0, p0, Lp0/I;->w:F

    .line 48
    .line 49
    invoke-static {v0, v2, v1}, Lk1/i;->b(FII)I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget v2, p0, Lp0/I;->x:F

    .line 54
    .line 55
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    iget v2, p0, Lp0/I;->y:I

    .line 60
    .line 61
    invoke-static {v2, v0, v1}, Lk1/i;->c(III)I

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    iget v2, p0, Lp0/I;->z:I

    .line 66
    .line 67
    invoke-static {v2, v0, v1}, Lk1/i;->c(III)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget v2, p0, Lp0/I;->A:F

    .line 72
    .line 73
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget v2, p0, Lp0/I;->B:F

    .line 78
    .line 79
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    iget v2, p0, Lp0/I;->C:F

    .line 84
    .line 85
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    iget v2, p0, Lp0/I;->D:F

    .line 90
    .line 91
    invoke-static {v2, v0, v1}, Lk1/i;->b(FII)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iget v1, p0, Lp0/I;->s:I

    .line 96
    .line 97
    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    add-int/2addr v1, v0

    .line 102
    return v1
.end method
