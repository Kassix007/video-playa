.class public final LJ1/O;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:I

.field public b:LJ1/q;

.field public c:Z

.field public d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Landroidx/lifecycle/p;

.field public i:Landroidx/lifecycle/p;


# direct methods
.method public constructor <init>(ILJ1/q;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, LJ1/O;->a:I

    .line 3
    iput-object p2, p0, LJ1/O;->b:LJ1/q;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, LJ1/O;->c:Z

    .line 5
    sget-object p1, Landroidx/lifecycle/p;->u:Landroidx/lifecycle/p;

    iput-object p1, p0, LJ1/O;->h:Landroidx/lifecycle/p;

    .line 6
    iput-object p1, p0, LJ1/O;->i:Landroidx/lifecycle/p;

    return-void
.end method

.method public constructor <init>(ILJ1/q;I)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput p1, p0, LJ1/O;->a:I

    .line 9
    iput-object p2, p0, LJ1/O;->b:LJ1/q;

    const/4 p1, 0x1

    .line 10
    iput-boolean p1, p0, LJ1/O;->c:Z

    .line 11
    sget-object p1, Landroidx/lifecycle/p;->u:Landroidx/lifecycle/p;

    iput-object p1, p0, LJ1/O;->h:Landroidx/lifecycle/p;

    .line 12
    iput-object p1, p0, LJ1/O;->i:Landroidx/lifecycle/p;

    return-void
.end method
