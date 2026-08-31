.class final Landroidx/compose/foundation/ScrollingContainerElement;
.super LB0/d0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LB0/d0;"
    }
.end annotation


# instance fields
.field public final q:Lw/A0;

.field public final r:Lw/d0;

.field public final s:Z

.field public final t:Lw/I;

.field public final u:Ly/i;

.field public final v:Lw/c;

.field public final w:Lv/l;


# direct methods
.method public constructor <init>(Lv/l;Lw/c;Lw/I;Lw/d0;Lw/A0;Ly/i;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p5, p0, Landroidx/compose/foundation/ScrollingContainerElement;->q:Lw/A0;

    .line 5
    .line 6
    iput-object p4, p0, Landroidx/compose/foundation/ScrollingContainerElement;->r:Lw/d0;

    .line 7
    .line 8
    iput-boolean p7, p0, Landroidx/compose/foundation/ScrollingContainerElement;->s:Z

    .line 9
    .line 10
    iput-object p3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->t:Lw/I;

    .line 11
    .line 12
    iput-object p6, p0, Landroidx/compose/foundation/ScrollingContainerElement;->u:Ly/i;

    .line 13
    .line 14
    iput-object p2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->v:Lw/c;

    .line 15
    .line 16
    iput-object p1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lv/l;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    if-eqz p1, :cond_9

    .line 5
    .line 6
    const-class v0, Landroidx/compose/foundation/ScrollingContainerElement;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    if-eq v0, v1, :cond_1

    .line 13
    .line 14
    goto :goto_1

    .line 15
    :cond_1
    check-cast p1, Landroidx/compose/foundation/ScrollingContainerElement;

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->q:Lw/A0;

    .line 18
    .line 19
    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->q:Lw/A0;

    .line 20
    .line 21
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->r:Lw/d0;

    .line 29
    .line 30
    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->r:Lw/d0;

    .line 31
    .line 32
    if-eq v0, v1, :cond_3

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_3
    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->s:Z

    .line 36
    .line 37
    iget-boolean v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->s:Z

    .line 38
    .line 39
    if-eq v0, v1, :cond_4

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_4
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->t:Lw/I;

    .line 43
    .line 44
    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->t:Lw/I;

    .line 45
    .line 46
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_5

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_5
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->u:Ly/i;

    .line 54
    .line 55
    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->u:Ly/i;

    .line 56
    .line 57
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_6

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_6
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->v:Lw/c;

    .line 65
    .line 66
    iget-object v1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->v:Lw/c;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_7

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_7
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lv/l;

    .line 76
    .line 77
    iget-object p1, p1, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lv/l;

    .line 78
    .line 79
    invoke-static {v0, p1}, Lkotlin/jvm/internal/m;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_8

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_8
    :goto_0
    const/4 p1, 0x1

    .line 87
    return p1

    .line 88
    :cond_9
    :goto_1
    const/4 p1, 0x0

    .line 89
    return p1
.end method

.method public final f()Lc0/l;
    .locals 2

    .line 1
    new-instance v0, Lv/e0;

    .line 2
    .line 3
    invoke-direct {v0}, LB0/n;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->q:Lw/A0;

    .line 7
    .line 8
    iput-object v1, v0, Lv/e0;->G:Lw/A0;

    .line 9
    .line 10
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->r:Lw/d0;

    .line 11
    .line 12
    iput-object v1, v0, Lv/e0;->H:Lw/d0;

    .line 13
    .line 14
    iget-boolean v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->s:Z

    .line 15
    .line 16
    iput-boolean v1, v0, Lv/e0;->I:Z

    .line 17
    .line 18
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->t:Lw/I;

    .line 19
    .line 20
    iput-object v1, v0, Lv/e0;->J:Lw/I;

    .line 21
    .line 22
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->u:Ly/i;

    .line 23
    .line 24
    iput-object v1, v0, Lv/e0;->K:Ly/i;

    .line 25
    .line 26
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->v:Lw/c;

    .line 27
    .line 28
    iput-object v1, v0, Lv/e0;->L:Lw/c;

    .line 29
    .line 30
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lv/l;

    .line 31
    .line 32
    iput-object v1, v0, Lv/e0;->M:Lv/l;

    .line 33
    .line 34
    return-object v0
.end method

.method public final g(Lc0/l;)V
    .locals 8

    .line 1
    move-object v0, p1

    .line 2
    check-cast v0, Lv/e0;

    .line 3
    .line 4
    iget-object v6, p0, Landroidx/compose/foundation/ScrollingContainerElement;->u:Ly/i;

    .line 5
    .line 6
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->v:Lw/c;

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lv/l;

    .line 9
    .line 10
    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->t:Lw/I;

    .line 11
    .line 12
    iget-object v4, p0, Landroidx/compose/foundation/ScrollingContainerElement;->r:Lw/d0;

    .line 13
    .line 14
    iget-object v5, p0, Landroidx/compose/foundation/ScrollingContainerElement;->q:Lw/A0;

    .line 15
    .line 16
    iget-boolean v7, p0, Landroidx/compose/foundation/ScrollingContainerElement;->s:Z

    .line 17
    .line 18
    invoke-virtual/range {v0 .. v7}, Lv/e0;->C0(Lv/l;Lw/c;Lw/I;Lw/d0;Lw/A0;Ly/i;Z)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->q:Lw/A0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-object v2, p0, Landroidx/compose/foundation/ScrollingContainerElement;->r:Lw/d0;

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
    iget-boolean v0, p0, Landroidx/compose/foundation/ScrollingContainerElement;->s:Z

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, Lk1/i;->e(IIZ)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/4 v2, 0x0

    .line 25
    invoke-static {v0, v1, v2}, Lk1/i;->e(IIZ)I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->t:Lw/I;

    .line 30
    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move v3, v2

    .line 39
    :goto_0
    add-int/2addr v0, v3

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->u:Ly/i;

    .line 42
    .line 43
    if-eqz v3, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v3, v2

    .line 51
    :goto_1
    add-int/2addr v0, v3

    .line 52
    mul-int/2addr v0, v1

    .line 53
    iget-object v3, p0, Landroidx/compose/foundation/ScrollingContainerElement;->v:Lw/c;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    move v3, v2

    .line 63
    :goto_2
    add-int/2addr v0, v3

    .line 64
    mul-int/2addr v0, v1

    .line 65
    invoke-static {v0, v1, v2}, Lk1/i;->e(IIZ)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iget-object v1, p0, Landroidx/compose/foundation/ScrollingContainerElement;->w:Lv/l;

    .line 70
    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    :cond_3
    add-int/2addr v0, v2

    .line 78
    return v0
.end method
