.class public final Lw/b0;
.super Ls5/c;
.source "SourceFile"


# instance fields
.field public q:Lb2/a;

.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lb2/a;

.field public t:I


# direct methods
.method public constructor <init>(Lb2/a;Ls5/c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lw/b0;->s:Lb2/a;

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
    iput-object p1, p0, Lw/b0;->r:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lw/b0;->t:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lw/b0;->t:I

    .line 9
    .line 10
    iget-object p1, p0, Lw/b0;->s:Lb2/a;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, Lb2/a;->h(Lw/H0;Lw/W;Ls5/c;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
.end method
