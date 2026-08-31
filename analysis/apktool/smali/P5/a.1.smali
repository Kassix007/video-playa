.class public final LP5/a;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:LQ5/y;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lu2/m;

.field public t:I


# direct methods
.method public constructor <init>(Lu2/m;Lq5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, LP5/a;->s:Lu2/m;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Ls5/c;-><init>(Lq5/c;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, LP5/a;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, LP5/a;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, LP5/a;->t:I

    .line 9
    .line 10
    iget-object p1, p0, LP5/a;->s:Lu2/m;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, Lu2/m;->collect(LP5/i;Lq5/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
