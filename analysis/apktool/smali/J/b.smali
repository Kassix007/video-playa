.class public final LJ/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static h:LJ/b;


# instance fields
.field public final a:LW0/l;

.field public final b:LL0/F;

.field public final c:LW0/d;

.field public final d:LO0/d;

.field public final e:LL0/F;

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(LW0/l;LL0/F;LW0/d;LO0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LJ/b;->a:LW0/l;

    .line 5
    .line 6
    iput-object p2, p0, LJ/b;->b:LL0/F;

    .line 7
    .line 8
    iput-object p3, p0, LJ/b;->c:LW0/d;

    .line 9
    .line 10
    iput-object p4, p0, LJ/b;->d:LO0/d;

    .line 11
    .line 12
    invoke-static {p2, p1}, LE3/h;->N(LL0/F;LW0/l;)LL0/F;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, LJ/b;->e:LL0/F;

    .line 17
    .line 18
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    iput p1, p0, LJ/b;->f:F

    .line 21
    .line 22
    iput p1, p0, LJ/b;->g:F

    .line 23
    .line 24
    return-void
.end method
