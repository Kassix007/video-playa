.class public final Li3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Li3/c;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lh3/e;

.field public final c:Lh3/a;

.field public final d:Z

.field public final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;Lh3/e;Lh3/a;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li3/b;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Li3/b;->b:Lh3/e;

    .line 7
    .line 8
    iput-object p3, p0, Li3/b;->c:Lh3/a;

    .line 9
    .line 10
    iput-boolean p4, p0, Li3/b;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Li3/b;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La3/y;La3/k;Lj3/b;)Lc3/d;
    .locals 0

    .line 1
    new-instance p2, Lc3/g;

    .line 2
    .line 3
    invoke-direct {p2, p1, p3, p0}, Lc3/g;-><init>(La3/y;Lj3/b;Li3/b;)V

    .line 4
    .line 5
    .line 6
    return-object p2
.end method
