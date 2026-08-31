.class public final Lw/X;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lb2/a;

.field public r:Lkotlin/jvm/internal/y;

.field public s:Lkotlin/jvm/internal/v;

.field public t:Lw/H0;

.field public u:Lkotlin/jvm/internal/y;

.field public synthetic v:Ljava/lang/Object;

.field public w:I


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    iput-object p1, p0, Lw/X;->v:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lw/X;->w:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lw/X;->w:I

    .line 9
    .line 10
    const/4 v4, 0x0

    .line 11
    const-wide/16 v5, 0x0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    move-object v7, p0

    .line 18
    invoke-static/range {v0 .. v7}, Lb2/a;->c(Lb2/a;Lkotlin/jvm/internal/y;Lkotlin/jvm/internal/v;Lw/H0;Lkotlin/jvm/internal/y;JLs5/c;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1
.end method
