.class public final LM2/i;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LM2/a;

.field public r:LU2/g;

.field public s:LU2/n;

.field public t:LI2/i;

.field public u:Ljava/util/List;

.field public v:I

.field public w:I

.field public synthetic x:Ljava/lang/Object;

.field public y:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LM2/i;->x:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LM2/i;->y:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LM2/i;->y:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    invoke-static {p1, p1, p1, p1, p0}, La/a;->V(LM2/a;LU2/g;LU2/n;LI2/i;Ls5/c;)LM2/a;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    return-object p1
.end method
