.class public final Lw/d1;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lkotlin/jvm/internal/y;

.field public synthetic r:Ljava/lang/Object;

.field public s:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, Lw/d1;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lw/d1;->s:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lw/d1;->s:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p0}, Lw/g1;->f(Lv0/y;Lv0/g;Ls5/a;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
