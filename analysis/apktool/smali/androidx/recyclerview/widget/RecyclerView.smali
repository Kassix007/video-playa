.class public Landroidx/recyclerview/widget/RecyclerView;
.super Landroid/view/ViewGroup;
.source "SourceFile"


# static fields
.field public static final I0:[I

.field public static final J0:[Ljava/lang/Class;

.field public static final K0:LD1/c;


# instance fields
.field public A:Ld2/z;

.field public final A0:[I

.field public B:Ld2/G;

.field public B0:Lw1/j;

.field public final C:Ljava/util/ArrayList;

.field public final C0:[I

.field public final D:Ljava/util/ArrayList;

.field public final D0:[I

.field public E:Ld2/k;

.field public final E0:[I

.field public F:Z

.field public final F0:Ljava/util/ArrayList;

.field public G:Z

.field public final G0:LA1/b;

.field public H:Z

.field public final H0:Ld2/x;

.field public I:I

.field public J:Z

.field public K:Z

.field public L:Z

.field public M:I

.field public final N:Landroid/view/accessibility/AccessibilityManager;

.field public O:Z

.field public P:Z

.field public Q:I

.field public R:I

.field public S:Ld2/C;

.field public T:Landroid/widget/EdgeEffect;

.field public U:Landroid/widget/EdgeEffect;

.field public V:Landroid/widget/EdgeEffect;

.field public W:Landroid/widget/EdgeEffect;

.field public a0:Ld2/D;

.field public b0:I

.field public c0:I

.field public d0:Landroid/view/VelocityTracker;

.field public e0:I

.field public f0:I

.field public g0:I

.field public h0:I

.field public i0:I

.field public j0:Ld2/I;

.field public final k0:I

.field public final l0:I

.field public final m0:F

.field public final n0:F

.field public o0:Z

.field public final p0:Ld2/U;

.field public final q:LO3/B;

.field public q0:Ld2/m;

.field public final r:Ld2/M;

.field public final r0:LQ/J;

.field public s:Ld2/O;

.field public final s0:Ld2/S;

.field public final t:LL0/l;

.field public t0:Ld2/J;

.field public final u:LB0/G0;

.field public u0:Ljava/util/ArrayList;

.field public final v:LZ/m;

.field public v0:Z

.field public w:Z

.field public w0:Z

.field public final x:Landroid/graphics/Rect;

.field public final x0:Ld2/y;

.field public final y:Landroid/graphics/Rect;

.field public y0:Z

.field public final z:Landroid/graphics/RectF;

.field public z0:Ld2/X;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const v0, 0x1010436

    .line 2
    .line 3
    .line 4
    filled-new-array {v0}, [I

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    .line 9
    .line 10
    const-class v0, Landroid/util/AttributeSet;

    .line 11
    .line 12
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    const-class v2, Landroid/content/Context;

    .line 15
    .line 16
    filled-new-array {v2, v0, v1, v1}, [Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->J0:[Ljava/lang/Class;

    .line 21
    .line 22
    new-instance v0, LD1/c;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-direct {v0, v1}, LD1/c;-><init>(I)V

    .line 26
    .line 27
    .line 28
    sput-object v0, Landroidx/recyclerview/widget/RecyclerView;->K0:LD1/c;

    .line 29
    .line 30
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const v0, 0x7f0303e5

    .line 1
    invoke-direct {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 20

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p2

    move/from16 v6, p3

    .line 2
    invoke-direct/range {p0 .. p3}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 3
    new-instance v0, LO3/B;

    invoke-direct {v0, v1}, LO3/B;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->q:LO3/B;

    .line 4
    new-instance v0, Ld2/M;

    invoke-direct {v0, v1}, Ld2/M;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 5
    new-instance v0, LZ/m;

    const/16 v7, 0x8

    invoke-direct {v0, v7}, LZ/m;-><init>(I)V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->v:LZ/m;

    .line 6
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->x:Landroid/graphics/Rect;

    .line 7
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->y:Landroid/graphics/Rect;

    .line 8
    new-instance v0, Landroid/graphics/RectF;

    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->z:Landroid/graphics/RectF;

    .line 9
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 10
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->D:Ljava/util/ArrayList;

    const/4 v9, 0x0

    .line 11
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 12
    iput-boolean v9, v1, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 13
    iput-boolean v9, v1, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 14
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 15
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 16
    new-instance v0, Ld2/C;

    .line 17
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->S:Ld2/C;

    .line 19
    new-instance v0, Ld2/h;

    .line 20
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const/4 v10, 0x0

    .line 21
    iput-object v10, v0, Ld2/D;->a:Ld2/y;

    .line 22
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/D;->b:Ljava/util/ArrayList;

    const-wide/16 v11, 0x78

    .line 23
    iput-wide v11, v0, Ld2/D;->c:J

    .line 24
    iput-wide v11, v0, Ld2/D;->d:J

    const-wide/16 v11, 0xfa

    .line 25
    iput-wide v11, v0, Ld2/D;->e:J

    .line 26
    iput-wide v11, v0, Ld2/D;->f:J

    const/4 v11, 0x1

    .line 27
    iput-boolean v11, v0, Ld2/h;->g:Z

    .line 28
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->h:Ljava/util/ArrayList;

    .line 29
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->i:Ljava/util/ArrayList;

    .line 30
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->j:Ljava/util/ArrayList;

    .line 31
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->k:Ljava/util/ArrayList;

    .line 32
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->l:Ljava/util/ArrayList;

    .line 33
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->m:Ljava/util/ArrayList;

    .line 34
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->n:Ljava/util/ArrayList;

    .line 35
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->o:Ljava/util/ArrayList;

    .line 36
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->p:Ljava/util/ArrayList;

    .line 37
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->q:Ljava/util/ArrayList;

    .line 38
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, v0, Ld2/h;->r:Ljava/util/ArrayList;

    .line 39
    iput-object v0, v1, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 40
    iput v9, v1, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    const/4 v0, -0x1

    .line 41
    iput v0, v1, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    const/4 v3, 0x1

    .line 42
    iput v3, v1, Landroidx/recyclerview/widget/RecyclerView;->m0:F

    .line 43
    iput v3, v1, Landroidx/recyclerview/widget/RecyclerView;->n0:F

    .line 44
    iput-boolean v11, v1, Landroidx/recyclerview/widget/RecyclerView;->o0:Z

    .line 45
    new-instance v3, Ld2/U;

    invoke-direct {v3, v1}, Ld2/U;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 46
    new-instance v3, LQ/J;

    .line 47
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->r0:LQ/J;

    .line 49
    new-instance v3, Ld2/S;

    .line 50
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 51
    iput v0, v3, Ld2/S;->a:I

    .line 52
    iput v9, v3, Ld2/S;->b:I

    .line 53
    iput v9, v3, Ld2/S;->c:I

    .line 54
    iput v11, v3, Ld2/S;->d:I

    .line 55
    iput v9, v3, Ld2/S;->e:I

    .line 56
    iput-boolean v9, v3, Ld2/S;->f:Z

    .line 57
    iput-boolean v9, v3, Ld2/S;->g:Z

    .line 58
    iput-boolean v9, v3, Ld2/S;->h:Z

    .line 59
    iput-boolean v9, v3, Ld2/S;->i:Z

    .line 60
    iput-boolean v9, v3, Ld2/S;->j:Z

    .line 61
    iput-boolean v9, v3, Ld2/S;->k:Z

    .line 62
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 63
    iput-boolean v9, v1, Landroidx/recyclerview/widget/RecyclerView;->v0:Z

    .line 64
    iput-boolean v9, v1, Landroidx/recyclerview/widget/RecyclerView;->w0:Z

    .line 65
    new-instance v3, Ld2/y;

    invoke-direct {v3, v1}, Ld2/y;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->x0:Ld2/y;

    .line 66
    iput-boolean v9, v1, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    const/4 v12, 0x2

    .line 67
    new-array v5, v12, [I

    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->A0:[I

    .line 68
    new-array v5, v12, [I

    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->C0:[I

    .line 69
    new-array v5, v12, [I

    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 70
    new-array v5, v12, [I

    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->E0:[I

    .line 71
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->F0:Ljava/util/ArrayList;

    .line 72
    new-instance v5, LA1/b;

    const/16 v8, 0x10

    invoke-direct {v5, v8, v1}, LA1/b;-><init>(ILjava/lang/Object;)V

    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->G0:LA1/b;

    .line 73
    new-instance v5, Ld2/x;

    invoke-direct {v5, v1}, Ld2/x;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    iput-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->H0:Ld2/x;

    .line 74
    invoke-virtual {v1, v11}, Landroid/view/View;->setScrollContainer(Z)V

    .line 75
    invoke-virtual {v1, v11}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 76
    invoke-static {v2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object v5

    .line 77
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result v8

    iput v8, v1, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 78
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v13, 0x1a

    if-lt v8, v13, :cond_0

    .line 79
    sget-object v14, Lw1/L;->a:Ljava/lang/reflect/Method;

    .line 80
    invoke-static {v5}, LE0/d;->c(Landroid/view/ViewConfiguration;)F

    move-result v14

    goto :goto_0

    .line 81
    :cond_0
    invoke-static {v5, v2}, Lw1/L;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v14

    .line 82
    :goto_0
    iput v14, v1, Landroidx/recyclerview/widget/RecyclerView;->m0:F

    if-lt v8, v13, :cond_1

    .line 83
    invoke-static {v5}, LE0/d;->d(Landroid/view/ViewConfiguration;)F

    move-result v14

    goto :goto_1

    .line 84
    :cond_1
    invoke-static {v5, v2}, Lw1/L;->a(Landroid/view/ViewConfiguration;Landroid/content/Context;)F

    move-result v14

    .line 85
    :goto_1
    iput v14, v1, Landroidx/recyclerview/widget/RecyclerView;->n0:F

    .line 86
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledMinimumFlingVelocity()I

    move-result v14

    iput v14, v1, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 87
    invoke-virtual {v5}, Landroid/view/ViewConfiguration;->getScaledMaximumFlingVelocity()I

    move-result v5

    iput v5, v1, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 88
    invoke-virtual {v1}, Landroid/view/View;->getOverScrollMode()I

    move-result v5

    if-ne v5, v12, :cond_2

    move v5, v11

    goto :goto_2

    :cond_2
    move v5, v9

    :goto_2
    invoke-virtual {v1, v5}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 89
    iget-object v5, v1, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 90
    iput-object v3, v5, Ld2/D;->a:Ld2/y;

    .line 91
    new-instance v3, LL0/l;

    new-instance v5, Ld2/x;

    invoke-direct {v5, v1}, Ld2/x;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 92
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 93
    new-instance v14, Lb1/d;

    const/16 v15, 0x1e

    invoke-direct {v14, v15}, Lb1/d;-><init>(I)V

    iput-object v14, v3, LL0/l;->b:Ljava/lang/Object;

    .line 94
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iput-object v14, v3, LL0/l;->a:Ljava/lang/Object;

    .line 95
    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    iput-object v14, v3, LL0/l;->c:Ljava/lang/Object;

    .line 96
    iput-object v5, v3, LL0/l;->d:Ljava/lang/Object;

    .line 97
    new-instance v5, Lk3/c;

    invoke-direct {v5, v3}, Lk3/c;-><init>(Ljava/lang/Object;)V

    iput-object v5, v3, LL0/l;->e:Ljava/lang/Object;

    .line 98
    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 99
    new-instance v3, LB0/G0;

    new-instance v5, Ld2/y;

    invoke-direct {v5, v1}, Ld2/y;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-direct {v3, v5}, LB0/G0;-><init>(Ld2/y;)V

    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 100
    sget-object v3, Lw1/K;->a:Ljava/util/WeakHashMap;

    if-lt v8, v13, :cond_3

    .line 101
    invoke-static {v1}, Lw1/E;->a(Landroid/view/View;)I

    move-result v3

    goto :goto_3

    :cond_3
    move v3, v9

    :goto_3
    if-nez v3, :cond_4

    if-lt v8, v13, :cond_4

    .line 102
    invoke-static {v1, v7}, Lw1/E;->b(Landroid/view/View;I)V

    .line 103
    :cond_4
    invoke-virtual {v1}, Landroid/view/View;->getImportantForAccessibility()I

    move-result v3

    if-nez v3, :cond_5

    .line 104
    invoke-virtual {v1, v11}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 105
    :cond_5
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v5, "accessibility"

    .line 106
    invoke-virtual {v3, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/accessibility/AccessibilityManager;

    iput-object v3, v1, Landroidx/recyclerview/widget/RecyclerView;->N:Landroid/view/accessibility/AccessibilityManager;

    .line 107
    new-instance v3, Ld2/X;

    invoke-direct {v3, v1}, Ld2/X;-><init>(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {v1, v3}, Landroidx/recyclerview/widget/RecyclerView;->setAccessibilityDelegateCompat(Ld2/X;)V

    .line 108
    sget-object v3, Lc2/a;->a:[I

    invoke-virtual {v2, v4, v3, v6, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    const/16 v13, 0x1d

    if-lt v8, v13, :cond_6

    .line 109
    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/Q;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :cond_6
    move-object v14, v2

    move-object v15, v4

    move-object v2, v5

    .line 110
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v16

    .line 111
    invoke-virtual {v2, v12, v0}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v3

    if-ne v3, v0, :cond_7

    const/high16 v0, 0x40000

    .line 112
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->setDescendantFocusability(I)V

    .line 113
    :cond_7
    invoke-virtual {v2, v11, v11}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, v1, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    const/4 v0, 0x3

    .line 114
    invoke-virtual {v2, v0, v9}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    const/4 v4, 0x4

    if-eqz v3, :cond_9

    const/4 v3, 0x6

    .line 115
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/StateListDrawable;

    const/4 v5, 0x7

    .line 116
    invoke-virtual {v2, v5}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    .line 117
    invoke-virtual {v2, v4}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v6

    check-cast v6, Landroid/graphics/drawable/StateListDrawable;

    const/4 v7, 0x5

    .line 118
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    if-eqz v3, :cond_8

    if-eqz v5, :cond_8

    if-eqz v6, :cond_8

    if-eqz v7, :cond_8

    .line 119
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v8

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    move/from16 v17, v0

    .line 120
    new-instance v0, Ld2/k;

    const v4, 0x7f060092

    .line 121
    invoke-virtual {v8, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    move/from16 v19, v12

    const v12, 0x7f060094

    .line 122
    invoke-virtual {v8, v12}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v12

    const v13, 0x7f060093

    .line 123
    invoke-virtual {v8, v13}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v8

    move-object v13, v6

    move v6, v4

    move-object v4, v13

    move-object v13, v2

    move-object v2, v3

    move-object v3, v5

    move-object v5, v7

    move v7, v12

    move/from16 v18, v17

    move/from16 v12, p3

    move/from16 v17, v11

    const/4 v11, 0x4

    invoke-direct/range {v0 .. v8}, Ld2/k;-><init>(Landroidx/recyclerview/widget/RecyclerView;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/StateListDrawable;Landroid/graphics/drawable/Drawable;III)V

    goto :goto_4

    .line 124
    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Trying to set fast scroller without both required drawables."

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 125
    invoke-virtual {v1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move/from16 v18, v0

    move-object v13, v2

    move/from16 v17, v11

    move/from16 v19, v12

    move/from16 v12, p3

    move v11, v4

    .line 126
    :goto_4
    invoke-virtual {v13}, Landroid/content/res/TypedArray;->recycle()V

    .line 127
    const-string v2, ": Could not instantiate the LayoutManager: "

    if-eqz v16, :cond_d

    .line 128
    invoke-virtual/range {v16 .. v16}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 129
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_d

    .line 130
    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0x2e

    if-ne v3, v4, :cond_a

    .line 131
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_5
    move-object v3, v0

    goto :goto_6

    .line 132
    :cond_a
    const-string v3, "."

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_5

    .line 133
    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-class v5, Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {v5}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Package;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_5

    .line 134
    :goto_6
    :try_start_0
    invoke-virtual {v1}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 135
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    goto :goto_7

    :catch_0
    move-exception v0

    goto :goto_a

    :catch_1
    move-exception v0

    goto/16 :goto_b

    :catch_2
    move-exception v0

    goto/16 :goto_c

    :catch_3
    move-exception v0

    goto/16 :goto_d

    :catch_4
    move-exception v0

    goto/16 :goto_e

    .line 136
    :cond_c
    invoke-virtual {v14}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    .line 137
    :goto_7
    invoke-static {v3, v9, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    move-result-object v0

    const-class v4, Ld2/G;

    .line 138
    invoke-virtual {v0, v4}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 139
    :try_start_1
    sget-object v0, Landroidx/recyclerview/widget/RecyclerView;->J0:[Ljava/lang/Class;

    .line 140
    invoke-virtual {v4, v0}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0

    .line 141
    new-array v5, v11, [Ljava/lang/Object;

    aput-object v14, v5, v9

    aput-object v15, v5, v17

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v19

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v18
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v10, v5

    :goto_8
    move/from16 v4, v17

    goto :goto_9

    :catch_5
    move-exception v0

    move-object v5, v0

    .line 142
    :try_start_2
    invoke-virtual {v4, v10}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NoSuchMethodException; {:try_start_2 .. :try_end_2} :catch_6
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_2 .. :try_end_2} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_8

    .line 143
    :goto_9
    :try_start_3
    invoke-virtual {v0, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 144
    invoke-virtual {v0, v10}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld2/G;

    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Ld2/G;)V

    goto/16 :goto_f

    :catch_6
    move-exception v0

    .line 145
    invoke-virtual {v0, v5}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 146
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, ": Error creating LayoutManager "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Ljava/lang/InstantiationException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_0

    .line 147
    :goto_a
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": Class is not a LayoutManager "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 148
    :goto_b
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": Cannot access non-public constructor "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 149
    :goto_c
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    .line 150
    :goto_d
    new-instance v4, Ljava/lang/IllegalStateException;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v4

    .line 151
    :goto_e
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v15}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ": Unable to find LayoutManager "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    .line 152
    :cond_d
    :goto_f
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 153
    sget-object v3, Landroidx/recyclerview/widget/RecyclerView;->I0:[I

    invoke-virtual {v14, v15, v3, v12, v9}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v5

    const/16 v2, 0x1d

    if-lt v0, v2, :cond_e

    move v6, v12

    move-object v2, v14

    move-object v4, v15

    .line 154
    invoke-static/range {v1 .. v6}, Landroidx/lifecycle/Q;->e(Landroidx/recyclerview/widget/RecyclerView;Landroid/content/Context;[ILandroid/util/AttributeSet;Landroid/content/res/TypedArray;I)V

    :cond_e
    const/4 v4, 0x1

    .line 155
    invoke-virtual {v5, v9, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    .line 156
    invoke-virtual {v5}, Landroid/content/res/TypedArray;->recycle()V

    .line 157
    invoke-virtual {v1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setNestedScrollingEnabled(Z)V

    return-void
.end method

.method public static D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    instance-of v0, p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v2, 0x0

    .line 21
    :goto_0
    if-ge v2, v0, :cond_3

    .line 22
    .line 23
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->D(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    return-object v3

    .line 34
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_3
    return-object v1
.end method

.method public static I(Landroid/view/View;)Ld2/V;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ld2/H;

    .line 10
    .line 11
    iget-object p0, p0, Ld2/H;->a:Ld2/V;

    .line 12
    .line 13
    return-object p0
.end method

.method public static synthetic b(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Landroid/view/ViewGroup;->attachViewToParent(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic c(Landroidx/recyclerview/widget/RecyclerView;I)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->detachViewFromParent(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic d(Landroidx/recyclerview/widget/RecyclerView;)Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic e(Landroidx/recyclerview/widget/RecyclerView;II)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private getScrollingChildHelper()Lw1/j;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B0:Lw1/j;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lw1/j;

    .line 6
    .line 7
    invoke-direct {v0, p0}, Lw1/j;-><init>(Landroid/view/ViewGroup;)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B0:Lw1/j;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B0:Lw1/j;

    .line 13
    .line 14
    return-object v0
.end method

.method public static j(Ld2/V;)V
    .locals 3

    .line 1
    iget-object v0, p0, Ld2/V;->b:Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    if-eqz v0, :cond_3

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    check-cast v0, Landroid/view/View;

    .line 10
    .line 11
    :goto_0
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    iget-object v2, p0, Ld2/V;->a:Landroid/view/View;

    .line 15
    .line 16
    if-ne v0, v2, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v2, v0, Landroid/view/View;

    .line 24
    .line 25
    if-eqz v2, :cond_1

    .line 26
    .line 27
    check-cast v0, Landroid/view/View;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v1

    .line 31
    goto :goto_0

    .line 32
    :cond_2
    iput-object v1, p0, Ld2/V;->b:Ljava/lang/ref/WeakReference;

    .line 33
    .line 34
    :cond_3
    :goto_1
    return-void
.end method


# virtual methods
.method public final A(Landroid/view/View;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    if-eqz v0, :cond_0

    .line 6
    .line 7
    if-eq v0, p0, :cond_0

    .line 8
    .line 9
    instance-of v1, v0, Landroid/view/View;

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move-object p1, v0

    .line 14
    check-cast p1, Landroid/view/View;

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-ne v0, p0, :cond_1

    .line 22
    .line 23
    return-object p1

    .line 24
    :cond_1
    const/4 p1, 0x0

    .line 25
    return-object p1
.end method

.method public final B(Landroid/view/MotionEvent;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    const/4 v3, 0x0

    .line 12
    move v4, v3

    .line 13
    :goto_0
    if-ge v4, v2, :cond_5

    .line 14
    .line 15
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v5

    .line 19
    check-cast v5, Ld2/k;

    .line 20
    .line 21
    iget v6, v5, Ld2/k;->v:I

    .line 22
    .line 23
    const/4 v7, 0x1

    .line 24
    const/4 v8, 0x2

    .line 25
    if-ne v6, v7, :cond_3

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 32
    .line 33
    .line 34
    move-result v9

    .line 35
    invoke-virtual {v5, v6, v9}, Ld2/k;->d(FF)Z

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 40
    .line 41
    .line 42
    move-result v9

    .line 43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    invoke-virtual {v5, v9, v10}, Ld2/k;->c(FF)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 52
    .line 53
    .line 54
    move-result v10

    .line 55
    if-nez v10, :cond_4

    .line 56
    .line 57
    if-nez v6, :cond_0

    .line 58
    .line 59
    if-eqz v9, :cond_4

    .line 60
    .line 61
    :cond_0
    if-eqz v9, :cond_1

    .line 62
    .line 63
    iput v7, v5, Ld2/k;->w:I

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    float-to-int v6, v6

    .line 70
    int-to-float v6, v6

    .line 71
    iput v6, v5, Ld2/k;->p:F

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    if-eqz v6, :cond_2

    .line 75
    .line 76
    iput v8, v5, Ld2/k;->w:I

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    float-to-int v6, v6

    .line 83
    int-to-float v6, v6

    .line 84
    iput v6, v5, Ld2/k;->m:F

    .line 85
    .line 86
    :cond_2
    :goto_1
    invoke-virtual {v5, v8}, Ld2/k;->f(I)V

    .line 87
    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    if-ne v6, v8, :cond_4

    .line 91
    .line 92
    :goto_2
    const/4 v6, 0x3

    .line 93
    if-eq v0, v6, :cond_4

    .line 94
    .line 95
    iput-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Ld2/k;

    .line 96
    .line 97
    return v7

    .line 98
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_5
    return v3
.end method

.method public final C([I)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/G0;->v()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    const/4 v0, -0x1

    .line 12
    aput v0, p1, v2

    .line 13
    .line 14
    aput v0, p1, v1

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const v3, 0x7fffffff

    .line 18
    .line 19
    .line 20
    const/high16 v4, -0x80000000

    .line 21
    .line 22
    move v5, v2

    .line 23
    :goto_0
    if-ge v5, v0, :cond_4

    .line 24
    .line 25
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 26
    .line 27
    invoke-virtual {v6, v5}, LB0/G0;->u(I)Landroid/view/View;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-virtual {v6}, Ld2/V;->o()Z

    .line 36
    .line 37
    .line 38
    move-result v7

    .line 39
    if-eqz v7, :cond_1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    invoke-virtual {v6}, Ld2/V;->b()I

    .line 43
    .line 44
    .line 45
    move-result v6

    .line 46
    if-ge v6, v3, :cond_2

    .line 47
    .line 48
    move v3, v6

    .line 49
    :cond_2
    if-le v6, v4, :cond_3

    .line 50
    .line 51
    move v4, v6

    .line 52
    :cond_3
    :goto_1
    add-int/lit8 v5, v5, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_4
    aput v3, p1, v2

    .line 56
    .line 57
    aput v4, p1, v1

    .line 58
    .line 59
    return-void
.end method

.method public final E(I)Ld2/V;
    .locals 5

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 8
    .line 9
    invoke-virtual {v0}, LB0/G0;->G()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v0, :cond_3

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 17
    .line 18
    invoke-virtual {v3, v2}, LB0/G0;->F(I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-virtual {v3}, Ld2/V;->h()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->F(Ld2/V;)I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    if-ne v4, p1, :cond_2

    .line 39
    .line 40
    iget-object v1, v3, Ld2/V;->a:Landroid/view/View;

    .line 41
    .line 42
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 43
    .line 44
    iget-object v4, v4, LB0/G0;->t:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v4, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    move-object v1, v3

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    return-object v3

    .line 57
    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-object v1
.end method

.method public final F(Ld2/V;)I
    .locals 7

    .line 1
    iget v0, p1, Ld2/V;->j:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, 0x20c

    .line 4
    .line 5
    const/4 v1, -0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, Ld2/V;->e()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    iget p1, p1, Ld2/V;->c:I

    .line 17
    .line 18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 19
    .line 20
    iget-object v0, v0, LL0/l;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    const/4 v3, 0x0

    .line 29
    :goto_0
    if-ge v3, v2, :cond_9

    .line 30
    .line 31
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ld2/a;

    .line 36
    .line 37
    iget v5, v4, Ld2/a;->a:I

    .line 38
    .line 39
    const/4 v6, 0x1

    .line 40
    if-eq v5, v6, :cond_7

    .line 41
    .line 42
    const/4 v6, 0x2

    .line 43
    if-eq v5, v6, :cond_5

    .line 44
    .line 45
    const/16 v6, 0x8

    .line 46
    .line 47
    if-eq v5, v6, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    iget v5, v4, Ld2/a;->b:I

    .line 51
    .line 52
    if-ne v5, p1, :cond_3

    .line 53
    .line 54
    iget p1, v4, Ld2/a;->c:I

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    if-ge v5, p1, :cond_4

    .line 58
    .line 59
    add-int/lit8 p1, p1, -0x1

    .line 60
    .line 61
    :cond_4
    iget v4, v4, Ld2/a;->c:I

    .line 62
    .line 63
    if-gt v4, p1, :cond_8

    .line 64
    .line 65
    add-int/lit8 p1, p1, 0x1

    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_5
    iget v5, v4, Ld2/a;->b:I

    .line 69
    .line 70
    if-gt v5, p1, :cond_8

    .line 71
    .line 72
    iget v4, v4, Ld2/a;->c:I

    .line 73
    .line 74
    add-int/2addr v5, v4

    .line 75
    if-le v5, p1, :cond_6

    .line 76
    .line 77
    :goto_1
    return v1

    .line 78
    :cond_6
    sub-int/2addr p1, v4

    .line 79
    goto :goto_2

    .line 80
    :cond_7
    iget v5, v4, Ld2/a;->b:I

    .line 81
    .line 82
    if-gt v5, p1, :cond_8

    .line 83
    .line 84
    iget v4, v4, Ld2/a;->c:I

    .line 85
    .line 86
    add-int/2addr p1, v4

    .line 87
    :cond_8
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_9
    return p1
.end method

.method public final G(Ld2/V;)J
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 2
    .line 3
    iget-boolean v0, v0, Ld2/z;->b:Z

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-wide v0, p1, Ld2/V;->e:J

    .line 8
    .line 9
    return-wide v0

    .line 10
    :cond_0
    iget p1, p1, Ld2/V;->c:I

    .line 11
    .line 12
    int-to-long v0, p1

    .line 13
    return-wide v0
.end method

.method public final H(Landroid/view/View;)Ld2/V;
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-ne v0, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "View "

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const-string p1, " is not a direct child of "

    .line 23
    .line 24
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    throw v0

    .line 38
    :cond_1
    :goto_0
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    return-object p1
.end method

.method public final J(Landroid/view/View;)Landroid/graphics/Rect;
    .locals 9

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Ld2/H;

    .line 6
    .line 7
    iget-boolean v1, v0, Ld2/H;->c:Z

    .line 8
    .line 9
    iget-object v2, v0, Ld2/H;->b:Landroid/graphics/Rect;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    iget-boolean v1, v1, Ld2/S;->g:Z

    .line 17
    .line 18
    if-eqz v1, :cond_2

    .line 19
    .line 20
    iget-object v1, v0, Ld2/H;->a:Ld2/V;

    .line 21
    .line 22
    invoke-virtual {v1}, Ld2/V;->k()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    iget-object v1, v0, Ld2/H;->a:Ld2/V;

    .line 29
    .line 30
    invoke-virtual {v1}, Ld2/V;->f()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    :cond_1
    :goto_0
    return-object v2

    .line 37
    :cond_2
    const/4 v1, 0x0

    .line 38
    invoke-virtual {v2, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 39
    .line 40
    .line 41
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    move v5, v1

    .line 48
    :goto_1
    if-ge v5, v4, :cond_3

    .line 49
    .line 50
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView;->x:Landroid/graphics/Rect;

    .line 51
    .line 52
    invoke-virtual {v6, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v7

    .line 59
    check-cast v7, Ld2/E;

    .line 60
    .line 61
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 65
    .line 66
    .line 67
    move-result-object v7

    .line 68
    check-cast v7, Ld2/H;

    .line 69
    .line 70
    iget-object v7, v7, Ld2/H;->a:Ld2/V;

    .line 71
    .line 72
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v6, v1, v1, v1, v1}, Landroid/graphics/Rect;->set(IIII)V

    .line 76
    .line 77
    .line 78
    iget v7, v2, Landroid/graphics/Rect;->left:I

    .line 79
    .line 80
    iget v8, v6, Landroid/graphics/Rect;->left:I

    .line 81
    .line 82
    add-int/2addr v7, v8

    .line 83
    iput v7, v2, Landroid/graphics/Rect;->left:I

    .line 84
    .line 85
    iget v7, v2, Landroid/graphics/Rect;->top:I

    .line 86
    .line 87
    iget v8, v6, Landroid/graphics/Rect;->top:I

    .line 88
    .line 89
    add-int/2addr v7, v8

    .line 90
    iput v7, v2, Landroid/graphics/Rect;->top:I

    .line 91
    .line 92
    iget v7, v2, Landroid/graphics/Rect;->right:I

    .line 93
    .line 94
    iget v8, v6, Landroid/graphics/Rect;->right:I

    .line 95
    .line 96
    add-int/2addr v7, v8

    .line 97
    iput v7, v2, Landroid/graphics/Rect;->right:I

    .line 98
    .line 99
    iget v7, v2, Landroid/graphics/Rect;->bottom:I

    .line 100
    .line 101
    iget v6, v6, Landroid/graphics/Rect;->bottom:I

    .line 102
    .line 103
    add-int/2addr v7, v6

    .line 104
    iput v7, v2, Landroid/graphics/Rect;->bottom:I

    .line 105
    .line 106
    add-int/lit8 v5, v5, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_3
    iput-boolean v1, v0, Ld2/H;->c:Z

    .line 110
    .line 111
    return-object v2
.end method

.method public final K()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 10
    .line 11
    invoke-virtual {v0}, LL0/l;->l()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
.end method

.method public final L()Z
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 2
    .line 3
    if-lez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
.end method

.method public final M(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x2

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ld2/G;->n0(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final N()V
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/G0;->G()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const/4 v3, 0x1

    .line 10
    if-ge v2, v0, :cond_0

    .line 11
    .line 12
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 13
    .line 14
    invoke-virtual {v4, v2}, LB0/G0;->F(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ld2/H;

    .line 23
    .line 24
    iput-boolean v3, v4, Ld2/H;->c:Z

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 30
    .line 31
    iget-object v0, v0, Ld2/M;->c:Ljava/util/ArrayList;

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    :goto_1
    if-ge v1, v2, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    check-cast v4, Ld2/V;

    .line 44
    .line 45
    iget-object v4, v4, Ld2/V;->a:Landroid/view/View;

    .line 46
    .line 47
    invoke-virtual {v4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    check-cast v4, Ld2/H;

    .line 52
    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    iput-boolean v3, v4, Ld2/H;->c:Z

    .line 56
    .line 57
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    return-void
.end method

.method public final O(IIZ)V
    .locals 9

    .line 1
    add-int v0, p1, p2

    .line 2
    .line 3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 4
    .line 5
    invoke-virtual {v1}, LB0/G0;->G()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    :goto_0
    const/16 v3, 0x8

    .line 11
    .line 12
    const/4 v4, 0x1

    .line 13
    if-ge v2, v1, :cond_2

    .line 14
    .line 15
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 16
    .line 17
    invoke-virtual {v5, v2}, LB0/G0;->F(I)Landroid/view/View;

    .line 18
    .line 19
    .line 20
    move-result-object v5

    .line 21
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    if-eqz v5, :cond_1

    .line 26
    .line 27
    invoke-virtual {v5}, Ld2/V;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v6

    .line 31
    if-nez v6, :cond_1

    .line 32
    .line 33
    iget v6, v5, Ld2/V;->c:I

    .line 34
    .line 35
    iget-object v7, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 36
    .line 37
    if-lt v6, v0, :cond_0

    .line 38
    .line 39
    neg-int v3, p2

    .line 40
    invoke-virtual {v5, v3, p3}, Ld2/V;->l(IZ)V

    .line 41
    .line 42
    .line 43
    iput-boolean v4, v7, Ld2/S;->f:Z

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    if-lt v6, p1, :cond_1

    .line 47
    .line 48
    add-int/lit8 v6, p1, -0x1

    .line 49
    .line 50
    neg-int v8, p2

    .line 51
    invoke-virtual {v5, v3}, Ld2/V;->a(I)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v5, v8, p3}, Ld2/V;->l(IZ)V

    .line 55
    .line 56
    .line 57
    iput v6, v5, Ld2/V;->c:I

    .line 58
    .line 59
    iput-boolean v4, v7, Ld2/S;->f:Z

    .line 60
    .line 61
    :cond_1
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 65
    .line 66
    iget-object v2, v1, Ld2/M;->c:Ljava/util/ArrayList;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    sub-int/2addr v5, v4

    .line 73
    :goto_2
    if-ltz v5, :cond_5

    .line 74
    .line 75
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    check-cast v4, Ld2/V;

    .line 80
    .line 81
    if-eqz v4, :cond_4

    .line 82
    .line 83
    iget v6, v4, Ld2/V;->c:I

    .line 84
    .line 85
    if-lt v6, v0, :cond_3

    .line 86
    .line 87
    neg-int v6, p2

    .line 88
    invoke-virtual {v4, v6, p3}, Ld2/V;->l(IZ)V

    .line 89
    .line 90
    .line 91
    goto :goto_3

    .line 92
    :cond_3
    if-lt v6, p1, :cond_4

    .line 93
    .line 94
    invoke-virtual {v4, v3}, Ld2/V;->a(I)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1, v5}, Ld2/M;->e(I)V

    .line 98
    .line 99
    .line 100
    :cond_4
    :goto_3
    add-int/lit8 v5, v5, -0x1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_5
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 104
    .line 105
    .line 106
    return-void
.end method

.method public final P()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 6
    .line 7
    return-void
.end method

.method public final Q(Z)V
    .locals 6

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    sub-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 6
    .line 7
    if-ge v0, v1, :cond_4

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 11
    .line 12
    if-eqz p1, :cond_4

    .line 13
    .line 14
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 15
    .line 16
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->N:Landroid/view/accessibility/AccessibilityManager;

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    invoke-static {}, Landroid/view/accessibility/AccessibilityEvent;->obtain()Landroid/view/accessibility/AccessibilityEvent;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    const/16 v2, 0x800

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Landroid/view/accessibility/AccessibilityEvent;->setEventType(I)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, p1}, Landroid/view/accessibility/AccessibilityEvent;->setContentChangeTypes(I)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F0:Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    sub-int/2addr v0, v1

    .line 52
    :goto_0
    if-ltz v0, :cond_3

    .line 53
    .line 54
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v1

    .line 58
    check-cast v1, Ld2/V;

    .line 59
    .line 60
    iget-object v2, v1, Ld2/V;->a:Landroid/view/View;

    .line 61
    .line 62
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    if-ne v2, p0, :cond_2

    .line 67
    .line 68
    invoke-virtual {v1}, Ld2/V;->o()Z

    .line 69
    .line 70
    .line 71
    move-result v2

    .line 72
    if-eqz v2, :cond_1

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_1
    iget v2, v1, Ld2/V;->q:I

    .line 76
    .line 77
    const/4 v3, -0x1

    .line 78
    if-eq v2, v3, :cond_2

    .line 79
    .line 80
    iget-object v4, v1, Ld2/V;->a:Landroid/view/View;

    .line 81
    .line 82
    sget-object v5, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 83
    .line 84
    invoke-virtual {v4, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 85
    .line 86
    .line 87
    iput v3, v1, Ld2/V;->q:I

    .line 88
    .line 89
    :cond_2
    :goto_1
    add-int/lit8 v0, v0, -0x1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_3
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 93
    .line 94
    .line 95
    :cond_4
    return-void
.end method

.method public final R(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 10
    .line 11
    if-ne v1, v2, :cond_1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    :goto_0
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 23
    .line 24
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/high16 v2, 0x3f000000    # 0.5f

    .line 29
    .line 30
    add-float/2addr v1, v2

    .line 31
    float-to-int v1, v1

    .line 32
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 33
    .line 34
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:I

    .line 35
    .line 36
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    add-float/2addr p1, v2

    .line 41
    float-to-int p1, p1

    .line 42
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 43
    .line 44
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:I

    .line 45
    .line 46
    :cond_1
    return-void
.end method

.method public final S()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G0:LA1/b;

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 14
    .line 15
    .line 16
    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 18
    .line 19
    :cond_0
    return-void
.end method

.method public final T(Ld2/V;LM/t;)V
    .locals 4

    .line 1
    iget v0, p1, Ld2/V;->j:I

    .line 2
    .line 3
    and-int/lit16 v0, v0, -0x2001

    .line 4
    .line 5
    iput v0, p1, Ld2/V;->j:I

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 8
    .line 9
    iget-boolean v0, v0, Ld2/S;->h:Z

    .line 10
    .line 11
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->v:LZ/m;

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ld2/V;->k()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p1}, Ld2/V;->h()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Ld2/V;->o()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_0

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->G(Ld2/V;)J

    .line 34
    .line 35
    .line 36
    move-result-wide v2

    .line 37
    iget-object v0, v1, LZ/m;->s:Ljava/lang/Object;

    .line 38
    .line 39
    check-cast v0, Lr/q;

    .line 40
    .line 41
    invoke-virtual {v0, v2, v3, p1}, Lr/q;->e(JLjava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object v0, v1, LZ/m;->r:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, Lr/Q;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    check-cast v1, Ld2/g0;

    .line 53
    .line 54
    if-nez v1, :cond_1

    .line 55
    .line 56
    invoke-static {}, Ld2/g0;->a()Ld2/g0;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-virtual {v0, p1, v1}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    :cond_1
    iput-object p2, v1, Ld2/g0;->b:LM/t;

    .line 64
    .line 65
    iget p1, v1, Ld2/g0;->a:I

    .line 66
    .line 67
    or-int/lit8 p1, p1, 0x4

    .line 68
    .line 69
    iput p1, v1, Ld2/g0;->a:I

    .line 70
    .line 71
    return-void
.end method

.method public final U(Landroid/view/View;Landroid/view/View;)V
    .locals 11

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    move-object v0, p2

    .line 4
    goto :goto_0

    .line 5
    :cond_0
    move-object v0, p1

    .line 6
    :goto_0
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->x:Landroid/graphics/Rect;

    .line 15
    .line 16
    const/4 v4, 0x0

    .line 17
    invoke-virtual {v3, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    instance-of v1, v0, Ld2/H;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Ld2/H;

    .line 29
    .line 30
    iget-boolean v1, v0, Ld2/H;->c:Z

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    .line 34
    iget-object v0, v0, Ld2/H;->b:Landroid/graphics/Rect;

    .line 35
    .line 36
    iget v1, v3, Landroid/graphics/Rect;->left:I

    .line 37
    .line 38
    iget v2, v0, Landroid/graphics/Rect;->left:I

    .line 39
    .line 40
    sub-int/2addr v1, v2

    .line 41
    iput v1, v3, Landroid/graphics/Rect;->left:I

    .line 42
    .line 43
    iget v1, v3, Landroid/graphics/Rect;->right:I

    .line 44
    .line 45
    iget v2, v0, Landroid/graphics/Rect;->right:I

    .line 46
    .line 47
    add-int/2addr v1, v2

    .line 48
    iput v1, v3, Landroid/graphics/Rect;->right:I

    .line 49
    .line 50
    iget v1, v3, Landroid/graphics/Rect;->top:I

    .line 51
    .line 52
    iget v2, v0, Landroid/graphics/Rect;->top:I

    .line 53
    .line 54
    sub-int/2addr v1, v2

    .line 55
    iput v1, v3, Landroid/graphics/Rect;->top:I

    .line 56
    .line 57
    iget v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 58
    .line 59
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 60
    .line 61
    add-int/2addr v1, v0

    .line 62
    iput v1, v3, Landroid/graphics/Rect;->bottom:I

    .line 63
    .line 64
    :cond_1
    if-eqz p2, :cond_2

    .line 65
    .line 66
    invoke-virtual {p0, p2, v3}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1, v3}, Landroid/view/ViewGroup;->offsetRectIntoDescendantCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 70
    .line 71
    .line 72
    :cond_2
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 73
    .line 74
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 75
    .line 76
    const/4 v1, 0x1

    .line 77
    xor-int/lit8 v9, v0, 0x1

    .line 78
    .line 79
    if-nez p2, :cond_3

    .line 80
    .line 81
    move v10, v1

    .line 82
    goto :goto_1

    .line 83
    :cond_3
    move v10, v4

    .line 84
    :goto_1
    iget-object v8, p0, Landroidx/recyclerview/widget/RecyclerView;->x:Landroid/graphics/Rect;

    .line 85
    .line 86
    move-object v6, p0

    .line 87
    move-object v7, p1

    .line 88
    invoke-virtual/range {v5 .. v10}, Ld2/G;->k0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 89
    .line 90
    .line 91
    return-void
.end method

.method public final V()V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/view/VelocityTracker;->clear()V

    .line 6
    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->c0(I)V

    .line 10
    .line 11
    .line 12
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 33
    .line 34
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    or-int/2addr v0, v1

    .line 39
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 40
    .line 41
    if-eqz v1, :cond_3

    .line 42
    .line 43
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 44
    .line 45
    .line 46
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 47
    .line 48
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    or-int/2addr v0, v1

    .line 53
    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 54
    .line 55
    if-eqz v1, :cond_4

    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 58
    .line 59
    .line 60
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 61
    .line 62
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    or-int/2addr v0, v1

    .line 67
    :cond_4
    if-eqz v0, :cond_5

    .line 68
    .line 69
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 72
    .line 73
    .line 74
    :cond_5
    return-void
.end method

.method public final W(IILandroid/view/MotionEvent;)Z
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v8, p1

    .line 4
    .line 5
    move/from16 v9, p2

    .line 6
    .line 7
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 8
    .line 9
    .line 10
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 11
    .line 12
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->E0:[I

    .line 13
    .line 14
    const/4 v10, 0x1

    .line 15
    const/4 v11, 0x0

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    aput v11, v7, v11

    .line 19
    .line 20
    aput v11, v7, v10

    .line 21
    .line 22
    invoke-virtual {v0, v8, v9, v7}, Landroidx/recyclerview/widget/RecyclerView;->X(II[I)V

    .line 23
    .line 24
    .line 25
    aget v1, v7, v11

    .line 26
    .line 27
    aget v2, v7, v10

    .line 28
    .line 29
    sub-int v3, v8, v1

    .line 30
    .line 31
    sub-int v4, v9, v2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v1, v11

    .line 35
    move v2, v1

    .line 36
    move v3, v2

    .line 37
    move v4, v3

    .line 38
    :goto_0
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/util/ArrayList;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-nez v5, :cond_1

    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 47
    .line 48
    .line 49
    :cond_1
    aput v11, v7, v11

    .line 50
    .line 51
    aput v11, v7, v10

    .line 52
    .line 53
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->C0:[I

    .line 54
    .line 55
    const/4 v6, 0x0

    .line 56
    invoke-virtual/range {v0 .. v7}, Landroidx/recyclerview/widget/RecyclerView;->s(IIII[II[I)V

    .line 57
    .line 58
    .line 59
    aget v5, v7, v11

    .line 60
    .line 61
    sub-int/2addr v3, v5

    .line 62
    aget v6, v7, v10

    .line 63
    .line 64
    sub-int/2addr v4, v6

    .line 65
    if-nez v5, :cond_3

    .line 66
    .line 67
    if-eqz v6, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move v5, v11

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    move v5, v10

    .line 73
    :goto_2
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 74
    .line 75
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->C0:[I

    .line 76
    .line 77
    aget v12, v7, v11

    .line 78
    .line 79
    sub-int/2addr v6, v12

    .line 80
    iput v6, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 81
    .line 82
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 83
    .line 84
    aget v7, v7, v10

    .line 85
    .line 86
    sub-int/2addr v6, v7

    .line 87
    iput v6, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 88
    .line 89
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 90
    .line 91
    aget v13, v6, v11

    .line 92
    .line 93
    add-int/2addr v13, v12

    .line 94
    aput v13, v6, v11

    .line 95
    .line 96
    aget v12, v6, v10

    .line 97
    .line 98
    add-int/2addr v12, v7

    .line 99
    aput v12, v6, v10

    .line 100
    .line 101
    invoke-virtual {v0}, Landroid/view/View;->getOverScrollMode()I

    .line 102
    .line 103
    .line 104
    move-result v6

    .line 105
    const/4 v7, 0x2

    .line 106
    if-eq v6, v7, :cond_c

    .line 107
    .line 108
    if-eqz p3, :cond_4

    .line 109
    .line 110
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getSource()I

    .line 111
    .line 112
    .line 113
    move-result v6

    .line 114
    const/16 v7, 0x2002

    .line 115
    .line 116
    and-int/2addr v6, v7

    .line 117
    if-ne v6, v7, :cond_5

    .line 118
    .line 119
    :cond_4
    move/from16 v16, v10

    .line 120
    .line 121
    goto/16 :goto_7

    .line 122
    .line 123
    :cond_5
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getX()F

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    int-to-float v3, v3

    .line 128
    invoke-virtual/range {p3 .. p3}, Landroid/view/MotionEvent;->getY()F

    .line 129
    .line 130
    .line 131
    move-result v7

    .line 132
    int-to-float v4, v4

    .line 133
    const/4 v12, 0x0

    .line 134
    cmpg-float v13, v3, v12

    .line 135
    .line 136
    const/high16 v14, 0x3f800000    # 1.0f

    .line 137
    .line 138
    if-gez v13, :cond_6

    .line 139
    .line 140
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->v()V

    .line 141
    .line 142
    .line 143
    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 144
    .line 145
    neg-float v15, v3

    .line 146
    move/from16 v16, v10

    .line 147
    .line 148
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 149
    .line 150
    .line 151
    move-result v10

    .line 152
    int-to-float v10, v10

    .line 153
    div-float/2addr v15, v10

    .line 154
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    int-to-float v10, v10

    .line 159
    div-float/2addr v7, v10

    .line 160
    sub-float v7, v14, v7

    .line 161
    .line 162
    invoke-static {v13, v15, v7}, LA1/c;->a(Landroid/widget/EdgeEffect;FF)V

    .line 163
    .line 164
    .line 165
    :goto_3
    move/from16 v7, v16

    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_6
    move/from16 v16, v10

    .line 169
    .line 170
    cmpl-float v10, v3, v12

    .line 171
    .line 172
    if-lez v10, :cond_7

    .line 173
    .line 174
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->w()V

    .line 175
    .line 176
    .line 177
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 178
    .line 179
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 180
    .line 181
    .line 182
    move-result v13

    .line 183
    int-to-float v13, v13

    .line 184
    div-float v13, v3, v13

    .line 185
    .line 186
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 187
    .line 188
    .line 189
    move-result v15

    .line 190
    int-to-float v15, v15

    .line 191
    div-float/2addr v7, v15

    .line 192
    invoke-static {v10, v13, v7}, LA1/c;->a(Landroid/widget/EdgeEffect;FF)V

    .line 193
    .line 194
    .line 195
    goto :goto_3

    .line 196
    :cond_7
    move v7, v11

    .line 197
    :goto_4
    cmpg-float v10, v4, v12

    .line 198
    .line 199
    if-gez v10, :cond_8

    .line 200
    .line 201
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->x()V

    .line 202
    .line 203
    .line 204
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 205
    .line 206
    neg-float v10, v4

    .line 207
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 208
    .line 209
    .line 210
    move-result v13

    .line 211
    int-to-float v13, v13

    .line 212
    div-float/2addr v10, v13

    .line 213
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    int-to-float v13, v13

    .line 218
    div-float/2addr v6, v13

    .line 219
    invoke-static {v7, v10, v6}, LA1/c;->a(Landroid/widget/EdgeEffect;FF)V

    .line 220
    .line 221
    .line 222
    :goto_5
    move/from16 v7, v16

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_8
    cmpl-float v10, v4, v12

    .line 226
    .line 227
    if-lez v10, :cond_9

    .line 228
    .line 229
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->u()V

    .line 230
    .line 231
    .line 232
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 233
    .line 234
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 235
    .line 236
    .line 237
    move-result v10

    .line 238
    int-to-float v10, v10

    .line 239
    div-float v10, v4, v10

    .line 240
    .line 241
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 242
    .line 243
    .line 244
    move-result v13

    .line 245
    int-to-float v13, v13

    .line 246
    div-float/2addr v6, v13

    .line 247
    sub-float/2addr v14, v6

    .line 248
    invoke-static {v7, v10, v14}, LA1/c;->a(Landroid/widget/EdgeEffect;FF)V

    .line 249
    .line 250
    .line 251
    goto :goto_5

    .line 252
    :cond_9
    :goto_6
    if-nez v7, :cond_a

    .line 253
    .line 254
    cmpl-float v3, v3, v12

    .line 255
    .line 256
    if-nez v3, :cond_a

    .line 257
    .line 258
    cmpl-float v3, v4, v12

    .line 259
    .line 260
    if-eqz v3, :cond_b

    .line 261
    .line 262
    :cond_a
    sget-object v3, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 263
    .line 264
    invoke-virtual {v0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 265
    .line 266
    .line 267
    :cond_b
    :goto_7
    invoke-virtual/range {p0 .. p2}, Landroidx/recyclerview/widget/RecyclerView;->l(II)V

    .line 268
    .line 269
    .line 270
    goto :goto_8

    .line 271
    :cond_c
    move/from16 v16, v10

    .line 272
    .line 273
    :goto_8
    if-nez v1, :cond_d

    .line 274
    .line 275
    if-eqz v2, :cond_e

    .line 276
    .line 277
    :cond_d
    invoke-virtual {v0, v1, v2}, Landroidx/recyclerview/widget/RecyclerView;->t(II)V

    .line 278
    .line 279
    .line 280
    :cond_e
    invoke-virtual {v0}, Landroid/view/View;->awakenScrollBars()Z

    .line 281
    .line 282
    .line 283
    move-result v3

    .line 284
    if-nez v3, :cond_f

    .line 285
    .line 286
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 287
    .line 288
    .line 289
    :cond_f
    if-nez v5, :cond_11

    .line 290
    .line 291
    if-nez v1, :cond_11

    .line 292
    .line 293
    if-eqz v2, :cond_10

    .line 294
    .line 295
    goto :goto_9

    .line 296
    :cond_10
    return v11

    .line 297
    :cond_11
    :goto_9
    return v16
.end method

.method public final X(II[I)V
    .locals 9

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->a0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    .line 5
    .line 6
    .line 7
    sget v0, Lr1/g;->a:I

    .line 8
    .line 9
    const-string v0, "RV Scroll"

    .line 10
    .line 11
    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->z(Ld2/S;)V

    .line 17
    .line 18
    .line 19
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    if-eqz p1, :cond_0

    .line 23
    .line 24
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 25
    .line 26
    invoke-virtual {v3, p1, v1, v0}, Ld2/G;->m0(ILd2/M;Ld2/S;)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move p1, v2

    .line 32
    :goto_0
    if-eqz p2, :cond_1

    .line 33
    .line 34
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 35
    .line 36
    invoke-virtual {v3, p2, v1, v0}, Ld2/G;->o0(ILd2/M;Ld2/S;)I

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    goto :goto_1

    .line 41
    :cond_1
    move p2, v2

    .line 42
    :goto_1
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 43
    .line 44
    .line 45
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 46
    .line 47
    invoke-virtual {v0}, LB0/G0;->v()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    move v3, v2

    .line 52
    :goto_2
    if-ge v3, v1, :cond_4

    .line 53
    .line 54
    invoke-virtual {v0, v3}, LB0/G0;->u(I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)Ld2/V;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    if-eqz v5, :cond_3

    .line 63
    .line 64
    iget-object v5, v5, Ld2/V;->i:Ld2/V;

    .line 65
    .line 66
    if-eqz v5, :cond_3

    .line 67
    .line 68
    iget-object v5, v5, Ld2/V;->a:Landroid/view/View;

    .line 69
    .line 70
    invoke-virtual {v4}, Landroid/view/View;->getLeft()I

    .line 71
    .line 72
    .line 73
    move-result v6

    .line 74
    invoke-virtual {v4}, Landroid/view/View;->getTop()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-virtual {v5}, Landroid/view/View;->getLeft()I

    .line 79
    .line 80
    .line 81
    move-result v7

    .line 82
    if-ne v6, v7, :cond_2

    .line 83
    .line 84
    invoke-virtual {v5}, Landroid/view/View;->getTop()I

    .line 85
    .line 86
    .line 87
    move-result v7

    .line 88
    if-eq v4, v7, :cond_3

    .line 89
    .line 90
    :cond_2
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 91
    .line 92
    .line 93
    move-result v7

    .line 94
    add-int/2addr v7, v6

    .line 95
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 96
    .line 97
    .line 98
    move-result v8

    .line 99
    add-int/2addr v8, v4

    .line 100
    invoke-virtual {v5, v6, v4, v7, v8}, Landroid/view/View;->layout(IIII)V

    .line 101
    .line 102
    .line 103
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 104
    .line 105
    goto :goto_2

    .line 106
    :cond_4
    const/4 v0, 0x1

    .line 107
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->b0(Z)V

    .line 111
    .line 112
    .line 113
    if-eqz p3, :cond_5

    .line 114
    .line 115
    aput p1, p3, v2

    .line 116
    .line 117
    aput p2, p3, v0

    .line 118
    .line 119
    :cond_5
    return-void
.end method

.method public final Y(I)V
    .locals 2

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 11
    .line 12
    iget-object v1, v0, Ld2/U;->w:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Ld2/G;->e:Ld2/t;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {v0}, Ld2/t;->i()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 34
    .line 35
    if-nez v0, :cond_2

    .line 36
    .line 37
    const-string p1, "RecyclerView"

    .line 38
    .line 39
    const-string v0, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 40
    .line 41
    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-virtual {v0, p1}, Ld2/G;->n0(I)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Landroid/view/View;->awakenScrollBars()Z

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public final Z(IIZ)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "RecyclerView"

    .line 6
    .line 7
    const-string p2, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v0}, Ld2/G;->d()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    if-nez v0, :cond_2

    .line 24
    .line 25
    move p1, v1

    .line 26
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 27
    .line 28
    invoke-virtual {v0}, Ld2/G;->e()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_3

    .line 33
    .line 34
    move p2, v1

    .line 35
    :cond_3
    if-nez p1, :cond_5

    .line 36
    .line 37
    if-eqz p2, :cond_4

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_4
    :goto_0
    return-void

    .line 41
    :cond_5
    :goto_1
    if-eqz p3, :cond_8

    .line 42
    .line 43
    const/4 p3, 0x1

    .line 44
    if-eqz p1, :cond_6

    .line 45
    .line 46
    move v1, p3

    .line 47
    :cond_6
    if-eqz p2, :cond_7

    .line 48
    .line 49
    or-int/lit8 v1, v1, 0x2

    .line 50
    .line 51
    :cond_7
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-virtual {v0, v1, p3}, Lw1/j;->g(II)Z

    .line 56
    .line 57
    .line 58
    :cond_8
    iget-object p3, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 59
    .line 60
    const/high16 v0, -0x80000000

    .line 61
    .line 62
    const/4 v1, 0x0

    .line 63
    invoke-virtual {p3, p1, p2, v0, v1}, Ld2/U;->b(IIILandroid/view/animation/Interpolator;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final a0()V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    const/4 v0, 0x0

    .line 14
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 15
    .line 16
    :cond_0
    return-void
.end method

.method public final addFocusables(Ljava/util/ArrayList;II)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/view/ViewGroup;->addFocusables(Ljava/util/ArrayList;II)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final b0(Z)V
    .locals 3

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    iput v1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    if-nez p1, :cond_1

    .line 10
    .line 11
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 12
    .line 13
    if-nez v2, :cond_1

    .line 14
    .line 15
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 16
    .line 17
    :cond_1
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 18
    .line 19
    if-ne v2, v1, :cond_3

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 28
    .line 29
    if-nez p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 43
    .line 44
    if-nez p1, :cond_3

    .line 45
    .line 46
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 47
    .line 48
    :cond_3
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 49
    .line 50
    sub-int/2addr p1, v1

    .line 51
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 52
    .line 53
    return-void
.end method

.method public final c0(I)V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lw1/j;->h(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final checkLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Ld2/H;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 6
    .line 7
    check-cast p1, Ld2/H;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ld2/G;->f(Ld2/H;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    const/4 p1, 0x1

    .line 16
    return p1

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    return p1
.end method

.method public final computeHorizontalScrollExtent()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ld2/G;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ld2/G;->j(Ld2/S;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final computeHorizontalScrollOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ld2/G;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ld2/G;->k(Ld2/S;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final computeHorizontalScrollRange()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ld2/G;->d()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ld2/G;->l(Ld2/S;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final computeVerticalScrollExtent()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ld2/G;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ld2/G;->m(Ld2/S;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final computeVerticalScrollOffset()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ld2/G;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ld2/G;->n(Ld2/S;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final computeVerticalScrollRange()I
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0}, Ld2/G;->e()Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 13
    .line 14
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ld2/G;->o(Ld2/S;)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    return v0
.end method

.method public final dispatchNestedFling(FFZ)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2, p3}, Lw1/j;->a(FFZ)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final dispatchNestedPreFling(FF)Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1, p2}, Lw1/j;->b(FF)Z

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    return p1
.end method

.method public final dispatchNestedPreScroll(II[I[I)Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v3, 0x0

    .line 6
    move v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v4, p3

    .line 9
    move-object v5, p4

    .line 10
    invoke-virtual/range {v0 .. v5}, Lw1/j;->c(III[I[I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final dispatchNestedScroll(IIII[I)Z
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v6, 0x0

    .line 6
    const/4 v7, 0x0

    .line 7
    move v1, p1

    .line 8
    move v2, p2

    .line 9
    move v3, p3

    .line 10
    move v4, p4

    .line 11
    move-object v5, p5

    .line 12
    invoke-virtual/range {v0 .. v7}, Lw1/j;->d(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    return p1
.end method

.method public final dispatchPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)Z
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->onPopulateAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x1

    .line 5
    return p1
.end method

.method public final dispatchRestoreInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchThawSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final dispatchSaveInstanceState(Landroid/util/SparseArray;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->dispatchFreezeSelfOnly(Landroid/util/SparseArray;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final draw(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    if-ge v3, v1, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    check-cast v4, Ld2/E;

    .line 19
    .line 20
    invoke-virtual {v4, p1, p0}, Ld2/E;->b(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;)V

    .line 21
    .line 22
    .line 23
    add-int/lit8 v3, v3, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    if-nez v1, :cond_3

    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 42
    .line 43
    if-eqz v4, :cond_1

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move v4, v2

    .line 51
    :goto_1
    const/high16 v5, 0x43870000    # 270.0f

    .line 52
    .line 53
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    neg-int v5, v5

    .line 61
    add-int/2addr v5, v4

    .line 62
    int-to-float v4, v5

    .line 63
    const/4 v5, 0x0

    .line 64
    invoke-virtual {p1, v4, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 65
    .line 66
    .line 67
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 68
    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    invoke-virtual {v4, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_2

    .line 76
    .line 77
    move v4, v3

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v4, v2

    .line 80
    :goto_2
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 81
    .line 82
    .line 83
    goto :goto_3

    .line 84
    :cond_3
    move v4, v2

    .line 85
    :goto_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 86
    .line 87
    if-eqz v1, :cond_6

    .line 88
    .line 89
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    if-nez v1, :cond_6

    .line 94
    .line 95
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 100
    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 104
    .line 105
    .line 106
    move-result v5

    .line 107
    int-to-float v5, v5

    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 109
    .line 110
    .line 111
    move-result v6

    .line 112
    int-to-float v6, v6

    .line 113
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 114
    .line 115
    .line 116
    :cond_4
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 117
    .line 118
    if-eqz v5, :cond_5

    .line 119
    .line 120
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    move v5, v3

    .line 127
    goto :goto_4

    .line 128
    :cond_5
    move v5, v2

    .line 129
    :goto_4
    or-int/2addr v4, v5

    .line 130
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 131
    .line 132
    .line 133
    :cond_6
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 134
    .line 135
    if-eqz v1, :cond_9

    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 138
    .line 139
    .line 140
    move-result v1

    .line 141
    if-nez v1, :cond_9

    .line 142
    .line 143
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 144
    .line 145
    .line 146
    move-result v1

    .line 147
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 148
    .line 149
    .line 150
    move-result v5

    .line 151
    iget-boolean v6, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 152
    .line 153
    if-eqz v6, :cond_7

    .line 154
    .line 155
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 156
    .line 157
    .line 158
    move-result v6

    .line 159
    goto :goto_5

    .line 160
    :cond_7
    move v6, v2

    .line 161
    :goto_5
    const/high16 v7, 0x42b40000    # 90.0f

    .line 162
    .line 163
    invoke-virtual {p1, v7}, Landroid/graphics/Canvas;->rotate(F)V

    .line 164
    .line 165
    .line 166
    neg-int v6, v6

    .line 167
    int-to-float v6, v6

    .line 168
    neg-int v5, v5

    .line 169
    int-to-float v5, v5

    .line 170
    invoke-virtual {p1, v6, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 171
    .line 172
    .line 173
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 174
    .line 175
    if-eqz v5, :cond_8

    .line 176
    .line 177
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 178
    .line 179
    .line 180
    move-result v5

    .line 181
    if-eqz v5, :cond_8

    .line 182
    .line 183
    move v5, v3

    .line 184
    goto :goto_6

    .line 185
    :cond_8
    move v5, v2

    .line 186
    :goto_6
    or-int/2addr v4, v5

    .line 187
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 188
    .line 189
    .line 190
    :cond_9
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 191
    .line 192
    if-eqz v1, :cond_c

    .line 193
    .line 194
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 195
    .line 196
    .line 197
    move-result v1

    .line 198
    if-nez v1, :cond_c

    .line 199
    .line 200
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 201
    .line 202
    .line 203
    move-result v1

    .line 204
    const/high16 v5, 0x43340000    # 180.0f

    .line 205
    .line 206
    invoke-virtual {p1, v5}, Landroid/graphics/Canvas;->rotate(F)V

    .line 207
    .line 208
    .line 209
    iget-boolean v5, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 210
    .line 211
    if-eqz v5, :cond_a

    .line 212
    .line 213
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 214
    .line 215
    .line 216
    move-result v5

    .line 217
    neg-int v5, v5

    .line 218
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 219
    .line 220
    .line 221
    move-result v6

    .line 222
    add-int/2addr v6, v5

    .line 223
    int-to-float v5, v6

    .line 224
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 225
    .line 226
    .line 227
    move-result v6

    .line 228
    neg-int v6, v6

    .line 229
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 230
    .line 231
    .line 232
    move-result v7

    .line 233
    add-int/2addr v7, v6

    .line 234
    int-to-float v6, v7

    .line 235
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 236
    .line 237
    .line 238
    goto :goto_7

    .line 239
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 240
    .line 241
    .line 242
    move-result v5

    .line 243
    neg-int v5, v5

    .line 244
    int-to-float v5, v5

    .line 245
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 246
    .line 247
    .line 248
    move-result v6

    .line 249
    neg-int v6, v6

    .line 250
    int-to-float v6, v6

    .line 251
    invoke-virtual {p1, v5, v6}, Landroid/graphics/Canvas;->translate(FF)V

    .line 252
    .line 253
    .line 254
    :goto_7
    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 255
    .line 256
    if-eqz v5, :cond_b

    .line 257
    .line 258
    invoke-virtual {v5, p1}, Landroid/widget/EdgeEffect;->draw(Landroid/graphics/Canvas;)Z

    .line 259
    .line 260
    .line 261
    move-result v5

    .line 262
    if-eqz v5, :cond_b

    .line 263
    .line 264
    move v2, v3

    .line 265
    :cond_b
    or-int/2addr v4, v2

    .line 266
    invoke-virtual {p1, v1}, Landroid/graphics/Canvas;->restoreToCount(I)V

    .line 267
    .line 268
    .line 269
    :cond_c
    if-nez v4, :cond_d

    .line 270
    .line 271
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 272
    .line 273
    if-eqz p1, :cond_d

    .line 274
    .line 275
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 276
    .line 277
    .line 278
    move-result p1

    .line 279
    if-lez p1, :cond_d

    .line 280
    .line 281
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 282
    .line 283
    invoke-virtual {p1}, Ld2/D;->f()Z

    .line 284
    .line 285
    .line 286
    move-result p1

    .line 287
    if-eqz p1, :cond_d

    .line 288
    .line 289
    goto :goto_8

    .line 290
    :cond_d
    move v3, v4

    .line 291
    :goto_8
    if-eqz v3, :cond_e

    .line 292
    .line 293
    sget-object p1, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 294
    .line 295
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 296
    .line 297
    .line 298
    :cond_e
    return-void
.end method

.method public final drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/ViewGroup;->drawChild(Landroid/graphics/Canvas;Landroid/view/View;J)Z

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public final f(Ld2/V;)V
    .locals 5

    .line 1
    iget-object v0, p1, Ld2/V;->a:Landroid/view/View;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x1

    .line 8
    if-ne v1, p0, :cond_0

    .line 9
    .line 10
    move v1, v2

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x0

    .line 13
    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)Ld2/V;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {v3, v4}, Ld2/M;->j(Ld2/V;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Ld2/V;->j()Z

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    const/4 v3, -0x1

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-virtual {p1, v0, v3, v1, v2}, LB0/G0;->m(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 42
    .line 43
    invoke-virtual {p1, v0, v3, v2}, LB0/G0;->l(Landroid/view/View;IZ)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 48
    .line 49
    iget-object v1, p1, LB0/G0;->r:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v1, Ld2/y;

    .line 52
    .line 53
    iget-object v1, v1, Ld2/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 54
    .line 55
    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-ltz v1, :cond_3

    .line 60
    .line 61
    iget-object v2, p1, LB0/G0;->s:Ljava/lang/Object;

    .line 62
    .line 63
    check-cast v2, LO3/T;

    .line 64
    .line 65
    invoke-virtual {v2, v1}, LO3/T;->k(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1, v0}, LB0/G0;->I(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 73
    .line 74
    new-instance v1, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    const-string v2, "view is not a child, cannot hide "

    .line 77
    .line 78
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    throw p1
.end method

.method public final focusSearch(Landroid/view/View;I)Landroid/view/View;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p2

    .line 6
    .line 7
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 8
    .line 9
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 13
    .line 14
    const/4 v4, 0x1

    .line 15
    const/4 v5, 0x0

    .line 16
    if-eqz v3, :cond_0

    .line 17
    .line 18
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 19
    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_0

    .line 27
    .line 28
    iget-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    move v3, v4

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v5

    .line 35
    :goto_0
    invoke-static {}, Landroid/view/FocusFinder;->getInstance()Landroid/view/FocusFinder;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 40
    .line 41
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 42
    .line 43
    const/16 v9, 0x11

    .line 44
    .line 45
    const/16 v11, 0x21

    .line 46
    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x2

    .line 49
    if-eqz v3, :cond_b

    .line 50
    .line 51
    if-eq v2, v14, :cond_1

    .line 52
    .line 53
    if-ne v2, v4, :cond_b

    .line 54
    .line 55
    :cond_1
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 56
    .line 57
    invoke-virtual {v3}, Ld2/G;->e()Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-eqz v3, :cond_3

    .line 62
    .line 63
    if-ne v2, v14, :cond_2

    .line 64
    .line 65
    const/16 v3, 0x82

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    move v3, v11

    .line 69
    :goto_1
    invoke-virtual {v6, v0, v1, v3}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    if-nez v3, :cond_3

    .line 74
    .line 75
    move v3, v4

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    move v3, v5

    .line 78
    :goto_2
    if-nez v3, :cond_8

    .line 79
    .line 80
    iget-object v15, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 81
    .line 82
    invoke-virtual {v15}, Ld2/G;->d()Z

    .line 83
    .line 84
    .line 85
    move-result v15

    .line 86
    if-eqz v15, :cond_8

    .line 87
    .line 88
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 89
    .line 90
    invoke-virtual {v3}, Ld2/G;->C()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-ne v3, v4, :cond_4

    .line 95
    .line 96
    move v3, v4

    .line 97
    goto :goto_3

    .line 98
    :cond_4
    move v3, v5

    .line 99
    :goto_3
    if-ne v2, v14, :cond_5

    .line 100
    .line 101
    move v15, v4

    .line 102
    goto :goto_4

    .line 103
    :cond_5
    move v15, v5

    .line 104
    :goto_4
    xor-int/2addr v3, v15

    .line 105
    if-eqz v3, :cond_6

    .line 106
    .line 107
    const/16 v3, 0x42

    .line 108
    .line 109
    goto :goto_5

    .line 110
    :cond_6
    move v3, v9

    .line 111
    :goto_5
    invoke-virtual {v6, v0, v1, v3}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    if-nez v3, :cond_7

    .line 116
    .line 117
    move v3, v4

    .line 118
    goto :goto_6

    .line 119
    :cond_7
    move v3, v5

    .line 120
    :cond_8
    :goto_6
    if-eqz v3, :cond_a

    .line 121
    .line 122
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 123
    .line 124
    .line 125
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    if-nez v3, :cond_9

    .line 130
    .line 131
    goto :goto_7

    .line 132
    :cond_9
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->a0()V

    .line 133
    .line 134
    .line 135
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 136
    .line 137
    invoke-virtual {v3, v1, v2, v8, v7}, Ld2/G;->S(Landroid/view/View;ILd2/M;Ld2/S;)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->b0(Z)V

    .line 141
    .line 142
    .line 143
    :cond_a
    invoke-virtual {v6, v0, v1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    goto :goto_8

    .line 148
    :cond_b
    invoke-virtual {v6, v0, v1, v2}, Landroid/view/FocusFinder;->findNextFocus(Landroid/view/ViewGroup;Landroid/view/View;I)Landroid/view/View;

    .line 149
    .line 150
    .line 151
    move-result-object v6

    .line 152
    if-nez v6, :cond_d

    .line 153
    .line 154
    if-eqz v3, :cond_d

    .line 155
    .line 156
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->m()V

    .line 157
    .line 158
    .line 159
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    if-nez v3, :cond_c

    .line 164
    .line 165
    :goto_7
    return-object v13

    .line 166
    :cond_c
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->a0()V

    .line 167
    .line 168
    .line 169
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 170
    .line 171
    invoke-virtual {v3, v1, v2, v8, v7}, Ld2/G;->S(Landroid/view/View;ILd2/M;Ld2/S;)Landroid/view/View;

    .line 172
    .line 173
    .line 174
    move-result-object v3

    .line 175
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->b0(Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_d
    move-object v3, v6

    .line 180
    :goto_8
    if-eqz v3, :cond_f

    .line 181
    .line 182
    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-nez v6, :cond_f

    .line 187
    .line 188
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    if-nez v4, :cond_e

    .line 193
    .line 194
    invoke-super/range {p0 .. p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    return-object v1

    .line 199
    :cond_e
    invoke-virtual {v0, v3, v13}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;Landroid/view/View;)V

    .line 200
    .line 201
    .line 202
    return-object v1

    .line 203
    :cond_f
    if-eqz v3, :cond_1d

    .line 204
    .line 205
    if-ne v3, v0, :cond_10

    .line 206
    .line 207
    goto/16 :goto_c

    .line 208
    .line 209
    :cond_10
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    .line 210
    .line 211
    .line 212
    move-result-object v6

    .line 213
    if-nez v6, :cond_11

    .line 214
    .line 215
    move v4, v5

    .line 216
    goto/16 :goto_d

    .line 217
    .line 218
    :cond_11
    if-nez v1, :cond_12

    .line 219
    .line 220
    goto/16 :goto_d

    .line 221
    .line 222
    :cond_12
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    .line 223
    .line 224
    .line 225
    move-result-object v6

    .line 226
    if-nez v6, :cond_13

    .line 227
    .line 228
    goto/16 :goto_d

    .line 229
    .line 230
    :cond_13
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 231
    .line 232
    .line 233
    move-result v6

    .line 234
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 235
    .line 236
    .line 237
    move-result v7

    .line 238
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->x:Landroid/graphics/Rect;

    .line 239
    .line 240
    invoke-virtual {v8, v5, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 244
    .line 245
    .line 246
    move-result v6

    .line 247
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 248
    .line 249
    .line 250
    move-result v7

    .line 251
    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->y:Landroid/graphics/Rect;

    .line 252
    .line 253
    invoke-virtual {v13, v5, v5, v6, v7}, Landroid/graphics/Rect;->set(IIII)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v0, v1, v8}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0, v3, v13}, Landroid/view/ViewGroup;->offsetDescendantRectToMyCoords(Landroid/view/View;Landroid/graphics/Rect;)V

    .line 260
    .line 261
    .line 262
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 263
    .line 264
    invoke-virtual {v6}, Ld2/G;->C()I

    .line 265
    .line 266
    .line 267
    move-result v6

    .line 268
    if-ne v6, v4, :cond_14

    .line 269
    .line 270
    const/4 v6, -0x1

    .line 271
    goto :goto_9

    .line 272
    :cond_14
    move v6, v4

    .line 273
    :goto_9
    iget v15, v8, Landroid/graphics/Rect;->left:I

    .line 274
    .line 275
    iget v5, v13, Landroid/graphics/Rect;->left:I

    .line 276
    .line 277
    if-lt v15, v5, :cond_15

    .line 278
    .line 279
    iget v7, v8, Landroid/graphics/Rect;->right:I

    .line 280
    .line 281
    if-gt v7, v5, :cond_16

    .line 282
    .line 283
    :cond_15
    iget v7, v8, Landroid/graphics/Rect;->right:I

    .line 284
    .line 285
    iget v12, v13, Landroid/graphics/Rect;->right:I

    .line 286
    .line 287
    if-ge v7, v12, :cond_16

    .line 288
    .line 289
    move v5, v4

    .line 290
    goto :goto_a

    .line 291
    :cond_16
    iget v7, v8, Landroid/graphics/Rect;->right:I

    .line 292
    .line 293
    iget v12, v13, Landroid/graphics/Rect;->right:I

    .line 294
    .line 295
    if-gt v7, v12, :cond_17

    .line 296
    .line 297
    if-lt v15, v12, :cond_18

    .line 298
    .line 299
    :cond_17
    if-le v15, v5, :cond_18

    .line 300
    .line 301
    const/4 v5, -0x1

    .line 302
    goto :goto_a

    .line 303
    :cond_18
    const/4 v5, 0x0

    .line 304
    :goto_a
    iget v7, v8, Landroid/graphics/Rect;->top:I

    .line 305
    .line 306
    iget v12, v13, Landroid/graphics/Rect;->top:I

    .line 307
    .line 308
    if-lt v7, v12, :cond_19

    .line 309
    .line 310
    iget v15, v8, Landroid/graphics/Rect;->bottom:I

    .line 311
    .line 312
    if-gt v15, v12, :cond_1a

    .line 313
    .line 314
    :cond_19
    iget v15, v8, Landroid/graphics/Rect;->bottom:I

    .line 315
    .line 316
    iget v10, v13, Landroid/graphics/Rect;->bottom:I

    .line 317
    .line 318
    if-ge v15, v10, :cond_1a

    .line 319
    .line 320
    move v7, v4

    .line 321
    goto :goto_b

    .line 322
    :cond_1a
    iget v8, v8, Landroid/graphics/Rect;->bottom:I

    .line 323
    .line 324
    iget v10, v13, Landroid/graphics/Rect;->bottom:I

    .line 325
    .line 326
    if-gt v8, v10, :cond_1b

    .line 327
    .line 328
    if-lt v7, v10, :cond_1c

    .line 329
    .line 330
    :cond_1b
    if-le v7, v12, :cond_1c

    .line 331
    .line 332
    const/4 v7, -0x1

    .line 333
    goto :goto_b

    .line 334
    :cond_1c
    const/4 v7, 0x0

    .line 335
    :goto_b
    if-eq v2, v4, :cond_23

    .line 336
    .line 337
    if-eq v2, v14, :cond_22

    .line 338
    .line 339
    if-eq v2, v9, :cond_21

    .line 340
    .line 341
    if-eq v2, v11, :cond_20

    .line 342
    .line 343
    const/16 v6, 0x42

    .line 344
    .line 345
    if-eq v2, v6, :cond_1f

    .line 346
    .line 347
    const/16 v6, 0x82

    .line 348
    .line 349
    if-ne v2, v6, :cond_1e

    .line 350
    .line 351
    if-lez v7, :cond_1d

    .line 352
    .line 353
    goto :goto_d

    .line 354
    :cond_1d
    :goto_c
    const/4 v4, 0x0

    .line 355
    goto :goto_d

    .line 356
    :cond_1e
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 357
    .line 358
    new-instance v3, Ljava/lang/StringBuilder;

    .line 359
    .line 360
    const-string v4, "Invalid direction: "

    .line 361
    .line 362
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 369
    .line 370
    .line 371
    move-result-object v2

    .line 372
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 373
    .line 374
    .line 375
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 376
    .line 377
    .line 378
    move-result-object v2

    .line 379
    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 380
    .line 381
    .line 382
    throw v1

    .line 383
    :cond_1f
    if-lez v5, :cond_1d

    .line 384
    .line 385
    goto :goto_d

    .line 386
    :cond_20
    if-gez v7, :cond_1d

    .line 387
    .line 388
    goto :goto_d

    .line 389
    :cond_21
    if-gez v5, :cond_1d

    .line 390
    .line 391
    goto :goto_d

    .line 392
    :cond_22
    if-gtz v7, :cond_24

    .line 393
    .line 394
    if-nez v7, :cond_1d

    .line 395
    .line 396
    mul-int/2addr v5, v6

    .line 397
    if-ltz v5, :cond_1d

    .line 398
    .line 399
    goto :goto_d

    .line 400
    :cond_23
    if-ltz v7, :cond_24

    .line 401
    .line 402
    if-nez v7, :cond_1d

    .line 403
    .line 404
    mul-int/2addr v5, v6

    .line 405
    if-gtz v5, :cond_1d

    .line 406
    .line 407
    :cond_24
    :goto_d
    if-eqz v4, :cond_25

    .line 408
    .line 409
    return-object v3

    .line 410
    :cond_25
    invoke-super/range {p0 .. p2}, Landroid/view/ViewGroup;->focusSearch(Landroid/view/View;I)Landroid/view/View;

    .line 411
    .line 412
    .line 413
    move-result-object v1

    .line 414
    return-object v1
.end method

.method public final g(Ld2/E;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v1, "Cannot add item decoration during a scroll  or layout"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ld2/G;->c(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final generateDefaultLayoutParams()Landroid/view/ViewGroup$LayoutParams;
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ld2/G;->r()Ld2/H;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    return-object v0

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 11
    .line 12
    new-instance v1, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v2, "RecyclerView has no LayoutManager"

    .line 15
    .line 16
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    throw v0
.end method

.method public final generateLayoutParams(Landroid/util/AttributeSet;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Ld2/G;->s(Landroid/content/Context;Landroid/util/AttributeSet;)Ld2/H;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final generateLayoutParams(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;
    .locals 2

    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    if-eqz v0, :cond_0

    .line 5
    invoke-virtual {v0, p1}, Ld2/G;->t(Landroid/view/ViewGroup$LayoutParams;)Ld2/H;

    move-result-object p1

    return-object p1

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "RecyclerView has no LayoutManager"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public getAccessibilityClassName()Ljava/lang/CharSequence;
    .locals 1

    .line 1
    const-string v0, "androidx.recyclerview.widget.RecyclerView"

    .line 2
    .line 3
    return-object v0
.end method

.method public getAdapter()Ld2/z;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 2
    .line 3
    return-object v0
.end method

.method public getBaseline()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    return v0

    .line 10
    :cond_0
    invoke-super {p0}, Landroid/view/View;->getBaseline()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0
.end method

.method public final getChildDrawingOrder(II)I
    .locals 0

    .line 1
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->getChildDrawingOrder(II)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    return p1
.end method

.method public getClipToPadding()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 2
    .line 3
    return v0
.end method

.method public getCompatAccessibilityDelegate()Ld2/X;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ld2/X;

    .line 2
    .line 3
    return-object v0
.end method

.method public getEdgeEffectFactory()Ld2/C;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->S:Ld2/C;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemAnimator()Ld2/D;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 2
    .line 3
    return-object v0
.end method

.method public getItemDecorationCount()I
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public getLayoutManager()Ld2/G;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    return-object v0
.end method

.method public getMaxFlingVelocity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 2
    .line 3
    return v0
.end method

.method public getMinFlingVelocity()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 2
    .line 3
    return v0
.end method

.method public getNanoTime()J
    .locals 2

    .line 1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    return-wide v0
.end method

.method public getOnFlingListener()Ld2/I;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:Ld2/I;

    .line 2
    .line 3
    return-object v0
.end method

.method public getPreserveFocusAfterLayout()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->o0:Z

    .line 2
    .line 3
    return v0
.end method

.method public getRecycledViewPool()Ld2/L;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 2
    .line 3
    invoke-virtual {v0}, Ld2/M;->c()Ld2/L;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    return-object v0
.end method

.method public getScrollState()I
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 2
    .line 3
    return v0
.end method

.method public final h(Ld2/J;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 11
    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final hasNestedScrollingParent()Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lw1/j;->f(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    return v0
.end method

.method public final i(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    .line 9
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "Cannot call this method while RecyclerView is computing a layout or scrolling"

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p1

    .line 33
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 34
    .line 35
    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    throw v0

    .line 39
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 40
    .line 41
    if-lez p1, :cond_2

    .line 42
    .line 43
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v1, ""

    .line 48
    .line 49
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v0, "RecyclerView"

    .line 67
    .line 68
    const-string v1, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame."

    .line 69
    .line 70
    invoke-static {v0, v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 71
    .line 72
    .line 73
    :cond_2
    return-void
.end method

.method public final isAttachedToWindow()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isLayoutSuppressed()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 2
    .line 3
    return v0
.end method

.method public final isNestedScrollingEnabled()Z
    .locals 1

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v0, v0, Lw1/j;->d:Z

    .line 6
    .line 7
    return v0
.end method

.method public final k()V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 2
    .line 3
    invoke-virtual {v0}, LB0/G0;->G()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    move v2, v1

    .line 9
    :goto_0
    const/4 v3, -0x1

    .line 10
    if-ge v2, v0, :cond_1

    .line 11
    .line 12
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 13
    .line 14
    invoke-virtual {v4, v2}, LB0/G0;->F(I)Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    invoke-virtual {v4}, Ld2/V;->o()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-nez v5, :cond_0

    .line 27
    .line 28
    iput v3, v4, Ld2/V;->d:I

    .line 29
    .line 30
    iput v3, v4, Ld2/V;->g:I

    .line 31
    .line 32
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 36
    .line 37
    iget-object v2, v0, Ld2/M;->a:Ljava/util/ArrayList;

    .line 38
    .line 39
    iget-object v4, v0, Ld2/M;->c:Ljava/util/ArrayList;

    .line 40
    .line 41
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    move v6, v1

    .line 46
    :goto_1
    if-ge v6, v5, :cond_2

    .line 47
    .line 48
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ld2/V;

    .line 53
    .line 54
    iput v3, v7, Ld2/V;->d:I

    .line 55
    .line 56
    iput v3, v7, Ld2/V;->g:I

    .line 57
    .line 58
    add-int/lit8 v6, v6, 0x1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 62
    .line 63
    .line 64
    move-result v4

    .line 65
    move v5, v1

    .line 66
    :goto_2
    if-ge v5, v4, :cond_3

    .line 67
    .line 68
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    check-cast v6, Ld2/V;

    .line 73
    .line 74
    iput v3, v6, Ld2/V;->d:I

    .line 75
    .line 76
    iput v3, v6, Ld2/V;->g:I

    .line 77
    .line 78
    add-int/lit8 v5, v5, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    iget-object v2, v0, Ld2/M;->b:Ljava/util/ArrayList;

    .line 82
    .line 83
    if-eqz v2, :cond_4

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 86
    .line 87
    .line 88
    move-result v2

    .line 89
    :goto_3
    if-ge v1, v2, :cond_4

    .line 90
    .line 91
    iget-object v4, v0, Ld2/M;->b:Ljava/util/ArrayList;

    .line 92
    .line 93
    invoke-virtual {v4, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, Ld2/V;

    .line 98
    .line 99
    iput v3, v4, Ld2/V;->d:I

    .line 100
    .line 101
    iput v3, v4, Ld2/V;->g:I

    .line 102
    .line 103
    add-int/lit8 v1, v1, 0x1

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_4
    return-void
.end method

.method public final l(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    if-lez p1, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_1

    .line 35
    .line 36
    if-gez p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 41
    .line 42
    .line 43
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    or-int/2addr v0, p1

    .line 50
    :cond_1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 51
    .line 52
    if-eqz p1, :cond_2

    .line 53
    .line 54
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    if-nez p1, :cond_2

    .line 59
    .line 60
    if-lez p2, :cond_2

    .line 61
    .line 62
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 63
    .line 64
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 65
    .line 66
    .line 67
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    or-int/2addr v0, p1

    .line 74
    :cond_2
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 75
    .line 76
    if-eqz p1, :cond_3

    .line 77
    .line 78
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    if-nez p1, :cond_3

    .line 83
    .line 84
    if-gez p2, :cond_3

    .line 85
    .line 86
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 87
    .line 88
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->onRelease()V

    .line 89
    .line 90
    .line 91
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 92
    .line 93
    invoke-virtual {p1}, Landroid/widget/EdgeEffect;->isFinished()Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    or-int/2addr v0, p1

    .line 98
    :cond_3
    if-eqz v0, :cond_4

    .line 99
    .line 100
    sget-object p1, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 101
    .line 102
    invoke-virtual {p0}, Landroid/view/View;->postInvalidateOnAnimation()V

    .line 103
    .line 104
    .line 105
    :cond_4
    return-void
.end method

.method public final m()V
    .locals 3

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 2
    .line 3
    const-string v1, "RV FullInvalidate"

    .line 4
    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 13
    .line 14
    invoke-virtual {v0}, LL0/l;->l()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, LL0/l;->l()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    sget v0, Lr1/g;->a:I

    .line 31
    .line 32
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    .line 36
    .line 37
    .line 38
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 39
    .line 40
    .line 41
    :cond_2
    :goto_0
    return-void

    .line 42
    :cond_3
    :goto_1
    sget v0, Lr1/g;->a:I

    .line 43
    .line 44
    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    .line 48
    .line 49
    .line 50
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 51
    .line 52
    .line 53
    return-void
.end method

.method public final n(II)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    add-int/2addr v1, v0

    .line 10
    sget-object v0, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 11
    .line 12
    invoke-virtual {p0}, Landroid/view/View;->getMinimumWidth()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {p1, v1, v0}, Ld2/G;->g(III)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    invoke-virtual {p0}, Landroid/view/View;->getMinimumHeight()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    invoke-static {p2, v1, v0}, Ld2/G;->g(III)I

    .line 34
    .line 35
    .line 36
    move-result p2

    .line 37
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public final o()V
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 4
    .line 5
    const-string v2, "RecyclerView"

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    const-string v1, "No adapter attached; skipping layout"

    .line 10
    .line 11
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 12
    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 16
    .line 17
    if-nez v1, :cond_1

    .line 18
    .line 19
    const-string v1, "No layout manager attached; skipping layout"

    .line 20
    .line 21
    invoke-static {v2, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    iput-boolean v3, v1, Ld2/S;->i:Z

    .line 29
    .line 30
    iget v4, v1, Ld2/S;->d:I

    .line 31
    .line 32
    const/4 v5, 0x1

    .line 33
    if-ne v4, v5, :cond_2

    .line 34
    .line 35
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 36
    .line 37
    .line 38
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 39
    .line 40
    invoke-virtual {v4, v0}, Ld2/G;->p0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 48
    .line 49
    iget-object v6, v4, LL0/l;->c:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v6, Ljava/util/ArrayList;

    .line 52
    .line 53
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v6

    .line 57
    if-nez v6, :cond_3

    .line 58
    .line 59
    iget-object v4, v4, LL0/l;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-nez v4, :cond_3

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_3
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 71
    .line 72
    iget v4, v4, Ld2/G;->n:I

    .line 73
    .line 74
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 75
    .line 76
    .line 77
    move-result v6

    .line 78
    if-ne v4, v6, :cond_5

    .line 79
    .line 80
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 81
    .line 82
    iget v4, v4, Ld2/G;->o:I

    .line 83
    .line 84
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 85
    .line 86
    .line 87
    move-result v6

    .line 88
    if-eq v4, v6, :cond_4

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_4
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 92
    .line 93
    invoke-virtual {v4, v0}, Ld2/G;->p0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_5
    :goto_0
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 98
    .line 99
    invoke-virtual {v4, v0}, Ld2/G;->p0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    .line 103
    .line 104
    .line 105
    :goto_1
    const/4 v4, 0x4

    .line 106
    invoke-virtual {v1, v4}, Ld2/S;->a(I)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->a0()V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    .line 113
    .line 114
    .line 115
    iput v5, v1, Ld2/S;->d:I

    .line 116
    .line 117
    iget-boolean v6, v1, Ld2/S;->j:Z

    .line 118
    .line 119
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 120
    .line 121
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->v:LZ/m;

    .line 122
    .line 123
    if-eqz v6, :cond_21

    .line 124
    .line 125
    iget-object v6, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 126
    .line 127
    invoke-virtual {v6}, LB0/G0;->v()I

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    sub-int/2addr v6, v5

    .line 132
    :goto_2
    if-ltz v6, :cond_14

    .line 133
    .line 134
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 135
    .line 136
    invoke-virtual {v10, v6}, LB0/G0;->u(I)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object v10

    .line 140
    invoke-static {v10}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 141
    .line 142
    .line 143
    move-result-object v10

    .line 144
    invoke-virtual {v10}, Ld2/V;->o()Z

    .line 145
    .line 146
    .line 147
    move-result v11

    .line 148
    if-eqz v11, :cond_6

    .line 149
    .line 150
    move/from16 v17, v5

    .line 151
    .line 152
    goto/16 :goto_7

    .line 153
    .line 154
    :cond_6
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->G(Ld2/V;)J

    .line 155
    .line 156
    .line 157
    move-result-wide v11

    .line 158
    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 159
    .line 160
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 161
    .line 162
    .line 163
    new-instance v13, LM/t;

    .line 164
    .line 165
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v13, v10}, LM/t;->a(Ld2/V;)V

    .line 169
    .line 170
    .line 171
    iget-object v14, v9, LZ/m;->s:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v14, Lr/q;

    .line 174
    .line 175
    iget-object v15, v9, LZ/m;->r:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast v15, Lr/Q;

    .line 178
    .line 179
    invoke-virtual {v14, v11, v12}, Lr/q;->b(J)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    check-cast v14, Ld2/V;

    .line 184
    .line 185
    if-eqz v14, :cond_12

    .line 186
    .line 187
    invoke-virtual {v14}, Ld2/V;->o()Z

    .line 188
    .line 189
    .line 190
    move-result v16

    .line 191
    if-nez v16, :cond_12

    .line 192
    .line 193
    invoke-virtual {v15, v14}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v16

    .line 197
    move/from16 v17, v5

    .line 198
    .line 199
    move-object/from16 v5, v16

    .line 200
    .line 201
    check-cast v5, Ld2/g0;

    .line 202
    .line 203
    if-eqz v5, :cond_7

    .line 204
    .line 205
    iget v5, v5, Ld2/g0;->a:I

    .line 206
    .line 207
    and-int/lit8 v5, v5, 0x1

    .line 208
    .line 209
    if-eqz v5, :cond_7

    .line 210
    .line 211
    move/from16 v5, v17

    .line 212
    .line 213
    goto :goto_3

    .line 214
    :cond_7
    move v5, v3

    .line 215
    :goto_3
    invoke-virtual {v15, v10}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 216
    .line 217
    .line 218
    move-result-object v15

    .line 219
    check-cast v15, Ld2/g0;

    .line 220
    .line 221
    if-eqz v15, :cond_8

    .line 222
    .line 223
    iget v15, v15, Ld2/g0;->a:I

    .line 224
    .line 225
    and-int/lit8 v15, v15, 0x1

    .line 226
    .line 227
    if-eqz v15, :cond_8

    .line 228
    .line 229
    move/from16 v15, v17

    .line 230
    .line 231
    goto :goto_4

    .line 232
    :cond_8
    move v15, v3

    .line 233
    :goto_4
    if-eqz v5, :cond_9

    .line 234
    .line 235
    if-ne v14, v10, :cond_9

    .line 236
    .line 237
    invoke-virtual {v9, v10, v13}, LZ/m;->g(Ld2/V;LM/t;)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_7

    .line 241
    .line 242
    :cond_9
    invoke-virtual {v9, v14, v4}, LZ/m;->B(Ld2/V;I)LM/t;

    .line 243
    .line 244
    .line 245
    move-result-object v7

    .line 246
    invoke-virtual {v9, v10, v13}, LZ/m;->g(Ld2/V;LM/t;)V

    .line 247
    .line 248
    .line 249
    const/16 v13, 0x8

    .line 250
    .line 251
    invoke-virtual {v9, v10, v13}, LZ/m;->B(Ld2/V;I)LM/t;

    .line 252
    .line 253
    .line 254
    move-result-object v13

    .line 255
    if-nez v7, :cond_e

    .line 256
    .line 257
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 258
    .line 259
    invoke-virtual {v5}, LB0/G0;->v()I

    .line 260
    .line 261
    .line 262
    move-result v5

    .line 263
    move v7, v3

    .line 264
    :goto_5
    if-ge v7, v5, :cond_d

    .line 265
    .line 266
    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 267
    .line 268
    invoke-virtual {v13, v7}, LB0/G0;->u(I)Landroid/view/View;

    .line 269
    .line 270
    .line 271
    move-result-object v13

    .line 272
    invoke-static {v13}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 273
    .line 274
    .line 275
    move-result-object v13

    .line 276
    if-ne v13, v10, :cond_a

    .line 277
    .line 278
    goto :goto_6

    .line 279
    :cond_a
    invoke-virtual {v0, v13}, Landroidx/recyclerview/widget/RecyclerView;->G(Ld2/V;)J

    .line 280
    .line 281
    .line 282
    move-result-wide v18

    .line 283
    cmp-long v15, v18, v11

    .line 284
    .line 285
    if-nez v15, :cond_c

    .line 286
    .line 287
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 288
    .line 289
    const-string v2, " \n View Holder 2:"

    .line 290
    .line 291
    if-eqz v1, :cond_b

    .line 292
    .line 293
    iget-boolean v1, v1, Ld2/z;->b:Z

    .line 294
    .line 295
    if-eqz v1, :cond_b

    .line 296
    .line 297
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 298
    .line 299
    new-instance v3, Ljava/lang/StringBuilder;

    .line 300
    .line 301
    const-string v4, "Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:"

    .line 302
    .line 303
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 304
    .line 305
    .line 306
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 307
    .line 308
    .line 309
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 310
    .line 311
    .line 312
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 313
    .line 314
    .line 315
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v2

    .line 326
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    throw v1

    .line 330
    :cond_b
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 331
    .line 332
    new-instance v3, Ljava/lang/StringBuilder;

    .line 333
    .line 334
    const-string v4, "Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:"

    .line 335
    .line 336
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 340
    .line 341
    .line 342
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 343
    .line 344
    .line 345
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v2

    .line 352
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 360
    .line 361
    .line 362
    throw v1

    .line 363
    :cond_c
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 364
    .line 365
    goto :goto_5

    .line 366
    :cond_d
    new-instance v5, Ljava/lang/StringBuilder;

    .line 367
    .line 368
    const-string v7, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder "

    .line 369
    .line 370
    invoke-direct {v5, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 374
    .line 375
    .line 376
    const-string v7, " cannot be found but it is necessary for "

    .line 377
    .line 378
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v7

    .line 388
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 389
    .line 390
    .line 391
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 392
    .line 393
    .line 394
    move-result-object v5

    .line 395
    invoke-static {v2, v5}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 396
    .line 397
    .line 398
    goto :goto_7

    .line 399
    :cond_e
    invoke-virtual {v14, v3}, Ld2/V;->n(Z)V

    .line 400
    .line 401
    .line 402
    if-eqz v5, :cond_f

    .line 403
    .line 404
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->f(Ld2/V;)V

    .line 405
    .line 406
    .line 407
    :cond_f
    if-eq v14, v10, :cond_11

    .line 408
    .line 409
    if-eqz v15, :cond_10

    .line 410
    .line 411
    invoke-virtual {v0, v10}, Landroidx/recyclerview/widget/RecyclerView;->f(Ld2/V;)V

    .line 412
    .line 413
    .line 414
    :cond_10
    iput-object v10, v14, Ld2/V;->h:Ld2/V;

    .line 415
    .line 416
    invoke-virtual {v0, v14}, Landroidx/recyclerview/widget/RecyclerView;->f(Ld2/V;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v8, v14}, Ld2/M;->j(Ld2/V;)V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v10, v3}, Ld2/V;->n(Z)V

    .line 423
    .line 424
    .line 425
    iput-object v14, v10, Ld2/V;->i:Ld2/V;

    .line 426
    .line 427
    :cond_11
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 428
    .line 429
    invoke-virtual {v5, v14, v10, v7, v13}, Ld2/D;->a(Ld2/V;Ld2/V;LM/t;LM/t;)Z

    .line 430
    .line 431
    .line 432
    move-result v5

    .line 433
    if-eqz v5, :cond_13

    .line 434
    .line 435
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    .line 436
    .line 437
    .line 438
    goto :goto_7

    .line 439
    :cond_12
    move/from16 v17, v5

    .line 440
    .line 441
    invoke-virtual {v9, v10, v13}, LZ/m;->g(Ld2/V;LM/t;)V

    .line 442
    .line 443
    .line 444
    :cond_13
    :goto_7
    add-int/lit8 v6, v6, -0x1

    .line 445
    .line 446
    move/from16 v5, v17

    .line 447
    .line 448
    goto/16 :goto_2

    .line 449
    .line 450
    :cond_14
    move/from16 v17, v5

    .line 451
    .line 452
    iget-object v2, v9, LZ/m;->r:Ljava/lang/Object;

    .line 453
    .line 454
    check-cast v2, Lr/Q;

    .line 455
    .line 456
    iget v4, v2, Lr/Q;->s:I

    .line 457
    .line 458
    add-int/lit8 v4, v4, -0x1

    .line 459
    .line 460
    :goto_8
    if-ltz v4, :cond_20

    .line 461
    .line 462
    invoke-virtual {v2, v4}, Lr/Q;->f(I)Ljava/lang/Object;

    .line 463
    .line 464
    .line 465
    move-result-object v5

    .line 466
    move-object v11, v5

    .line 467
    check-cast v11, Ld2/V;

    .line 468
    .line 469
    invoke-virtual {v2, v4}, Lr/Q;->g(I)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v5

    .line 473
    check-cast v5, Ld2/g0;

    .line 474
    .line 475
    iget v6, v5, Ld2/g0;->a:I

    .line 476
    .line 477
    and-int/lit8 v7, v6, 0x3

    .line 478
    .line 479
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->H0:Ld2/x;

    .line 480
    .line 481
    const/4 v12, 0x3

    .line 482
    if-ne v7, v12, :cond_15

    .line 483
    .line 484
    iget-object v6, v10, Ld2/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 485
    .line 486
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 487
    .line 488
    iget-object v10, v11, Ld2/V;->a:Landroid/view/View;

    .line 489
    .line 490
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 491
    .line 492
    invoke-virtual {v7, v10, v6}, Ld2/G;->i0(Landroid/view/View;Ld2/M;)V

    .line 493
    .line 494
    .line 495
    :goto_9
    const/4 v7, 0x0

    .line 496
    goto/16 :goto_e

    .line 497
    .line 498
    :cond_15
    and-int/lit8 v7, v6, 0x1

    .line 499
    .line 500
    if-eqz v7, :cond_17

    .line 501
    .line 502
    iget-object v6, v5, Ld2/g0;->b:LM/t;

    .line 503
    .line 504
    if-nez v6, :cond_16

    .line 505
    .line 506
    iget-object v6, v10, Ld2/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 507
    .line 508
    iget-object v7, v6, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 509
    .line 510
    iget-object v10, v11, Ld2/V;->a:Landroid/view/View;

    .line 511
    .line 512
    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 513
    .line 514
    invoke-virtual {v7, v10, v6}, Ld2/G;->i0(Landroid/view/View;Ld2/M;)V

    .line 515
    .line 516
    .line 517
    goto :goto_9

    .line 518
    :cond_16
    iget-object v7, v5, Ld2/g0;->c:LM/t;

    .line 519
    .line 520
    invoke-virtual {v10, v11, v6, v7}, Ld2/x;->g(Ld2/V;LM/t;LM/t;)V

    .line 521
    .line 522
    .line 523
    goto :goto_9

    .line 524
    :cond_17
    and-int/lit8 v7, v6, 0xe

    .line 525
    .line 526
    const/16 v12, 0xe

    .line 527
    .line 528
    if-ne v7, v12, :cond_18

    .line 529
    .line 530
    iget-object v6, v5, Ld2/g0;->b:LM/t;

    .line 531
    .line 532
    iget-object v7, v5, Ld2/g0;->c:LM/t;

    .line 533
    .line 534
    invoke-virtual {v10, v11, v6, v7}, Ld2/x;->f(Ld2/V;LM/t;LM/t;)V

    .line 535
    .line 536
    .line 537
    goto :goto_9

    .line 538
    :cond_18
    and-int/lit8 v7, v6, 0xc

    .line 539
    .line 540
    const/16 v12, 0xc

    .line 541
    .line 542
    if-ne v7, v12, :cond_1d

    .line 543
    .line 544
    iget-object v6, v5, Ld2/g0;->b:LM/t;

    .line 545
    .line 546
    iget-object v7, v5, Ld2/g0;->c:LM/t;

    .line 547
    .line 548
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-virtual {v11, v3}, Ld2/V;->n(Z)V

    .line 552
    .line 553
    .line 554
    iget-object v10, v10, Ld2/x;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 555
    .line 556
    iget-boolean v12, v10, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 557
    .line 558
    if-eqz v12, :cond_19

    .line 559
    .line 560
    iget-object v12, v10, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 561
    .line 562
    invoke-virtual {v12, v11, v11, v6, v7}, Ld2/D;->a(Ld2/V;Ld2/V;LM/t;LM/t;)Z

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    if-eqz v6, :cond_1c

    .line 567
    .line 568
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    .line 569
    .line 570
    .line 571
    goto :goto_c

    .line 572
    :cond_19
    iget-object v12, v10, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 573
    .line 574
    check-cast v12, Ld2/h;

    .line 575
    .line 576
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 577
    .line 578
    .line 579
    iget v13, v6, LM/t;->a:I

    .line 580
    .line 581
    iget v14, v7, LM/t;->a:I

    .line 582
    .line 583
    if-ne v13, v14, :cond_1b

    .line 584
    .line 585
    iget v15, v6, LM/t;->b:I

    .line 586
    .line 587
    iget v3, v7, LM/t;->b:I

    .line 588
    .line 589
    if-eq v15, v3, :cond_1a

    .line 590
    .line 591
    goto :goto_a

    .line 592
    :cond_1a
    invoke-virtual {v12, v11}, Ld2/D;->c(Ld2/V;)V

    .line 593
    .line 594
    .line 595
    move-object v3, v10

    .line 596
    const/4 v6, 0x0

    .line 597
    goto :goto_b

    .line 598
    :cond_1b
    :goto_a
    iget v3, v6, LM/t;->b:I

    .line 599
    .line 600
    iget v15, v7, LM/t;->b:I

    .line 601
    .line 602
    move/from16 v20, v13

    .line 603
    .line 604
    move v13, v3

    .line 605
    move-object v3, v10

    .line 606
    move-object v10, v12

    .line 607
    move/from16 v12, v20

    .line 608
    .line 609
    invoke-virtual/range {v10 .. v15}, Ld2/h;->g(Ld2/V;IIII)Z

    .line 610
    .line 611
    .line 612
    move-result v6

    .line 613
    :goto_b
    if-eqz v6, :cond_1c

    .line 614
    .line 615
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->S()V

    .line 616
    .line 617
    .line 618
    :cond_1c
    :goto_c
    const/4 v3, 0x0

    .line 619
    goto :goto_9

    .line 620
    :cond_1d
    and-int/lit8 v3, v6, 0x4

    .line 621
    .line 622
    if-eqz v3, :cond_1f

    .line 623
    .line 624
    iget-object v3, v5, Ld2/g0;->b:LM/t;

    .line 625
    .line 626
    const/4 v7, 0x0

    .line 627
    invoke-virtual {v10, v11, v3, v7}, Ld2/x;->g(Ld2/V;LM/t;LM/t;)V

    .line 628
    .line 629
    .line 630
    :cond_1e
    :goto_d
    const/4 v3, 0x0

    .line 631
    goto :goto_e

    .line 632
    :cond_1f
    const/4 v7, 0x0

    .line 633
    and-int/lit8 v3, v6, 0x8

    .line 634
    .line 635
    if-eqz v3, :cond_1e

    .line 636
    .line 637
    iget-object v3, v5, Ld2/g0;->b:LM/t;

    .line 638
    .line 639
    iget-object v6, v5, Ld2/g0;->c:LM/t;

    .line 640
    .line 641
    invoke-virtual {v10, v11, v3, v6}, Ld2/x;->f(Ld2/V;LM/t;LM/t;)V

    .line 642
    .line 643
    .line 644
    goto :goto_d

    .line 645
    :goto_e
    iput v3, v5, Ld2/g0;->a:I

    .line 646
    .line 647
    iput-object v7, v5, Ld2/g0;->b:LM/t;

    .line 648
    .line 649
    iput-object v7, v5, Ld2/g0;->c:LM/t;

    .line 650
    .line 651
    sget-object v3, Ld2/g0;->d:Lb1/d;

    .line 652
    .line 653
    invoke-virtual {v3, v5}, Lb1/d;->c(Ljava/lang/Object;)Z

    .line 654
    .line 655
    .line 656
    add-int/lit8 v4, v4, -0x1

    .line 657
    .line 658
    const/4 v3, 0x0

    .line 659
    goto/16 :goto_8

    .line 660
    .line 661
    :cond_20
    :goto_f
    const/4 v7, 0x0

    .line 662
    goto :goto_10

    .line 663
    :cond_21
    move/from16 v17, v5

    .line 664
    .line 665
    goto :goto_f

    .line 666
    :goto_10
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 667
    .line 668
    invoke-virtual {v2, v8}, Ld2/G;->h0(Ld2/M;)V

    .line 669
    .line 670
    .line 671
    iget v2, v1, Ld2/S;->e:I

    .line 672
    .line 673
    iput v2, v1, Ld2/S;->b:I

    .line 674
    .line 675
    const/4 v3, 0x0

    .line 676
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 677
    .line 678
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 679
    .line 680
    iput-boolean v3, v1, Ld2/S;->j:Z

    .line 681
    .line 682
    iput-boolean v3, v1, Ld2/S;->k:Z

    .line 683
    .line 684
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 685
    .line 686
    iput-boolean v3, v2, Ld2/G;->f:Z

    .line 687
    .line 688
    iget-object v2, v8, Ld2/M;->b:Ljava/util/ArrayList;

    .line 689
    .line 690
    if-eqz v2, :cond_22

    .line 691
    .line 692
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 693
    .line 694
    .line 695
    :cond_22
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 696
    .line 697
    iget-boolean v4, v2, Ld2/G;->k:Z

    .line 698
    .line 699
    if-eqz v4, :cond_23

    .line 700
    .line 701
    iput v3, v2, Ld2/G;->j:I

    .line 702
    .line 703
    iput-boolean v3, v2, Ld2/G;->k:Z

    .line 704
    .line 705
    invoke-virtual {v8}, Ld2/M;->k()V

    .line 706
    .line 707
    .line 708
    :cond_23
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 709
    .line 710
    invoke-virtual {v2, v1}, Ld2/G;->c0(Ld2/S;)V

    .line 711
    .line 712
    .line 713
    move/from16 v2, v17

    .line 714
    .line 715
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    .line 716
    .line 717
    .line 718
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->b0(Z)V

    .line 719
    .line 720
    .line 721
    iget-object v4, v9, LZ/m;->r:Ljava/lang/Object;

    .line 722
    .line 723
    check-cast v4, Lr/Q;

    .line 724
    .line 725
    invoke-virtual {v4}, Lr/Q;->clear()V

    .line 726
    .line 727
    .line 728
    iget-object v4, v9, LZ/m;->s:Ljava/lang/Object;

    .line 729
    .line 730
    check-cast v4, Lr/q;

    .line 731
    .line 732
    invoke-virtual {v4}, Lr/q;->a()V

    .line 733
    .line 734
    .line 735
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->A0:[I

    .line 736
    .line 737
    aget v5, v4, v3

    .line 738
    .line 739
    aget v6, v4, v2

    .line 740
    .line 741
    invoke-virtual {v0, v4}, Landroidx/recyclerview/widget/RecyclerView;->C([I)V

    .line 742
    .line 743
    .line 744
    aget v8, v4, v3

    .line 745
    .line 746
    if-ne v8, v5, :cond_25

    .line 747
    .line 748
    aget v4, v4, v2

    .line 749
    .line 750
    if-eq v4, v6, :cond_24

    .line 751
    .line 752
    goto :goto_11

    .line 753
    :cond_24
    move v2, v3

    .line 754
    goto :goto_12

    .line 755
    :cond_25
    :goto_11
    const/4 v2, 0x1

    .line 756
    :goto_12
    if-eqz v2, :cond_26

    .line 757
    .line 758
    invoke-virtual {v0, v3, v3}, Landroidx/recyclerview/widget/RecyclerView;->t(II)V

    .line 759
    .line 760
    .line 761
    :cond_26
    iget-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->o0:Z

    .line 762
    .line 763
    const-wide/16 v4, -0x1

    .line 764
    .line 765
    const/4 v6, -0x1

    .line 766
    if-eqz v2, :cond_38

    .line 767
    .line 768
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 769
    .line 770
    if-eqz v2, :cond_38

    .line 771
    .line 772
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 773
    .line 774
    .line 775
    move-result v2

    .line 776
    if-eqz v2, :cond_38

    .line 777
    .line 778
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    .line 779
    .line 780
    .line 781
    move-result v2

    .line 782
    const/high16 v8, 0x60000

    .line 783
    .line 784
    if-eq v2, v8, :cond_38

    .line 785
    .line 786
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getDescendantFocusability()I

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    const/high16 v8, 0x20000

    .line 791
    .line 792
    if-ne v2, v8, :cond_27

    .line 793
    .line 794
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 795
    .line 796
    .line 797
    move-result v2

    .line 798
    if-eqz v2, :cond_27

    .line 799
    .line 800
    goto/16 :goto_1c

    .line 801
    .line 802
    :cond_27
    invoke-virtual {v0}, Landroid/view/View;->isFocused()Z

    .line 803
    .line 804
    .line 805
    move-result v2

    .line 806
    if-nez v2, :cond_28

    .line 807
    .line 808
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 809
    .line 810
    .line 811
    move-result-object v2

    .line 812
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 813
    .line 814
    iget-object v8, v8, LB0/G0;->t:Ljava/lang/Object;

    .line 815
    .line 816
    check-cast v8, Ljava/util/ArrayList;

    .line 817
    .line 818
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 819
    .line 820
    .line 821
    move-result v2

    .line 822
    if-nez v2, :cond_28

    .line 823
    .line 824
    goto/16 :goto_1c

    .line 825
    .line 826
    :cond_28
    iget-wide v8, v1, Ld2/S;->m:J

    .line 827
    .line 828
    cmp-long v2, v8, v4

    .line 829
    .line 830
    if-eqz v2, :cond_2c

    .line 831
    .line 832
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 833
    .line 834
    iget-boolean v2, v2, Ld2/z;->b:Z

    .line 835
    .line 836
    if-eqz v2, :cond_2c

    .line 837
    .line 838
    if-nez v2, :cond_29

    .line 839
    .line 840
    goto :goto_15

    .line 841
    :cond_29
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 842
    .line 843
    invoke-virtual {v2}, LB0/G0;->G()I

    .line 844
    .line 845
    .line 846
    move-result v2

    .line 847
    move v10, v3

    .line 848
    move-object v11, v7

    .line 849
    :goto_13
    if-ge v10, v2, :cond_2d

    .line 850
    .line 851
    iget-object v12, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 852
    .line 853
    invoke-virtual {v12, v10}, LB0/G0;->F(I)Landroid/view/View;

    .line 854
    .line 855
    .line 856
    move-result-object v12

    .line 857
    invoke-static {v12}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 858
    .line 859
    .line 860
    move-result-object v12

    .line 861
    if-eqz v12, :cond_2b

    .line 862
    .line 863
    invoke-virtual {v12}, Ld2/V;->h()Z

    .line 864
    .line 865
    .line 866
    move-result v13

    .line 867
    if-nez v13, :cond_2b

    .line 868
    .line 869
    iget-wide v13, v12, Ld2/V;->e:J

    .line 870
    .line 871
    cmp-long v13, v13, v8

    .line 872
    .line 873
    if-nez v13, :cond_2b

    .line 874
    .line 875
    iget-object v11, v12, Ld2/V;->a:Landroid/view/View;

    .line 876
    .line 877
    iget-object v13, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 878
    .line 879
    iget-object v13, v13, LB0/G0;->t:Ljava/lang/Object;

    .line 880
    .line 881
    check-cast v13, Ljava/util/ArrayList;

    .line 882
    .line 883
    invoke-virtual {v13, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 884
    .line 885
    .line 886
    move-result v11

    .line 887
    if-eqz v11, :cond_2a

    .line 888
    .line 889
    move-object v11, v12

    .line 890
    goto :goto_14

    .line 891
    :cond_2a
    move-object v11, v12

    .line 892
    goto :goto_16

    .line 893
    :cond_2b
    :goto_14
    add-int/lit8 v10, v10, 0x1

    .line 894
    .line 895
    goto :goto_13

    .line 896
    :cond_2c
    :goto_15
    move-object v11, v7

    .line 897
    :cond_2d
    :goto_16
    if-eqz v11, :cond_2f

    .line 898
    .line 899
    iget-object v2, v11, Ld2/V;->a:Landroid/view/View;

    .line 900
    .line 901
    iget-object v8, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 902
    .line 903
    iget-object v8, v8, LB0/G0;->t:Ljava/lang/Object;

    .line 904
    .line 905
    check-cast v8, Ljava/util/ArrayList;

    .line 906
    .line 907
    invoke-virtual {v8, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 908
    .line 909
    .line 910
    move-result v8

    .line 911
    if-nez v8, :cond_2f

    .line 912
    .line 913
    invoke-virtual {v2}, Landroid/view/View;->hasFocusable()Z

    .line 914
    .line 915
    .line 916
    move-result v8

    .line 917
    if-nez v8, :cond_2e

    .line 918
    .line 919
    goto :goto_17

    .line 920
    :cond_2e
    move-object v7, v2

    .line 921
    goto :goto_1b

    .line 922
    :cond_2f
    :goto_17
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 923
    .line 924
    invoke-virtual {v2}, LB0/G0;->v()I

    .line 925
    .line 926
    .line 927
    move-result v2

    .line 928
    if-lez v2, :cond_36

    .line 929
    .line 930
    iget v2, v1, Ld2/S;->l:I

    .line 931
    .line 932
    if-eq v2, v6, :cond_30

    .line 933
    .line 934
    move v3, v2

    .line 935
    :cond_30
    invoke-virtual {v1}, Ld2/S;->b()I

    .line 936
    .line 937
    .line 938
    move-result v2

    .line 939
    move v8, v3

    .line 940
    :goto_18
    if-ge v8, v2, :cond_33

    .line 941
    .line 942
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->E(I)Ld2/V;

    .line 943
    .line 944
    .line 945
    move-result-object v9

    .line 946
    if-nez v9, :cond_31

    .line 947
    .line 948
    goto :goto_19

    .line 949
    :cond_31
    iget-object v9, v9, Ld2/V;->a:Landroid/view/View;

    .line 950
    .line 951
    invoke-virtual {v9}, Landroid/view/View;->hasFocusable()Z

    .line 952
    .line 953
    .line 954
    move-result v10

    .line 955
    if-eqz v10, :cond_32

    .line 956
    .line 957
    move-object v7, v9

    .line 958
    goto :goto_1b

    .line 959
    :cond_32
    add-int/lit8 v8, v8, 0x1

    .line 960
    .line 961
    goto :goto_18

    .line 962
    :cond_33
    :goto_19
    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    .line 963
    .line 964
    .line 965
    move-result v2

    .line 966
    const/16 v17, 0x1

    .line 967
    .line 968
    add-int/lit8 v2, v2, -0x1

    .line 969
    .line 970
    :goto_1a
    if-ltz v2, :cond_36

    .line 971
    .line 972
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->E(I)Ld2/V;

    .line 973
    .line 974
    .line 975
    move-result-object v3

    .line 976
    if-nez v3, :cond_34

    .line 977
    .line 978
    goto :goto_1b

    .line 979
    :cond_34
    iget-object v3, v3, Ld2/V;->a:Landroid/view/View;

    .line 980
    .line 981
    invoke-virtual {v3}, Landroid/view/View;->hasFocusable()Z

    .line 982
    .line 983
    .line 984
    move-result v8

    .line 985
    if-eqz v8, :cond_35

    .line 986
    .line 987
    move-object v7, v3

    .line 988
    goto :goto_1b

    .line 989
    :cond_35
    add-int/lit8 v2, v2, -0x1

    .line 990
    .line 991
    goto :goto_1a

    .line 992
    :cond_36
    :goto_1b
    if-eqz v7, :cond_38

    .line 993
    .line 994
    iget v2, v1, Ld2/S;->n:I

    .line 995
    .line 996
    int-to-long v8, v2

    .line 997
    cmp-long v3, v8, v4

    .line 998
    .line 999
    if-eqz v3, :cond_37

    .line 1000
    .line 1001
    invoke-virtual {v7, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 1002
    .line 1003
    .line 1004
    move-result-object v2

    .line 1005
    if-eqz v2, :cond_37

    .line 1006
    .line 1007
    invoke-virtual {v2}, Landroid/view/View;->isFocusable()Z

    .line 1008
    .line 1009
    .line 1010
    move-result v3

    .line 1011
    if-eqz v3, :cond_37

    .line 1012
    .line 1013
    move-object v7, v2

    .line 1014
    :cond_37
    invoke-virtual {v7}, Landroid/view/View;->requestFocus()Z

    .line 1015
    .line 1016
    .line 1017
    :cond_38
    :goto_1c
    iput-wide v4, v1, Ld2/S;->m:J

    .line 1018
    .line 1019
    iput v6, v1, Ld2/S;->l:I

    .line 1020
    .line 1021
    iput v6, v1, Ld2/S;->n:I

    .line 1022
    .line 1023
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 5

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->Q:I

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 9
    .line 10
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/View;->isLayoutRequested()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    move v2, v1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v2, v0

    .line 23
    :goto_0
    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 24
    .line 25
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 26
    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    iput-boolean v1, v2, Ld2/G;->g:Z

    .line 30
    .line 31
    invoke-virtual {v2, p0}, Ld2/G;->Q(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->y0:Z

    .line 35
    .line 36
    sget-object v0, Ld2/m;->u:Ljava/lang/ThreadLocal;

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, Ld2/m;

    .line 43
    .line 44
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ld2/m;

    .line 45
    .line 46
    if-nez v1, :cond_3

    .line 47
    .line 48
    new-instance v1, Ld2/m;

    .line 49
    .line 50
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 51
    .line 52
    .line 53
    new-instance v2, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object v2, v1, Ld2/m;->q:Ljava/util/ArrayList;

    .line 59
    .line 60
    new-instance v2, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    iput-object v2, v1, Ld2/m;->t:Ljava/util/ArrayList;

    .line 66
    .line 67
    iput-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ld2/m;

    .line 68
    .line 69
    sget-object v1, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 76
    .line 77
    .line 78
    move-result v2

    .line 79
    if-nez v2, :cond_2

    .line 80
    .line 81
    if-eqz v1, :cond_2

    .line 82
    .line 83
    invoke-virtual {v1}, Landroid/view/Display;->getRefreshRate()F

    .line 84
    .line 85
    .line 86
    move-result v1

    .line 87
    const/high16 v2, 0x41f00000    # 30.0f

    .line 88
    .line 89
    cmpl-float v2, v1, v2

    .line 90
    .line 91
    if-ltz v2, :cond_2

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    const/high16 v1, 0x42700000    # 60.0f

    .line 95
    .line 96
    :goto_1
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ld2/m;

    .line 97
    .line 98
    const v3, 0x4e6e6b28    # 1.0E9f

    .line 99
    .line 100
    .line 101
    div-float/2addr v3, v1

    .line 102
    float-to-long v3, v3

    .line 103
    iput-wide v3, v2, Ld2/m;->s:J

    .line 104
    .line 105
    invoke-virtual {v0, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ld2/m;

    .line 109
    .line 110
    iget-object v0, v0, Ld2/m;->q:Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, Landroid/view/ViewGroup;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Ld2/D;->e()V

    .line 9
    .line 10
    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 13
    .line 14
    .line 15
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 16
    .line 17
    iget-object v2, v1, Ld2/U;->w:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 20
    .line 21
    .line 22
    iget-object v1, v1, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 25
    .line 26
    .line 27
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    iget-object v1, v1, Ld2/G;->e:Ld2/t;

    .line 32
    .line 33
    if-eqz v1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1}, Ld2/t;->i()V

    .line 36
    .line 37
    .line 38
    :cond_1
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 39
    .line 40
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 41
    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    iput-boolean v0, v1, Ld2/G;->g:Z

    .line 45
    .line 46
    invoke-virtual {v1, p0}, Ld2/G;->R(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 47
    .line 48
    .line 49
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->F0:Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 52
    .line 53
    .line 54
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G0:LA1/b;

    .line 55
    .line 56
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 57
    .line 58
    .line 59
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->v:LZ/m;

    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    :goto_0
    sget-object v0, Ld2/g0;->d:Lb1/d;

    .line 65
    .line 66
    invoke-virtual {v0}, Lb1/d;->a()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ld2/m;

    .line 74
    .line 75
    if-eqz v0, :cond_4

    .line 76
    .line 77
    iget-object v0, v0, Ld2/m;->q:Ljava/util/ArrayList;

    .line 78
    .line 79
    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    const/4 v0, 0x0

    .line 83
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ld2/m;

    .line 84
    .line 85
    :cond_4
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 3

    .line 1
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Ld2/E;

    .line 18
    .line 19
    invoke-virtual {v2, p0}, Ld2/E;->a(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 20
    .line 21
    .line 22
    add-int/lit8 v1, v1, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void
.end method

.method public final onGenericMotionEvent(Landroid/view/MotionEvent;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_3

    .line 7
    .line 8
    :cond_0
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    goto/16 :goto_3

    .line 13
    .line 14
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/16 v2, 0x8

    .line 19
    .line 20
    if-ne v0, v2, :cond_8

    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    and-int/lit8 v0, v0, 0x2

    .line 27
    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v0, :cond_4

    .line 30
    .line 31
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 32
    .line 33
    invoke-virtual {v0}, Ld2/G;->e()Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const/16 v0, 0x9

    .line 40
    .line 41
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    neg-float v0, v0

    .line 46
    goto :goto_0

    .line 47
    :cond_2
    move v0, v2

    .line 48
    :goto_0
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 49
    .line 50
    invoke-virtual {v3}, Ld2/G;->d()Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_3

    .line 55
    .line 56
    const/16 v3, 0xa

    .line 57
    .line 58
    invoke-virtual {p1, v3}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    goto :goto_2

    .line 63
    :cond_3
    :goto_1
    move v3, v2

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getSource()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/high16 v3, 0x400000

    .line 70
    .line 71
    and-int/2addr v0, v3

    .line 72
    if-eqz v0, :cond_6

    .line 73
    .line 74
    const/16 v0, 0x1a

    .line 75
    .line 76
    invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getAxisValue(I)F

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 81
    .line 82
    invoke-virtual {v3}, Ld2/G;->e()Z

    .line 83
    .line 84
    .line 85
    move-result v3

    .line 86
    if-eqz v3, :cond_5

    .line 87
    .line 88
    neg-float v0, v0

    .line 89
    goto :goto_1

    .line 90
    :cond_5
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 91
    .line 92
    invoke-virtual {v3}, Ld2/G;->d()Z

    .line 93
    .line 94
    .line 95
    move-result v3

    .line 96
    if-eqz v3, :cond_6

    .line 97
    .line 98
    move v3, v0

    .line 99
    move v0, v2

    .line 100
    goto :goto_2

    .line 101
    :cond_6
    move v0, v2

    .line 102
    move v3, v0

    .line 103
    :goto_2
    cmpl-float v4, v0, v2

    .line 104
    .line 105
    if-nez v4, :cond_7

    .line 106
    .line 107
    cmpl-float v2, v3, v2

    .line 108
    .line 109
    if-eqz v2, :cond_8

    .line 110
    .line 111
    :cond_7
    iget v2, p0, Landroidx/recyclerview/widget/RecyclerView;->m0:F

    .line 112
    .line 113
    mul-float/2addr v3, v2

    .line 114
    float-to-int v2, v3

    .line 115
    iget v3, p0, Landroidx/recyclerview/widget/RecyclerView;->n0:F

    .line 116
    .line 117
    mul-float/2addr v0, v3

    .line 118
    float-to-int v0, v0

    .line 119
    invoke-virtual {p0, v2, v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->W(IILandroid/view/MotionEvent;)Z

    .line 120
    .line 121
    .line 122
    :cond_8
    :goto_3
    return v1
.end method

.method public final onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 8

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_2

    .line 7
    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->E:Ld2/k;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->B(Landroid/view/MotionEvent;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->V()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 22
    .line 23
    .line 24
    return v2

    .line 25
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 26
    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    goto/16 :goto_2

    .line 30
    .line 31
    :cond_2
    invoke-virtual {v0}, Ld2/G;->d()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 36
    .line 37
    invoke-virtual {v3}, Ld2/G;->e()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 42
    .line 43
    if-nez v4, :cond_3

    .line 44
    .line 45
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 50
    .line 51
    :cond_3
    iget-object v4, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 52
    .line 53
    invoke-virtual {v4, p1}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 57
    .line 58
    .line 59
    move-result v4

    .line 60
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 61
    .line 62
    .line 63
    move-result v5

    .line 64
    const/4 v6, 0x2

    .line 65
    const/high16 v7, 0x3f000000    # 0.5f

    .line 66
    .line 67
    if-eqz v4, :cond_c

    .line 68
    .line 69
    if-eq v4, v2, :cond_b

    .line 70
    .line 71
    if-eq v4, v6, :cond_7

    .line 72
    .line 73
    const/4 v0, 0x3

    .line 74
    if-eq v4, v0, :cond_6

    .line 75
    .line 76
    const/4 v0, 0x5

    .line 77
    if-eq v4, v0, :cond_5

    .line 78
    .line 79
    const/4 v0, 0x6

    .line 80
    if-eq v4, v0, :cond_4

    .line 81
    .line 82
    goto/16 :goto_1

    .line 83
    .line 84
    :cond_4
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->R(Landroid/view/MotionEvent;)V

    .line 85
    .line 86
    .line 87
    goto/16 :goto_1

    .line 88
    .line 89
    :cond_5
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 94
    .line 95
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getX(I)F

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    add-float/2addr v0, v7

    .line 100
    float-to-int v0, v0

    .line 101
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 102
    .line 103
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:I

    .line 104
    .line 105
    invoke-virtual {p1, v5}, Landroid/view/MotionEvent;->getY(I)F

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    add-float/2addr p1, v7

    .line 110
    float-to-int p1, p1

    .line 111
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 112
    .line 113
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:I

    .line 114
    .line 115
    goto/16 :goto_1

    .line 116
    .line 117
    :cond_6
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->V()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 121
    .line 122
    .line 123
    goto/16 :goto_1

    .line 124
    .line 125
    :cond_7
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 126
    .line 127
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-gez v4, :cond_8

    .line 132
    .line 133
    new-instance p1, Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v0, "Error processing scroll; pointer index for id "

    .line 136
    .line 137
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 141
    .line 142
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    const-string v0, " not found. Did any MotionEvents get skipped?"

    .line 146
    .line 147
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    const-string v0, "RecyclerView"

    .line 155
    .line 156
    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    .line 158
    .line 159
    return v1

    .line 160
    :cond_8
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getX(I)F

    .line 161
    .line 162
    .line 163
    move-result v5

    .line 164
    add-float/2addr v5, v7

    .line 165
    float-to-int v5, v5

    .line 166
    invoke-virtual {p1, v4}, Landroid/view/MotionEvent;->getY(I)F

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    add-float/2addr p1, v7

    .line 171
    float-to-int p1, p1

    .line 172
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 173
    .line 174
    if-eq v4, v2, :cond_10

    .line 175
    .line 176
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:I

    .line 177
    .line 178
    sub-int v4, v5, v4

    .line 179
    .line 180
    iget v6, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:I

    .line 181
    .line 182
    sub-int v6, p1, v6

    .line 183
    .line 184
    if-eqz v0, :cond_9

    .line 185
    .line 186
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 191
    .line 192
    if-le v0, v4, :cond_9

    .line 193
    .line 194
    iput v5, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 195
    .line 196
    move v0, v2

    .line 197
    goto :goto_0

    .line 198
    :cond_9
    move v0, v1

    .line 199
    :goto_0
    if-eqz v3, :cond_a

    .line 200
    .line 201
    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    iget v4, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 206
    .line 207
    if-le v3, v4, :cond_a

    .line 208
    .line 209
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 210
    .line 211
    move v0, v2

    .line 212
    :cond_a
    if-eqz v0, :cond_10

    .line 213
    .line 214
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 215
    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_b
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 219
    .line 220
    invoke-virtual {p1}, Landroid/view/VelocityTracker;->clear()V

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, v1}, Landroidx/recyclerview/widget/RecyclerView;->c0(I)V

    .line 224
    .line 225
    .line 226
    goto :goto_1

    .line 227
    :cond_c
    iget-boolean v4, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 228
    .line 229
    if-eqz v4, :cond_d

    .line 230
    .line 231
    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 232
    .line 233
    :cond_d
    invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 234
    .line 235
    .line 236
    move-result v4

    .line 237
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 238
    .line 239
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    add-float/2addr v4, v7

    .line 244
    float-to-int v4, v4

    .line 245
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 246
    .line 247
    iput v4, p0, Landroidx/recyclerview/widget/RecyclerView;->e0:I

    .line 248
    .line 249
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 250
    .line 251
    .line 252
    move-result p1

    .line 253
    add-float/2addr p1, v7

    .line 254
    float-to-int p1, p1

    .line 255
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 256
    .line 257
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->f0:I

    .line 258
    .line 259
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 260
    .line 261
    if-ne p1, v6, :cond_e

    .line 262
    .line 263
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-interface {p1, v2}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->c0(I)V

    .line 274
    .line 275
    .line 276
    :cond_e
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 277
    .line 278
    aput v1, p1, v2

    .line 279
    .line 280
    aput v1, p1, v1

    .line 281
    .line 282
    if-eqz v3, :cond_f

    .line 283
    .line 284
    or-int/lit8 v0, v0, 0x2

    .line 285
    .line 286
    :cond_f
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 287
    .line 288
    .line 289
    move-result-object p1

    .line 290
    invoke-virtual {p1, v0, v1}, Lw1/j;->g(II)Z

    .line 291
    .line 292
    .line 293
    :cond_10
    :goto_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 294
    .line 295
    if-ne p1, v2, :cond_11

    .line 296
    .line 297
    return v2

    .line 298
    :cond_11
    :goto_2
    return v1
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    sget p1, Lr1/g;->a:I

    .line 2
    .line 3
    const-string p1, "RV OnLayout"

    .line 4
    .line 5
    invoke-static {p1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->o()V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/Trace;->endSection()V

    .line 12
    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 16
    .line 17
    return-void
.end method

.method public final onMeasure(II)V
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    invoke-virtual {v0}, Ld2/G;->L()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 14
    .line 15
    if-eqz v0, :cond_5

    .line 16
    .line 17
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 26
    .line 27
    iget-object v3, v3, Ld2/G;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 28
    .line 29
    invoke-virtual {v3, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    .line 30
    .line 31
    .line 32
    const/high16 v3, 0x40000000    # 2.0f

    .line 33
    .line 34
    if-ne v0, v3, :cond_1

    .line 35
    .line 36
    if-ne v2, v3, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 40
    .line 41
    if-nez v0, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    iget v0, v1, Ld2/S;->d:I

    .line 45
    .line 46
    const/4 v2, 0x1

    .line 47
    if-ne v0, v2, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->p()V

    .line 50
    .line 51
    .line 52
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 53
    .line 54
    invoke-virtual {v0, p1, p2}, Ld2/G;->q0(II)V

    .line 55
    .line 56
    .line 57
    iput-boolean v2, v1, Ld2/S;->i:Z

    .line 58
    .line 59
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    .line 60
    .line 61
    .line 62
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 63
    .line 64
    invoke-virtual {v0, p1, p2}, Ld2/G;->s0(II)V

    .line 65
    .line 66
    .line 67
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 68
    .line 69
    invoke-virtual {v0}, Ld2/G;->v0()Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 76
    .line 77
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    invoke-static {v4, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 82
    .line 83
    .line 84
    move-result v4

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    invoke-static {v5, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    invoke-virtual {v0, v4, v3}, Ld2/G;->q0(II)V

    .line 94
    .line 95
    .line 96
    iput-boolean v2, v1, Ld2/S;->i:Z

    .line 97
    .line 98
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->q()V

    .line 99
    .line 100
    .line 101
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 102
    .line 103
    invoke-virtual {v0, p1, p2}, Ld2/G;->s0(II)V

    .line 104
    .line 105
    .line 106
    :cond_4
    :goto_0
    return-void

    .line 107
    :cond_5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Z

    .line 108
    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 112
    .line 113
    iget-object v0, v0, Ld2/G;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 114
    .line 115
    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    iget-boolean v0, v1, Ld2/S;->k:Z

    .line 120
    .line 121
    if-eqz v0, :cond_7

    .line 122
    .line 123
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 132
    .line 133
    .line 134
    return-void

    .line 135
    :cond_7
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 136
    .line 137
    const/4 v2, 0x0

    .line 138
    if-eqz v0, :cond_8

    .line 139
    .line 140
    invoke-virtual {v0}, Ld2/z;->a()I

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    iput v0, v1, Ld2/S;->e:I

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_8
    iput v2, v1, Ld2/S;->e:I

    .line 148
    .line 149
    :goto_1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->a0()V

    .line 150
    .line 151
    .line 152
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 153
    .line 154
    iget-object v0, v0, Ld2/G;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 155
    .line 156
    invoke-virtual {v0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->n(II)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0, v2}, Landroidx/recyclerview/widget/RecyclerView;->b0(Z)V

    .line 160
    .line 161
    .line 162
    iput-boolean v2, v1, Ld2/S;->g:Z

    .line 163
    .line 164
    return-void
.end method

.method public final onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->onRequestFocusInDescendants(ILandroid/graphics/Rect;)Z

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    return p1
.end method

.method public final onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .line 1
    instance-of v0, p1, Ld2/O;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 6
    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    check-cast p1, Ld2/O;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Ld2/O;

    .line 12
    .line 13
    iget-object p1, p1, LC1/c;->q:Landroid/os/Parcelable;

    .line 14
    .line 15
    invoke-super {p0, p1}, Landroid/view/View;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 19
    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Ld2/O;

    .line 23
    .line 24
    iget-object v0, v0, Ld2/O;->s:Landroid/os/Parcelable;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    invoke-virtual {p1, v0}, Ld2/G;->d0(Landroid/os/Parcelable;)V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-void
.end method

.method public final onSaveInstanceState()Landroid/os/Parcelable;
    .locals 2

    .line 1
    new-instance v0, Ld2/O;

    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onSaveInstanceState()Landroid/os/Parcelable;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, LC1/c;-><init>(Landroid/os/Parcelable;)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Ld2/O;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    iget-object v1, v1, Ld2/O;->s:Landroid/os/Parcelable;

    .line 15
    .line 16
    iput-object v1, v0, Ld2/O;->s:Landroid/os/Parcelable;

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 20
    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v1}, Ld2/G;->e0()Landroid/os/Parcelable;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, v0, Ld2/O;->s:Landroid/os/Parcelable;

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    iput-object v1, v0, Ld2/O;->s:Landroid/os/Parcelable;

    .line 32
    .line 33
    return-object v0
.end method

.method public final onSizeChanged(IIII)V
    .locals 0

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 2
    .line 3
    .line 4
    if-ne p1, p3, :cond_1

    .line 5
    .line 6
    if-eq p2, p4, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    return-void

    .line 10
    :cond_1
    :goto_0
    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 16
    .line 17
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 18
    .line 19
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v6, p1

    .line 4
    .line 5
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 6
    .line 7
    const/4 v7, 0x0

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    iget-boolean v1, v0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 11
    .line 12
    if-eqz v1, :cond_1

    .line 13
    .line 14
    :cond_0
    :goto_0
    move v3, v7

    .line 15
    goto/16 :goto_24

    .line 16
    .line 17
    :cond_1
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Ld2/k;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    const/4 v3, 0x3

    .line 21
    const/4 v4, 0x2

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v8, 0x1

    .line 24
    if-nez v1, :cond_3

    .line 25
    .line 26
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    move v1, v7

    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_2
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->B(Landroid/view/MotionEvent;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    goto/16 :goto_4

    .line 40
    .line 41
    :cond_3
    iget v9, v1, Ld2/k;->b:I

    .line 42
    .line 43
    iget v10, v1, Ld2/k;->v:I

    .line 44
    .line 45
    if-nez v10, :cond_4

    .line 46
    .line 47
    goto/16 :goto_3

    .line 48
    .line 49
    :cond_4
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 50
    .line 51
    .line 52
    move-result v10

    .line 53
    if-nez v10, :cond_8

    .line 54
    .line 55
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 56
    .line 57
    .line 58
    move-result v9

    .line 59
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 60
    .line 61
    .line 62
    move-result v10

    .line 63
    invoke-virtual {v1, v9, v10}, Ld2/k;->d(FF)Z

    .line 64
    .line 65
    .line 66
    move-result v9

    .line 67
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 68
    .line 69
    .line 70
    move-result v10

    .line 71
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 72
    .line 73
    .line 74
    move-result v11

    .line 75
    invoke-virtual {v1, v10, v11}, Ld2/k;->c(FF)Z

    .line 76
    .line 77
    .line 78
    move-result v10

    .line 79
    if-nez v9, :cond_5

    .line 80
    .line 81
    if-eqz v10, :cond_f

    .line 82
    .line 83
    :cond_5
    if-eqz v10, :cond_6

    .line 84
    .line 85
    iput v8, v1, Ld2/k;->w:I

    .line 86
    .line 87
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 88
    .line 89
    .line 90
    move-result v9

    .line 91
    float-to-int v9, v9

    .line 92
    int-to-float v9, v9

    .line 93
    iput v9, v1, Ld2/k;->p:F

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_6
    if-eqz v9, :cond_7

    .line 97
    .line 98
    iput v4, v1, Ld2/k;->w:I

    .line 99
    .line 100
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    float-to-int v9, v9

    .line 105
    int-to-float v9, v9

    .line 106
    iput v9, v1, Ld2/k;->m:F

    .line 107
    .line 108
    :cond_7
    :goto_1
    invoke-virtual {v1, v4}, Ld2/k;->f(I)V

    .line 109
    .line 110
    .line 111
    goto/16 :goto_3

    .line 112
    .line 113
    :cond_8
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 114
    .line 115
    .line 116
    move-result v10

    .line 117
    if-ne v10, v8, :cond_9

    .line 118
    .line 119
    iget v10, v1, Ld2/k;->v:I

    .line 120
    .line 121
    if-ne v10, v4, :cond_9

    .line 122
    .line 123
    iput v5, v1, Ld2/k;->m:F

    .line 124
    .line 125
    iput v5, v1, Ld2/k;->p:F

    .line 126
    .line 127
    invoke-virtual {v1, v8}, Ld2/k;->f(I)V

    .line 128
    .line 129
    .line 130
    iput v7, v1, Ld2/k;->w:I

    .line 131
    .line 132
    goto/16 :goto_3

    .line 133
    .line 134
    :cond_9
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 135
    .line 136
    .line 137
    move-result v10

    .line 138
    if-ne v10, v4, :cond_f

    .line 139
    .line 140
    iget v10, v1, Ld2/k;->v:I

    .line 141
    .line 142
    if-ne v10, v4, :cond_f

    .line 143
    .line 144
    invoke-virtual {v1}, Ld2/k;->g()V

    .line 145
    .line 146
    .line 147
    iget v10, v1, Ld2/k;->w:I

    .line 148
    .line 149
    const/high16 v11, 0x40000000    # 2.0f

    .line 150
    .line 151
    if-ne v10, v8, :cond_c

    .line 152
    .line 153
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 154
    .line 155
    .line 156
    move-result v10

    .line 157
    iget-object v14, v1, Ld2/k;->y:[I

    .line 158
    .line 159
    aput v9, v14, v7

    .line 160
    .line 161
    iget v12, v1, Ld2/k;->q:I

    .line 162
    .line 163
    sub-int/2addr v12, v9

    .line 164
    aput v12, v14, v8

    .line 165
    .line 166
    int-to-float v13, v9

    .line 167
    int-to-float v12, v12

    .line 168
    invoke-static {v12, v10}, Ljava/lang/Math;->min(FF)F

    .line 169
    .line 170
    .line 171
    move-result v10

    .line 172
    invoke-static {v13, v10}, Ljava/lang/Math;->max(FF)F

    .line 173
    .line 174
    .line 175
    move-result v13

    .line 176
    iget v10, v1, Ld2/k;->o:I

    .line 177
    .line 178
    int-to-float v10, v10

    .line 179
    sub-float/2addr v10, v13

    .line 180
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 181
    .line 182
    .line 183
    move-result v10

    .line 184
    cmpg-float v10, v10, v11

    .line 185
    .line 186
    if-gez v10, :cond_a

    .line 187
    .line 188
    goto :goto_2

    .line 189
    :cond_a
    iget v12, v1, Ld2/k;->p:F

    .line 190
    .line 191
    iget-object v10, v1, Ld2/k;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 192
    .line 193
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollRange()I

    .line 194
    .line 195
    .line 196
    move-result v15

    .line 197
    iget-object v10, v1, Ld2/k;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 198
    .line 199
    invoke-virtual {v10}, Landroidx/recyclerview/widget/RecyclerView;->computeHorizontalScrollOffset()I

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    iget v10, v1, Ld2/k;->q:I

    .line 204
    .line 205
    move/from16 v17, v10

    .line 206
    .line 207
    invoke-static/range {v12 .. v17}, Ld2/k;->e(FF[IIII)I

    .line 208
    .line 209
    .line 210
    move-result v10

    .line 211
    if-eqz v10, :cond_b

    .line 212
    .line 213
    iget-object v12, v1, Ld2/k;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 214
    .line 215
    invoke-virtual {v12, v10, v7}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 216
    .line 217
    .line 218
    :cond_b
    iput v13, v1, Ld2/k;->p:F

    .line 219
    .line 220
    :cond_c
    :goto_2
    iget v10, v1, Ld2/k;->w:I

    .line 221
    .line 222
    if-ne v10, v4, :cond_f

    .line 223
    .line 224
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 225
    .line 226
    .line 227
    move-result v10

    .line 228
    iget-object v14, v1, Ld2/k;->x:[I

    .line 229
    .line 230
    aput v9, v14, v7

    .line 231
    .line 232
    iget v12, v1, Ld2/k;->r:I

    .line 233
    .line 234
    sub-int/2addr v12, v9

    .line 235
    aput v12, v14, v8

    .line 236
    .line 237
    int-to-float v9, v9

    .line 238
    int-to-float v12, v12

    .line 239
    invoke-static {v12, v10}, Ljava/lang/Math;->min(FF)F

    .line 240
    .line 241
    .line 242
    move-result v10

    .line 243
    invoke-static {v9, v10}, Ljava/lang/Math;->max(FF)F

    .line 244
    .line 245
    .line 246
    move-result v13

    .line 247
    iget v9, v1, Ld2/k;->l:I

    .line 248
    .line 249
    int-to-float v9, v9

    .line 250
    sub-float/2addr v9, v13

    .line 251
    invoke-static {v9}, Ljava/lang/Math;->abs(F)F

    .line 252
    .line 253
    .line 254
    move-result v9

    .line 255
    cmpg-float v9, v9, v11

    .line 256
    .line 257
    if-gez v9, :cond_d

    .line 258
    .line 259
    goto :goto_3

    .line 260
    :cond_d
    iget v12, v1, Ld2/k;->m:F

    .line 261
    .line 262
    iget-object v9, v1, Ld2/k;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 263
    .line 264
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollRange()I

    .line 265
    .line 266
    .line 267
    move-result v15

    .line 268
    iget-object v9, v1, Ld2/k;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 269
    .line 270
    invoke-virtual {v9}, Landroidx/recyclerview/widget/RecyclerView;->computeVerticalScrollOffset()I

    .line 271
    .line 272
    .line 273
    move-result v16

    .line 274
    iget v9, v1, Ld2/k;->r:I

    .line 275
    .line 276
    move/from16 v17, v9

    .line 277
    .line 278
    invoke-static/range {v12 .. v17}, Ld2/k;->e(FF[IIII)I

    .line 279
    .line 280
    .line 281
    move-result v9

    .line 282
    if-eqz v9, :cond_e

    .line 283
    .line 284
    iget-object v10, v1, Ld2/k;->s:Landroidx/recyclerview/widget/RecyclerView;

    .line 285
    .line 286
    invoke-virtual {v10, v7, v9}, Landroidx/recyclerview/widget/RecyclerView;->scrollBy(II)V

    .line 287
    .line 288
    .line 289
    :cond_e
    iput v13, v1, Ld2/k;->m:F

    .line 290
    .line 291
    :cond_f
    :goto_3
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getAction()I

    .line 292
    .line 293
    .line 294
    move-result v1

    .line 295
    if-eq v1, v3, :cond_10

    .line 296
    .line 297
    if-ne v1, v8, :cond_11

    .line 298
    .line 299
    :cond_10
    iput-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->E:Ld2/k;

    .line 300
    .line 301
    :cond_11
    move v1, v8

    .line 302
    :goto_4
    if-eqz v1, :cond_12

    .line 303
    .line 304
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->V()V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 308
    .line 309
    .line 310
    return v8

    .line 311
    :cond_12
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 312
    .line 313
    if-nez v1, :cond_13

    .line 314
    .line 315
    goto/16 :goto_0

    .line 316
    .line 317
    :cond_13
    invoke-virtual {v1}, Ld2/G;->d()Z

    .line 318
    .line 319
    .line 320
    move-result v9

    .line 321
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 322
    .line 323
    invoke-virtual {v1}, Ld2/G;->e()Z

    .line 324
    .line 325
    .line 326
    move-result v10

    .line 327
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 328
    .line 329
    if-nez v1, :cond_14

    .line 330
    .line 331
    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    iput-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 336
    .line 337
    :cond_14
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 338
    .line 339
    .line 340
    move-result v1

    .line 341
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 342
    .line 343
    .line 344
    move-result v11

    .line 345
    iget-object v12, v0, Landroidx/recyclerview/widget/RecyclerView;->D0:[I

    .line 346
    .line 347
    if-nez v1, :cond_15

    .line 348
    .line 349
    aput v7, v12, v8

    .line 350
    .line 351
    aput v7, v12, v7

    .line 352
    .line 353
    :cond_15
    invoke-static {v6}, Landroid/view/MotionEvent;->obtain(Landroid/view/MotionEvent;)Landroid/view/MotionEvent;

    .line 354
    .line 355
    .line 356
    move-result-object v13

    .line 357
    aget v14, v12, v7

    .line 358
    .line 359
    int-to-float v14, v14

    .line 360
    aget v15, v12, v8

    .line 361
    .line 362
    int-to-float v15, v15

    .line 363
    invoke-virtual {v13, v14, v15}, Landroid/view/MotionEvent;->offsetLocation(FF)V

    .line 364
    .line 365
    .line 366
    const/high16 v14, 0x3f000000    # 0.5f

    .line 367
    .line 368
    if-eqz v1, :cond_53

    .line 369
    .line 370
    const-string v15, "RecyclerView"

    .line 371
    .line 372
    if-eq v1, v8, :cond_27

    .line 373
    .line 374
    if-eq v1, v4, :cond_19

    .line 375
    .line 376
    if-eq v1, v3, :cond_18

    .line 377
    .line 378
    const/4 v2, 0x5

    .line 379
    if-eq v1, v2, :cond_17

    .line 380
    .line 381
    const/4 v2, 0x6

    .line 382
    if-eq v1, v2, :cond_16

    .line 383
    .line 384
    goto/16 :goto_22

    .line 385
    .line 386
    :cond_16
    invoke-virtual/range {p0 .. p1}, Landroidx/recyclerview/widget/RecyclerView;->R(Landroid/view/MotionEvent;)V

    .line 387
    .line 388
    .line 389
    goto/16 :goto_22

    .line 390
    .line 391
    :cond_17
    invoke-virtual {v6, v11}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 396
    .line 397
    invoke-virtual {v6, v11}, Landroid/view/MotionEvent;->getX(I)F

    .line 398
    .line 399
    .line 400
    move-result v1

    .line 401
    add-float/2addr v1, v14

    .line 402
    float-to-int v1, v1

    .line 403
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 404
    .line 405
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:I

    .line 406
    .line 407
    invoke-virtual {v6, v11}, Landroid/view/MotionEvent;->getY(I)F

    .line 408
    .line 409
    .line 410
    move-result v1

    .line 411
    add-float/2addr v1, v14

    .line 412
    float-to-int v1, v1

    .line 413
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 414
    .line 415
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->f0:I

    .line 416
    .line 417
    goto/16 :goto_22

    .line 418
    .line 419
    :cond_18
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->V()V

    .line 420
    .line 421
    .line 422
    invoke-virtual {v0, v7}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 423
    .line 424
    .line 425
    goto/16 :goto_22

    .line 426
    .line 427
    :cond_19
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 428
    .line 429
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->findPointerIndex(I)I

    .line 430
    .line 431
    .line 432
    move-result v1

    .line 433
    if-gez v1, :cond_1a

    .line 434
    .line 435
    new-instance v1, Ljava/lang/StringBuilder;

    .line 436
    .line 437
    const-string v2, "Error processing scroll; pointer index for id "

    .line 438
    .line 439
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 440
    .line 441
    .line 442
    iget v2, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 443
    .line 444
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    const-string v2, " not found. Did any MotionEvents get skipped?"

    .line 448
    .line 449
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v1

    .line 456
    invoke-static {v15, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 457
    .line 458
    .line 459
    return v7

    .line 460
    :cond_1a
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getX(I)F

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    add-float/2addr v2, v14

    .line 465
    float-to-int v11, v2

    .line 466
    invoke-virtual {v6, v1}, Landroid/view/MotionEvent;->getY(I)F

    .line 467
    .line 468
    .line 469
    move-result v1

    .line 470
    add-float/2addr v1, v14

    .line 471
    float-to-int v14, v1

    .line 472
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 473
    .line 474
    sub-int/2addr v1, v11

    .line 475
    iget v2, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 476
    .line 477
    sub-int/2addr v2, v14

    .line 478
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 479
    .line 480
    if-eq v3, v8, :cond_1f

    .line 481
    .line 482
    if-eqz v9, :cond_1c

    .line 483
    .line 484
    if-lez v1, :cond_1b

    .line 485
    .line 486
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 487
    .line 488
    sub-int/2addr v1, v3

    .line 489
    invoke-static {v7, v1}, Ljava/lang/Math;->max(II)I

    .line 490
    .line 491
    .line 492
    move-result v1

    .line 493
    goto :goto_5

    .line 494
    :cond_1b
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 495
    .line 496
    add-int/2addr v1, v3

    .line 497
    invoke-static {v7, v1}, Ljava/lang/Math;->min(II)I

    .line 498
    .line 499
    .line 500
    move-result v1

    .line 501
    :goto_5
    if-eqz v1, :cond_1c

    .line 502
    .line 503
    move v3, v8

    .line 504
    goto :goto_6

    .line 505
    :cond_1c
    move v3, v7

    .line 506
    :goto_6
    if-eqz v10, :cond_1e

    .line 507
    .line 508
    if-lez v2, :cond_1d

    .line 509
    .line 510
    iget v4, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 511
    .line 512
    sub-int/2addr v2, v4

    .line 513
    invoke-static {v7, v2}, Ljava/lang/Math;->max(II)I

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    goto :goto_7

    .line 518
    :cond_1d
    iget v4, v0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 519
    .line 520
    add-int/2addr v2, v4

    .line 521
    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    .line 522
    .line 523
    .line 524
    move-result v2

    .line 525
    :goto_7
    if-eqz v2, :cond_1e

    .line 526
    .line 527
    move v3, v8

    .line 528
    :cond_1e
    if-eqz v3, :cond_1f

    .line 529
    .line 530
    invoke-virtual {v0, v8}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 531
    .line 532
    .line 533
    :cond_1f
    move v15, v1

    .line 534
    move/from16 v16, v2

    .line 535
    .line 536
    iget v1, v0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 537
    .line 538
    if-ne v1, v8, :cond_55

    .line 539
    .line 540
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->E0:[I

    .line 541
    .line 542
    aput v7, v4, v7

    .line 543
    .line 544
    aput v7, v4, v8

    .line 545
    .line 546
    if-eqz v9, :cond_20

    .line 547
    .line 548
    move v1, v15

    .line 549
    goto :goto_8

    .line 550
    :cond_20
    move v1, v7

    .line 551
    :goto_8
    if-eqz v10, :cond_21

    .line 552
    .line 553
    move/from16 v2, v16

    .line 554
    .line 555
    goto :goto_9

    .line 556
    :cond_21
    move v2, v7

    .line 557
    :goto_9
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->C0:[I

    .line 558
    .line 559
    const/4 v3, 0x0

    .line 560
    invoke-virtual/range {v0 .. v5}, Landroidx/recyclerview/widget/RecyclerView;->r(III[I[I)Z

    .line 561
    .line 562
    .line 563
    move-result v1

    .line 564
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->C0:[I

    .line 565
    .line 566
    if-eqz v1, :cond_22

    .line 567
    .line 568
    aget v1, v4, v7

    .line 569
    .line 570
    sub-int/2addr v15, v1

    .line 571
    aget v1, v4, v8

    .line 572
    .line 573
    sub-int v16, v16, v1

    .line 574
    .line 575
    aget v1, v12, v7

    .line 576
    .line 577
    aget v3, v2, v7

    .line 578
    .line 579
    add-int/2addr v1, v3

    .line 580
    aput v1, v12, v7

    .line 581
    .line 582
    aget v1, v12, v8

    .line 583
    .line 584
    aget v3, v2, v8

    .line 585
    .line 586
    add-int/2addr v1, v3

    .line 587
    aput v1, v12, v8

    .line 588
    .line 589
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 590
    .line 591
    .line 592
    move-result-object v1

    .line 593
    invoke-interface {v1, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 594
    .line 595
    .line 596
    :cond_22
    move/from16 v1, v16

    .line 597
    .line 598
    aget v3, v2, v7

    .line 599
    .line 600
    sub-int/2addr v11, v3

    .line 601
    iput v11, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 602
    .line 603
    aget v2, v2, v8

    .line 604
    .line 605
    sub-int/2addr v14, v2

    .line 606
    iput v14, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 607
    .line 608
    if-eqz v9, :cond_23

    .line 609
    .line 610
    move v2, v15

    .line 611
    goto :goto_a

    .line 612
    :cond_23
    move v2, v7

    .line 613
    :goto_a
    if-eqz v10, :cond_24

    .line 614
    .line 615
    move v7, v1

    .line 616
    :cond_24
    invoke-virtual {v0, v2, v7, v6}, Landroidx/recyclerview/widget/RecyclerView;->W(IILandroid/view/MotionEvent;)Z

    .line 617
    .line 618
    .line 619
    move-result v2

    .line 620
    if-eqz v2, :cond_25

    .line 621
    .line 622
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 623
    .line 624
    .line 625
    move-result-object v2

    .line 626
    invoke-interface {v2, v8}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 627
    .line 628
    .line 629
    :cond_25
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->q0:Ld2/m;

    .line 630
    .line 631
    if-eqz v2, :cond_55

    .line 632
    .line 633
    if-nez v15, :cond_26

    .line 634
    .line 635
    if-eqz v1, :cond_55

    .line 636
    .line 637
    :cond_26
    invoke-virtual {v2, v0, v15, v1}, Ld2/m;->a(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 638
    .line 639
    .line 640
    goto/16 :goto_22

    .line 641
    .line 642
    :cond_27
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 643
    .line 644
    invoke-virtual {v1, v13}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 645
    .line 646
    .line 647
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 648
    .line 649
    const/16 v3, 0x3e8

    .line 650
    .line 651
    iget v6, v0, Landroidx/recyclerview/widget/RecyclerView;->l0:I

    .line 652
    .line 653
    int-to-float v11, v6

    .line 654
    invoke-virtual {v1, v3, v11}, Landroid/view/VelocityTracker;->computeCurrentVelocity(IF)V

    .line 655
    .line 656
    .line 657
    if-eqz v9, :cond_28

    .line 658
    .line 659
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 660
    .line 661
    iget v3, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 662
    .line 663
    invoke-virtual {v1, v3}, Landroid/view/VelocityTracker;->getXVelocity(I)F

    .line 664
    .line 665
    .line 666
    move-result v1

    .line 667
    neg-float v1, v1

    .line 668
    goto :goto_b

    .line 669
    :cond_28
    move v1, v5

    .line 670
    :goto_b
    if-eqz v10, :cond_29

    .line 671
    .line 672
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 673
    .line 674
    iget v9, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 675
    .line 676
    invoke-virtual {v3, v9}, Landroid/view/VelocityTracker;->getYVelocity(I)F

    .line 677
    .line 678
    .line 679
    move-result v3

    .line 680
    neg-float v3, v3

    .line 681
    goto :goto_c

    .line 682
    :cond_29
    move v3, v5

    .line 683
    :goto_c
    cmpl-float v9, v1, v5

    .line 684
    .line 685
    if-nez v9, :cond_2b

    .line 686
    .line 687
    cmpl-float v9, v3, v5

    .line 688
    .line 689
    if-eqz v9, :cond_2a

    .line 690
    .line 691
    goto :goto_d

    .line 692
    :cond_2a
    move v3, v7

    .line 693
    goto/16 :goto_20

    .line 694
    .line 695
    :cond_2b
    :goto_d
    float-to-int v1, v1

    .line 696
    float-to-int v3, v3

    .line 697
    iget-object v9, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 698
    .line 699
    if-nez v9, :cond_2c

    .line 700
    .line 701
    const-string v1, "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 702
    .line 703
    invoke-static {v15, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 704
    .line 705
    .line 706
    goto/16 :goto_1f

    .line 707
    .line 708
    :cond_2c
    iget-boolean v10, v0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 709
    .line 710
    if-eqz v10, :cond_2d

    .line 711
    .line 712
    goto/16 :goto_1f

    .line 713
    .line 714
    :cond_2d
    invoke-virtual {v9}, Ld2/G;->d()Z

    .line 715
    .line 716
    .line 717
    move-result v9

    .line 718
    iget-object v10, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 719
    .line 720
    invoke-virtual {v10}, Ld2/G;->e()Z

    .line 721
    .line 722
    .line 723
    move-result v10

    .line 724
    iget v11, v0, Landroidx/recyclerview/widget/RecyclerView;->k0:I

    .line 725
    .line 726
    if-eqz v9, :cond_2e

    .line 727
    .line 728
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 729
    .line 730
    .line 731
    move-result v12

    .line 732
    if-ge v12, v11, :cond_2f

    .line 733
    .line 734
    :cond_2e
    move v1, v7

    .line 735
    :cond_2f
    if-eqz v10, :cond_30

    .line 736
    .line 737
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 738
    .line 739
    .line 740
    move-result v12

    .line 741
    if-ge v12, v11, :cond_31

    .line 742
    .line 743
    :cond_30
    move v3, v7

    .line 744
    :cond_31
    if-nez v1, :cond_32

    .line 745
    .line 746
    if-nez v3, :cond_32

    .line 747
    .line 748
    goto/16 :goto_1f

    .line 749
    .line 750
    :cond_32
    int-to-float v11, v1

    .line 751
    int-to-float v12, v3

    .line 752
    invoke-virtual {v0, v11, v12}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedPreFling(FF)Z

    .line 753
    .line 754
    .line 755
    move-result v14

    .line 756
    if-nez v14, :cond_52

    .line 757
    .line 758
    if-nez v9, :cond_34

    .line 759
    .line 760
    if-eqz v10, :cond_33

    .line 761
    .line 762
    goto :goto_e

    .line 763
    :cond_33
    move v14, v7

    .line 764
    goto :goto_f

    .line 765
    :cond_34
    :goto_e
    move v14, v8

    .line 766
    :goto_f
    invoke-virtual {v0, v11, v12, v14}, Landroidx/recyclerview/widget/RecyclerView;->dispatchNestedFling(FFZ)Z

    .line 767
    .line 768
    .line 769
    iget-object v11, v0, Landroidx/recyclerview/widget/RecyclerView;->j0:Ld2/I;

    .line 770
    .line 771
    if-eqz v11, :cond_4f

    .line 772
    .line 773
    check-cast v11, Ld2/w;

    .line 774
    .line 775
    iget-object v12, v11, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 776
    .line 777
    invoke-virtual {v12}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Ld2/G;

    .line 778
    .line 779
    .line 780
    move-result-object v12

    .line 781
    if-nez v12, :cond_35

    .line 782
    .line 783
    goto/16 :goto_1d

    .line 784
    .line 785
    :cond_35
    iget-object v15, v11, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 786
    .line 787
    invoke-virtual {v15}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ld2/z;

    .line 788
    .line 789
    .line 790
    move-result-object v15

    .line 791
    if-nez v15, :cond_36

    .line 792
    .line 793
    goto/16 :goto_1d

    .line 794
    .line 795
    :cond_36
    iget-object v15, v11, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 796
    .line 797
    invoke-virtual {v15}, Landroidx/recyclerview/widget/RecyclerView;->getMinFlingVelocity()I

    .line 798
    .line 799
    .line 800
    move-result v15

    .line 801
    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    .line 802
    .line 803
    .line 804
    move-result v2

    .line 805
    if-gt v2, v15, :cond_37

    .line 806
    .line 807
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 808
    .line 809
    .line 810
    move-result v2

    .line 811
    if-le v2, v15, :cond_4f

    .line 812
    .line 813
    :cond_37
    instance-of v2, v12, Ld2/Q;

    .line 814
    .line 815
    if-nez v2, :cond_38

    .line 816
    .line 817
    goto/16 :goto_1d

    .line 818
    .line 819
    :cond_38
    if-nez v2, :cond_39

    .line 820
    .line 821
    move/from16 v17, v5

    .line 822
    .line 823
    const/4 v15, 0x0

    .line 824
    goto :goto_10

    .line 825
    :cond_39
    new-instance v15, Ld2/v;

    .line 826
    .line 827
    move/from16 v17, v5

    .line 828
    .line 829
    iget-object v5, v11, Ld2/w;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 830
    .line 831
    invoke-virtual {v5}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 832
    .line 833
    .line 834
    move-result-object v5

    .line 835
    invoke-direct {v15, v11, v5}, Ld2/v;-><init>(Ld2/w;Landroid/content/Context;)V

    .line 836
    .line 837
    .line 838
    :goto_10
    if-nez v15, :cond_3a

    .line 839
    .line 840
    goto/16 :goto_1d

    .line 841
    .line 842
    :cond_3a
    invoke-virtual {v12}, Ld2/G;->B()I

    .line 843
    .line 844
    .line 845
    move-result v5

    .line 846
    if-nez v5, :cond_3d

    .line 847
    .line 848
    :goto_11
    move/from16 v20, v8

    .line 849
    .line 850
    :cond_3b
    :goto_12
    const/4 v2, -0x1

    .line 851
    :cond_3c
    :goto_13
    const/4 v4, -0x1

    .line 852
    goto/16 :goto_1c

    .line 853
    .line 854
    :cond_3d
    invoke-virtual {v12}, Ld2/G;->e()Z

    .line 855
    .line 856
    .line 857
    move-result v18

    .line 858
    if-eqz v18, :cond_3e

    .line 859
    .line 860
    invoke-virtual {v11, v12}, Ld2/w;->e(Ld2/G;)LE1/g;

    .line 861
    .line 862
    .line 863
    move-result-object v11

    .line 864
    goto :goto_14

    .line 865
    :cond_3e
    invoke-virtual {v12}, Ld2/G;->d()Z

    .line 866
    .line 867
    .line 868
    move-result v18

    .line 869
    if-eqz v18, :cond_3f

    .line 870
    .line 871
    invoke-virtual {v11, v12}, Ld2/w;->d(Ld2/G;)LE1/g;

    .line 872
    .line 873
    .line 874
    move-result-object v11

    .line 875
    goto :goto_14

    .line 876
    :cond_3f
    const/4 v11, 0x0

    .line 877
    :goto_14
    if-nez v11, :cond_40

    .line 878
    .line 879
    goto :goto_11

    .line 880
    :cond_40
    invoke-virtual {v12}, Ld2/G;->v()I

    .line 881
    .line 882
    .line 883
    move-result v4

    .line 884
    const/high16 v19, -0x80000000

    .line 885
    .line 886
    const v20, 0x7fffffff

    .line 887
    .line 888
    .line 889
    move/from16 v21, v2

    .line 890
    .line 891
    move/from16 v7, v19

    .line 892
    .line 893
    move/from16 v2, v20

    .line 894
    .line 895
    const/16 v16, 0x0

    .line 896
    .line 897
    const/16 v19, 0x0

    .line 898
    .line 899
    move/from16 v20, v8

    .line 900
    .line 901
    const/4 v8, 0x0

    .line 902
    :goto_15
    if-ge v8, v4, :cond_44

    .line 903
    .line 904
    move/from16 v22, v4

    .line 905
    .line 906
    invoke-virtual {v12, v8}, Ld2/G;->u(I)Landroid/view/View;

    .line 907
    .line 908
    .line 909
    move-result-object v4

    .line 910
    if-nez v4, :cond_41

    .line 911
    .line 912
    move/from16 v23, v8

    .line 913
    .line 914
    goto :goto_16

    .line 915
    :cond_41
    move/from16 v23, v8

    .line 916
    .line 917
    invoke-static {v4, v11}, Ld2/w;->b(Landroid/view/View;LE1/g;)I

    .line 918
    .line 919
    .line 920
    move-result v8

    .line 921
    if-gtz v8, :cond_42

    .line 922
    .line 923
    if-le v8, v7, :cond_42

    .line 924
    .line 925
    move-object/from16 v19, v4

    .line 926
    .line 927
    move v7, v8

    .line 928
    :cond_42
    if-ltz v8, :cond_43

    .line 929
    .line 930
    if-ge v8, v2, :cond_43

    .line 931
    .line 932
    move-object/from16 v16, v4

    .line 933
    .line 934
    move v2, v8

    .line 935
    :cond_43
    :goto_16
    add-int/lit8 v8, v23, 0x1

    .line 936
    .line 937
    move/from16 v4, v22

    .line 938
    .line 939
    goto :goto_15

    .line 940
    :cond_44
    invoke-virtual {v12}, Ld2/G;->d()Z

    .line 941
    .line 942
    .line 943
    move-result v2

    .line 944
    if-eqz v2, :cond_46

    .line 945
    .line 946
    if-lez v1, :cond_45

    .line 947
    .line 948
    :goto_17
    move/from16 v2, v20

    .line 949
    .line 950
    goto :goto_18

    .line 951
    :cond_45
    const/4 v2, 0x0

    .line 952
    goto :goto_18

    .line 953
    :cond_46
    if-lez v3, :cond_45

    .line 954
    .line 955
    goto :goto_17

    .line 956
    :goto_18
    if-eqz v2, :cond_47

    .line 957
    .line 958
    if-eqz v16, :cond_47

    .line 959
    .line 960
    invoke-static/range {v16 .. v16}, Ld2/G;->H(Landroid/view/View;)I

    .line 961
    .line 962
    .line 963
    move-result v2

    .line 964
    goto :goto_13

    .line 965
    :cond_47
    if-nez v2, :cond_48

    .line 966
    .line 967
    if-eqz v19, :cond_48

    .line 968
    .line 969
    invoke-static/range {v19 .. v19}, Ld2/G;->H(Landroid/view/View;)I

    .line 970
    .line 971
    .line 972
    move-result v2

    .line 973
    goto :goto_13

    .line 974
    :cond_48
    if-eqz v2, :cond_49

    .line 975
    .line 976
    move-object/from16 v16, v19

    .line 977
    .line 978
    :cond_49
    if-nez v16, :cond_4a

    .line 979
    .line 980
    goto/16 :goto_12

    .line 981
    .line 982
    :cond_4a
    invoke-static/range {v16 .. v16}, Ld2/G;->H(Landroid/view/View;)I

    .line 983
    .line 984
    .line 985
    move-result v4

    .line 986
    invoke-virtual {v12}, Ld2/G;->B()I

    .line 987
    .line 988
    .line 989
    move-result v7

    .line 990
    if-eqz v21, :cond_4b

    .line 991
    .line 992
    move-object v8, v12

    .line 993
    check-cast v8, Ld2/Q;

    .line 994
    .line 995
    add-int/lit8 v7, v7, -0x1

    .line 996
    .line 997
    invoke-interface {v8, v7}, Ld2/Q;->a(I)Landroid/graphics/PointF;

    .line 998
    .line 999
    .line 1000
    move-result-object v7

    .line 1001
    if-eqz v7, :cond_4b

    .line 1002
    .line 1003
    iget v8, v7, Landroid/graphics/PointF;->x:F

    .line 1004
    .line 1005
    cmpg-float v8, v8, v17

    .line 1006
    .line 1007
    if-ltz v8, :cond_4c

    .line 1008
    .line 1009
    iget v7, v7, Landroid/graphics/PointF;->y:F

    .line 1010
    .line 1011
    cmpg-float v7, v7, v17

    .line 1012
    .line 1013
    if-gez v7, :cond_4b

    .line 1014
    .line 1015
    goto :goto_19

    .line 1016
    :cond_4b
    const/4 v7, 0x0

    .line 1017
    goto :goto_1a

    .line 1018
    :cond_4c
    :goto_19
    move/from16 v7, v20

    .line 1019
    .line 1020
    :goto_1a
    if-ne v7, v2, :cond_4d

    .line 1021
    .line 1022
    const/4 v2, -0x1

    .line 1023
    goto :goto_1b

    .line 1024
    :cond_4d
    move/from16 v2, v20

    .line 1025
    .line 1026
    :goto_1b
    add-int/2addr v2, v4

    .line 1027
    if-ltz v2, :cond_3b

    .line 1028
    .line 1029
    if-lt v2, v5, :cond_3c

    .line 1030
    .line 1031
    goto/16 :goto_12

    .line 1032
    .line 1033
    :goto_1c
    if-ne v2, v4, :cond_4e

    .line 1034
    .line 1035
    goto :goto_1e

    .line 1036
    :cond_4e
    iput v2, v15, Ld2/t;->a:I

    .line 1037
    .line 1038
    invoke-virtual {v12, v15}, Ld2/G;->y0(Ld2/t;)V

    .line 1039
    .line 1040
    .line 1041
    goto :goto_21

    .line 1042
    :cond_4f
    :goto_1d
    move/from16 v20, v8

    .line 1043
    .line 1044
    :goto_1e
    if-eqz v14, :cond_52

    .line 1045
    .line 1046
    if-eqz v10, :cond_50

    .line 1047
    .line 1048
    or-int/lit8 v9, v9, 0x2

    .line 1049
    .line 1050
    :cond_50
    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 1051
    .line 1052
    .line 1053
    move-result-object v2

    .line 1054
    move/from16 v4, v20

    .line 1055
    .line 1056
    invoke-virtual {v2, v9, v4}, Lw1/j;->g(II)Z

    .line 1057
    .line 1058
    .line 1059
    neg-int v2, v6

    .line 1060
    invoke-static {v1, v6}, Ljava/lang/Math;->min(II)I

    .line 1061
    .line 1062
    .line 1063
    move-result v1

    .line 1064
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 1065
    .line 1066
    .line 1067
    move-result v24

    .line 1068
    invoke-static {v3, v6}, Ljava/lang/Math;->min(II)I

    .line 1069
    .line 1070
    .line 1071
    move-result v1

    .line 1072
    invoke-static {v2, v1}, Ljava/lang/Math;->max(II)I

    .line 1073
    .line 1074
    .line 1075
    move-result v25

    .line 1076
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 1077
    .line 1078
    iget-object v2, v1, Ld2/U;->w:Landroidx/recyclerview/widget/RecyclerView;

    .line 1079
    .line 1080
    const/4 v3, 0x2

    .line 1081
    invoke-virtual {v2, v3}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 1082
    .line 1083
    .line 1084
    const/4 v3, 0x0

    .line 1085
    iput v3, v1, Ld2/U;->r:I

    .line 1086
    .line 1087
    iput v3, v1, Ld2/U;->q:I

    .line 1088
    .line 1089
    iget-object v3, v1, Ld2/U;->t:Landroid/view/animation/Interpolator;

    .line 1090
    .line 1091
    sget-object v4, Landroidx/recyclerview/widget/RecyclerView;->K0:LD1/c;

    .line 1092
    .line 1093
    if-eq v3, v4, :cond_51

    .line 1094
    .line 1095
    iput-object v4, v1, Ld2/U;->t:Landroid/view/animation/Interpolator;

    .line 1096
    .line 1097
    new-instance v3, Landroid/widget/OverScroller;

    .line 1098
    .line 1099
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 1100
    .line 1101
    .line 1102
    move-result-object v2

    .line 1103
    invoke-direct {v3, v2, v4}, Landroid/widget/OverScroller;-><init>(Landroid/content/Context;Landroid/view/animation/Interpolator;)V

    .line 1104
    .line 1105
    .line 1106
    iput-object v3, v1, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 1107
    .line 1108
    :cond_51
    iget-object v2, v1, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 1109
    .line 1110
    const/high16 v28, -0x80000000

    .line 1111
    .line 1112
    const v29, 0x7fffffff

    .line 1113
    .line 1114
    .line 1115
    const/16 v22, 0x0

    .line 1116
    .line 1117
    const/16 v23, 0x0

    .line 1118
    .line 1119
    const/high16 v26, -0x80000000

    .line 1120
    .line 1121
    const v27, 0x7fffffff

    .line 1122
    .line 1123
    .line 1124
    move-object/from16 v21, v2

    .line 1125
    .line 1126
    invoke-virtual/range {v21 .. v29}, Landroid/widget/OverScroller;->fling(IIIIIIII)V

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {v1}, Ld2/U;->a()V

    .line 1130
    .line 1131
    .line 1132
    goto :goto_21

    .line 1133
    :cond_52
    :goto_1f
    const/4 v3, 0x0

    .line 1134
    :goto_20
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 1135
    .line 1136
    .line 1137
    :goto_21
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->V()V

    .line 1138
    .line 1139
    .line 1140
    goto :goto_23

    .line 1141
    :cond_53
    move v3, v7

    .line 1142
    invoke-virtual {v6, v3}, Landroid/view/MotionEvent;->getPointerId(I)I

    .line 1143
    .line 1144
    .line 1145
    move-result v1

    .line 1146
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->c0:I

    .line 1147
    .line 1148
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getX()F

    .line 1149
    .line 1150
    .line 1151
    move-result v1

    .line 1152
    add-float/2addr v1, v14

    .line 1153
    float-to-int v1, v1

    .line 1154
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->g0:I

    .line 1155
    .line 1156
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->e0:I

    .line 1157
    .line 1158
    invoke-virtual {v6}, Landroid/view/MotionEvent;->getY()F

    .line 1159
    .line 1160
    .line 1161
    move-result v1

    .line 1162
    add-float/2addr v1, v14

    .line 1163
    float-to-int v1, v1

    .line 1164
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->h0:I

    .line 1165
    .line 1166
    iput v1, v0, Landroidx/recyclerview/widget/RecyclerView;->f0:I

    .line 1167
    .line 1168
    if-eqz v10, :cond_54

    .line 1169
    .line 1170
    or-int/lit8 v9, v9, 0x2

    .line 1171
    .line 1172
    :cond_54
    invoke-direct {v0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 1173
    .line 1174
    .line 1175
    move-result-object v1

    .line 1176
    const/4 v3, 0x0

    .line 1177
    invoke-virtual {v1, v9, v3}, Lw1/j;->g(II)Z

    .line 1178
    .line 1179
    .line 1180
    :cond_55
    :goto_22
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->d0:Landroid/view/VelocityTracker;

    .line 1181
    .line 1182
    invoke-virtual {v1, v13}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    .line 1183
    .line 1184
    .line 1185
    :goto_23
    invoke-virtual {v13}, Landroid/view/MotionEvent;->recycle()V

    .line 1186
    .line 1187
    .line 1188
    const/16 v20, 0x1

    .line 1189
    .line 1190
    return v20

    .line 1191
    :goto_24
    return v3
.end method

.method public final p()V
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-virtual {v1, v2}, Ld2/S;->a(I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->z(Ld2/S;)V

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    iput-boolean v3, v1, Ld2/S;->i:Z

    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->a0()V

    .line 16
    .line 17
    .line 18
    iget-object v4, v0, Landroidx/recyclerview/widget/RecyclerView;->v:LZ/m;

    .line 19
    .line 20
    iget-object v5, v4, LZ/m;->r:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v5, Lr/Q;

    .line 23
    .line 24
    iget-object v6, v4, LZ/m;->r:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v6, Lr/Q;

    .line 27
    .line 28
    invoke-virtual {v5}, Lr/Q;->clear()V

    .line 29
    .line 30
    .line 31
    iget-object v4, v4, LZ/m;->s:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v4, Lr/q;

    .line 34
    .line 35
    invoke-virtual {v4}, Lr/q;->a()V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    .line 39
    .line 40
    .line 41
    iget-boolean v5, v0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 42
    .line 43
    if-eqz v5, :cond_0

    .line 44
    .line 45
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 46
    .line 47
    iget-object v7, v5, LL0/l;->a:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v7, Ljava/util/ArrayList;

    .line 50
    .line 51
    invoke-virtual {v5, v7}, LL0/l;->r(Ljava/util/ArrayList;)V

    .line 52
    .line 53
    .line 54
    iget-object v7, v5, LL0/l;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v7, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v5, v7}, LL0/l;->r(Ljava/util/ArrayList;)V

    .line 59
    .line 60
    .line 61
    iget-boolean v5, v0, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 62
    .line 63
    if-eqz v5, :cond_0

    .line 64
    .line 65
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 66
    .line 67
    invoke-virtual {v5}, Ld2/G;->X()V

    .line 68
    .line 69
    .line 70
    :cond_0
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 71
    .line 72
    if-eqz v5, :cond_38

    .line 73
    .line 74
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 75
    .line 76
    invoke-virtual {v5}, Ld2/G;->z0()Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-eqz v5, :cond_38

    .line 81
    .line 82
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 83
    .line 84
    iget-object v7, v5, LL0/l;->b:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v7, Lb1/d;

    .line 87
    .line 88
    iget-object v8, v5, LL0/l;->d:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v8, Ld2/x;

    .line 91
    .line 92
    iget-object v9, v5, LL0/l;->e:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v9, Lk3/c;

    .line 95
    .line 96
    iget-object v10, v5, LL0/l;->a:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v10, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    :goto_0
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 104
    .line 105
    .line 106
    move-result v11

    .line 107
    const/4 v12, 0x1

    .line 108
    sub-int/2addr v11, v12

    .line 109
    const/4 v14, 0x0

    .line 110
    :goto_1
    const/16 v15, 0x8

    .line 111
    .line 112
    const/4 v13, -0x1

    .line 113
    if-ltz v11, :cond_3

    .line 114
    .line 115
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v17

    .line 119
    move-object/from16 v2, v17

    .line 120
    .line 121
    check-cast v2, Ld2/a;

    .line 122
    .line 123
    iget v2, v2, Ld2/a;->a:I

    .line 124
    .line 125
    if-ne v2, v15, :cond_1

    .line 126
    .line 127
    if-eqz v14, :cond_2

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_1
    move v14, v12

    .line 131
    :cond_2
    add-int/lit8 v11, v11, -0x1

    .line 132
    .line 133
    const/4 v2, 0x1

    .line 134
    goto :goto_1

    .line 135
    :cond_3
    move v11, v13

    .line 136
    :goto_2
    if-eq v11, v13, :cond_23

    .line 137
    .line 138
    add-int/lit8 v15, v11, 0x1

    .line 139
    .line 140
    iget-object v13, v9, Lk3/c;->q:Ljava/lang/Object;

    .line 141
    .line 142
    check-cast v13, LL0/l;

    .line 143
    .line 144
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    move-result-object v18

    .line 148
    move-object/from16 v3, v18

    .line 149
    .line 150
    check-cast v3, Ld2/a;

    .line 151
    .line 152
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v18

    .line 156
    move-object/from16 v14, v18

    .line 157
    .line 158
    check-cast v14, Ld2/a;

    .line 159
    .line 160
    iget v2, v14, Ld2/a;->a:I

    .line 161
    .line 162
    if-eq v2, v12, :cond_1d

    .line 163
    .line 164
    const/16 v17, 0x0

    .line 165
    .line 166
    const/4 v12, 0x2

    .line 167
    if-eq v2, v12, :cond_b

    .line 168
    .line 169
    const/4 v12, 0x4

    .line 170
    if-eq v2, v12, :cond_4

    .line 171
    .line 172
    move-object/from16 v22, v4

    .line 173
    .line 174
    move-object/from16 v21, v9

    .line 175
    .line 176
    goto/16 :goto_f

    .line 177
    .line 178
    :cond_4
    iget v2, v3, Ld2/a;->c:I

    .line 179
    .line 180
    iget v12, v14, Ld2/a;->b:I

    .line 181
    .line 182
    if-ge v2, v12, :cond_5

    .line 183
    .line 184
    add-int/lit8 v12, v12, -0x1

    .line 185
    .line 186
    iput v12, v14, Ld2/a;->b:I

    .line 187
    .line 188
    move-object/from16 v21, v9

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_5
    move-object/from16 v21, v9

    .line 192
    .line 193
    iget v9, v14, Ld2/a;->c:I

    .line 194
    .line 195
    add-int/2addr v12, v9

    .line 196
    if-ge v2, v12, :cond_6

    .line 197
    .line 198
    add-int/lit8 v9, v9, -0x1

    .line 199
    .line 200
    iput v9, v14, Ld2/a;->c:I

    .line 201
    .line 202
    iget v2, v3, Ld2/a;->b:I

    .line 203
    .line 204
    const/4 v9, 0x1

    .line 205
    const/4 v12, 0x4

    .line 206
    invoke-virtual {v13, v12, v2, v9}, LL0/l;->p(III)Ld2/a;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    goto :goto_4

    .line 211
    :cond_6
    :goto_3
    move-object/from16 v2, v17

    .line 212
    .line 213
    :goto_4
    iget v9, v3, Ld2/a;->b:I

    .line 214
    .line 215
    iget v12, v14, Ld2/a;->b:I

    .line 216
    .line 217
    if-gt v9, v12, :cond_8

    .line 218
    .line 219
    add-int/lit8 v12, v12, 0x1

    .line 220
    .line 221
    iput v12, v14, Ld2/a;->b:I

    .line 222
    .line 223
    :cond_7
    move-object/from16 v22, v4

    .line 224
    .line 225
    goto :goto_5

    .line 226
    :cond_8
    move/from16 v16, v12

    .line 227
    .line 228
    iget v12, v14, Ld2/a;->c:I

    .line 229
    .line 230
    add-int v12, v16, v12

    .line 231
    .line 232
    if-ge v9, v12, :cond_7

    .line 233
    .line 234
    sub-int/2addr v12, v9

    .line 235
    add-int/lit8 v9, v9, 0x1

    .line 236
    .line 237
    move-object/from16 v22, v4

    .line 238
    .line 239
    const/4 v4, 0x4

    .line 240
    invoke-virtual {v13, v4, v9, v12}, LL0/l;->p(III)Ld2/a;

    .line 241
    .line 242
    .line 243
    move-result-object v17

    .line 244
    iget v4, v14, Ld2/a;->c:I

    .line 245
    .line 246
    sub-int/2addr v4, v12

    .line 247
    iput v4, v14, Ld2/a;->c:I

    .line 248
    .line 249
    :goto_5
    move-object/from16 v4, v17

    .line 250
    .line 251
    invoke-virtual {v10, v15, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    iget v3, v14, Ld2/a;->c:I

    .line 255
    .line 256
    if-lez v3, :cond_9

    .line 257
    .line 258
    invoke-virtual {v10, v11, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    goto :goto_6

    .line 262
    :cond_9
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    iget-object v3, v13, LL0/l;->b:Ljava/lang/Object;

    .line 266
    .line 267
    check-cast v3, Lb1/d;

    .line 268
    .line 269
    invoke-virtual {v3, v14}, Lb1/d;->c(Ljava/lang/Object;)Z

    .line 270
    .line 271
    .line 272
    :goto_6
    if-eqz v2, :cond_a

    .line 273
    .line 274
    invoke-virtual {v10, v11, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    :cond_a
    if-eqz v4, :cond_22

    .line 278
    .line 279
    invoke-virtual {v10, v11, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_f

    .line 283
    .line 284
    :cond_b
    move-object/from16 v22, v4

    .line 285
    .line 286
    move-object/from16 v21, v9

    .line 287
    .line 288
    iget v2, v3, Ld2/a;->b:I

    .line 289
    .line 290
    iget v4, v3, Ld2/a;->c:I

    .line 291
    .line 292
    if-ge v2, v4, :cond_d

    .line 293
    .line 294
    iget v9, v14, Ld2/a;->b:I

    .line 295
    .line 296
    if-ne v9, v2, :cond_c

    .line 297
    .line 298
    iget v9, v14, Ld2/a;->c:I

    .line 299
    .line 300
    sub-int v2, v4, v2

    .line 301
    .line 302
    if-ne v9, v2, :cond_c

    .line 303
    .line 304
    const/4 v2, 0x0

    .line 305
    :goto_7
    const/16 v16, 0x1

    .line 306
    .line 307
    goto :goto_9

    .line 308
    :cond_c
    const/4 v2, 0x0

    .line 309
    :goto_8
    const/16 v16, 0x0

    .line 310
    .line 311
    goto :goto_9

    .line 312
    :cond_d
    iget v9, v14, Ld2/a;->b:I

    .line 313
    .line 314
    add-int/lit8 v12, v4, 0x1

    .line 315
    .line 316
    if-ne v9, v12, :cond_e

    .line 317
    .line 318
    iget v9, v14, Ld2/a;->c:I

    .line 319
    .line 320
    sub-int/2addr v2, v4

    .line 321
    if-ne v9, v2, :cond_e

    .line 322
    .line 323
    const/4 v2, 0x1

    .line 324
    goto :goto_7

    .line 325
    :cond_e
    const/4 v2, 0x1

    .line 326
    goto :goto_8

    .line 327
    :goto_9
    iget v9, v14, Ld2/a;->b:I

    .line 328
    .line 329
    if-ge v4, v9, :cond_f

    .line 330
    .line 331
    add-int/lit8 v9, v9, -0x1

    .line 332
    .line 333
    iput v9, v14, Ld2/a;->b:I

    .line 334
    .line 335
    goto :goto_a

    .line 336
    :cond_f
    iget v12, v14, Ld2/a;->c:I

    .line 337
    .line 338
    add-int/2addr v9, v12

    .line 339
    if-ge v4, v9, :cond_10

    .line 340
    .line 341
    add-int/lit8 v12, v12, -0x1

    .line 342
    .line 343
    iput v12, v14, Ld2/a;->c:I

    .line 344
    .line 345
    const/4 v12, 0x2

    .line 346
    iput v12, v3, Ld2/a;->a:I

    .line 347
    .line 348
    const/4 v9, 0x1

    .line 349
    iput v9, v3, Ld2/a;->c:I

    .line 350
    .line 351
    iget v2, v14, Ld2/a;->c:I

    .line 352
    .line 353
    if-nez v2, :cond_22

    .line 354
    .line 355
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    iget-object v2, v13, LL0/l;->b:Ljava/lang/Object;

    .line 359
    .line 360
    check-cast v2, Lb1/d;

    .line 361
    .line 362
    invoke-virtual {v2, v14}, Lb1/d;->c(Ljava/lang/Object;)Z

    .line 363
    .line 364
    .line 365
    goto/16 :goto_f

    .line 366
    .line 367
    :cond_10
    :goto_a
    iget v4, v3, Ld2/a;->b:I

    .line 368
    .line 369
    iget v9, v14, Ld2/a;->b:I

    .line 370
    .line 371
    if-gt v4, v9, :cond_11

    .line 372
    .line 373
    add-int/lit8 v9, v9, 0x1

    .line 374
    .line 375
    iput v9, v14, Ld2/a;->b:I

    .line 376
    .line 377
    goto :goto_b

    .line 378
    :cond_11
    iget v12, v14, Ld2/a;->c:I

    .line 379
    .line 380
    add-int/2addr v9, v12

    .line 381
    if-ge v4, v9, :cond_12

    .line 382
    .line 383
    sub-int/2addr v9, v4

    .line 384
    add-int/lit8 v4, v4, 0x1

    .line 385
    .line 386
    const/4 v12, 0x2

    .line 387
    invoke-virtual {v13, v12, v4, v9}, LL0/l;->p(III)Ld2/a;

    .line 388
    .line 389
    .line 390
    move-result-object v17

    .line 391
    iget v4, v3, Ld2/a;->b:I

    .line 392
    .line 393
    iget v9, v14, Ld2/a;->b:I

    .line 394
    .line 395
    sub-int/2addr v4, v9

    .line 396
    iput v4, v14, Ld2/a;->c:I

    .line 397
    .line 398
    :cond_12
    :goto_b
    move-object/from16 v4, v17

    .line 399
    .line 400
    if-eqz v16, :cond_13

    .line 401
    .line 402
    invoke-virtual {v10, v11, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 403
    .line 404
    .line 405
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 406
    .line 407
    .line 408
    iget-object v2, v13, LL0/l;->b:Ljava/lang/Object;

    .line 409
    .line 410
    check-cast v2, Lb1/d;

    .line 411
    .line 412
    invoke-virtual {v2, v3}, Lb1/d;->c(Ljava/lang/Object;)Z

    .line 413
    .line 414
    .line 415
    goto/16 :goto_f

    .line 416
    .line 417
    :cond_13
    if-eqz v2, :cond_17

    .line 418
    .line 419
    if-eqz v4, :cond_15

    .line 420
    .line 421
    iget v2, v3, Ld2/a;->b:I

    .line 422
    .line 423
    iget v9, v4, Ld2/a;->b:I

    .line 424
    .line 425
    if-le v2, v9, :cond_14

    .line 426
    .line 427
    iget v9, v4, Ld2/a;->c:I

    .line 428
    .line 429
    sub-int/2addr v2, v9

    .line 430
    iput v2, v3, Ld2/a;->b:I

    .line 431
    .line 432
    :cond_14
    iget v2, v3, Ld2/a;->c:I

    .line 433
    .line 434
    iget v9, v4, Ld2/a;->b:I

    .line 435
    .line 436
    if-le v2, v9, :cond_15

    .line 437
    .line 438
    iget v9, v4, Ld2/a;->c:I

    .line 439
    .line 440
    sub-int/2addr v2, v9

    .line 441
    iput v2, v3, Ld2/a;->c:I

    .line 442
    .line 443
    :cond_15
    iget v2, v3, Ld2/a;->b:I

    .line 444
    .line 445
    iget v9, v14, Ld2/a;->b:I

    .line 446
    .line 447
    if-le v2, v9, :cond_16

    .line 448
    .line 449
    iget v9, v14, Ld2/a;->c:I

    .line 450
    .line 451
    sub-int/2addr v2, v9

    .line 452
    iput v2, v3, Ld2/a;->b:I

    .line 453
    .line 454
    :cond_16
    iget v2, v3, Ld2/a;->c:I

    .line 455
    .line 456
    iget v9, v14, Ld2/a;->b:I

    .line 457
    .line 458
    if-le v2, v9, :cond_1b

    .line 459
    .line 460
    iget v9, v14, Ld2/a;->c:I

    .line 461
    .line 462
    sub-int/2addr v2, v9

    .line 463
    iput v2, v3, Ld2/a;->c:I

    .line 464
    .line 465
    goto :goto_c

    .line 466
    :cond_17
    if-eqz v4, :cond_19

    .line 467
    .line 468
    iget v2, v3, Ld2/a;->b:I

    .line 469
    .line 470
    iget v9, v4, Ld2/a;->b:I

    .line 471
    .line 472
    if-lt v2, v9, :cond_18

    .line 473
    .line 474
    iget v9, v4, Ld2/a;->c:I

    .line 475
    .line 476
    sub-int/2addr v2, v9

    .line 477
    iput v2, v3, Ld2/a;->b:I

    .line 478
    .line 479
    :cond_18
    iget v2, v3, Ld2/a;->c:I

    .line 480
    .line 481
    iget v9, v4, Ld2/a;->b:I

    .line 482
    .line 483
    if-lt v2, v9, :cond_19

    .line 484
    .line 485
    iget v9, v4, Ld2/a;->c:I

    .line 486
    .line 487
    sub-int/2addr v2, v9

    .line 488
    iput v2, v3, Ld2/a;->c:I

    .line 489
    .line 490
    :cond_19
    iget v2, v3, Ld2/a;->b:I

    .line 491
    .line 492
    iget v9, v14, Ld2/a;->b:I

    .line 493
    .line 494
    if-lt v2, v9, :cond_1a

    .line 495
    .line 496
    iget v9, v14, Ld2/a;->c:I

    .line 497
    .line 498
    sub-int/2addr v2, v9

    .line 499
    iput v2, v3, Ld2/a;->b:I

    .line 500
    .line 501
    :cond_1a
    iget v2, v3, Ld2/a;->c:I

    .line 502
    .line 503
    iget v9, v14, Ld2/a;->b:I

    .line 504
    .line 505
    if-lt v2, v9, :cond_1b

    .line 506
    .line 507
    iget v9, v14, Ld2/a;->c:I

    .line 508
    .line 509
    sub-int/2addr v2, v9

    .line 510
    iput v2, v3, Ld2/a;->c:I

    .line 511
    .line 512
    :cond_1b
    :goto_c
    invoke-virtual {v10, v11, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 513
    .line 514
    .line 515
    iget v2, v3, Ld2/a;->b:I

    .line 516
    .line 517
    iget v9, v3, Ld2/a;->c:I

    .line 518
    .line 519
    if-eq v2, v9, :cond_1c

    .line 520
    .line 521
    invoke-virtual {v10, v15, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    goto :goto_d

    .line 525
    :cond_1c
    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 526
    .line 527
    .line 528
    :goto_d
    if-eqz v4, :cond_22

    .line 529
    .line 530
    invoke-virtual {v10, v11, v4}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 531
    .line 532
    .line 533
    goto :goto_f

    .line 534
    :cond_1d
    move-object/from16 v22, v4

    .line 535
    .line 536
    move-object/from16 v21, v9

    .line 537
    .line 538
    iget v2, v3, Ld2/a;->c:I

    .line 539
    .line 540
    iget v4, v14, Ld2/a;->b:I

    .line 541
    .line 542
    if-ge v2, v4, :cond_1e

    .line 543
    .line 544
    const/4 v13, -0x1

    .line 545
    goto :goto_e

    .line 546
    :cond_1e
    const/4 v13, 0x0

    .line 547
    :goto_e
    iget v9, v3, Ld2/a;->b:I

    .line 548
    .line 549
    if-ge v9, v4, :cond_1f

    .line 550
    .line 551
    add-int/lit8 v13, v13, 0x1

    .line 552
    .line 553
    :cond_1f
    if-gt v4, v9, :cond_20

    .line 554
    .line 555
    iget v4, v14, Ld2/a;->c:I

    .line 556
    .line 557
    add-int/2addr v9, v4

    .line 558
    iput v9, v3, Ld2/a;->b:I

    .line 559
    .line 560
    :cond_20
    iget v4, v14, Ld2/a;->b:I

    .line 561
    .line 562
    if-gt v4, v2, :cond_21

    .line 563
    .line 564
    iget v9, v14, Ld2/a;->c:I

    .line 565
    .line 566
    add-int/2addr v2, v9

    .line 567
    iput v2, v3, Ld2/a;->c:I

    .line 568
    .line 569
    :cond_21
    add-int/2addr v4, v13

    .line 570
    iput v4, v14, Ld2/a;->b:I

    .line 571
    .line 572
    invoke-virtual {v10, v11, v14}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 573
    .line 574
    .line 575
    invoke-virtual {v10, v15, v3}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 576
    .line 577
    .line 578
    :cond_22
    :goto_f
    move-object/from16 v9, v21

    .line 579
    .line 580
    move-object/from16 v4, v22

    .line 581
    .line 582
    const/4 v2, 0x1

    .line 583
    const/4 v3, 0x0

    .line 584
    goto/16 :goto_0

    .line 585
    .line 586
    :cond_23
    move-object/from16 v22, v4

    .line 587
    .line 588
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 589
    .line 590
    .line 591
    move-result v2

    .line 592
    const/4 v3, 0x0

    .line 593
    :goto_10
    if-ge v3, v2, :cond_37

    .line 594
    .line 595
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 596
    .line 597
    .line 598
    move-result-object v4

    .line 599
    check-cast v4, Ld2/a;

    .line 600
    .line 601
    iget v9, v4, Ld2/a;->a:I

    .line 602
    .line 603
    const/4 v11, 0x1

    .line 604
    if-eq v9, v11, :cond_36

    .line 605
    .line 606
    const/4 v12, 0x2

    .line 607
    if-eq v9, v12, :cond_2d

    .line 608
    .line 609
    const/4 v12, 0x4

    .line 610
    if-eq v9, v12, :cond_25

    .line 611
    .line 612
    if-eq v9, v15, :cond_24

    .line 613
    .line 614
    :goto_11
    const/4 v12, 0x2

    .line 615
    const/16 v20, 0x1

    .line 616
    .line 617
    goto/16 :goto_20

    .line 618
    .line 619
    :cond_24
    invoke-virtual {v5, v4}, LL0/l;->q(Ld2/a;)V

    .line 620
    .line 621
    .line 622
    goto :goto_11

    .line 623
    :cond_25
    iget v9, v4, Ld2/a;->b:I

    .line 624
    .line 625
    iget v11, v4, Ld2/a;->c:I

    .line 626
    .line 627
    add-int/2addr v11, v9

    .line 628
    move v12, v9

    .line 629
    const/4 v13, 0x0

    .line 630
    const/4 v14, -0x1

    .line 631
    :goto_12
    if-ge v9, v11, :cond_2a

    .line 632
    .line 633
    invoke-virtual {v8, v9}, Ld2/x;->b(I)Ld2/V;

    .line 634
    .line 635
    .line 636
    move-result-object v21

    .line 637
    if-nez v21, :cond_26

    .line 638
    .line 639
    invoke-virtual {v5, v9}, LL0/l;->e(I)Z

    .line 640
    .line 641
    .line 642
    move-result v21

    .line 643
    if-eqz v21, :cond_27

    .line 644
    .line 645
    :cond_26
    const/4 v15, 0x4

    .line 646
    goto :goto_15

    .line 647
    :cond_27
    const/4 v15, 0x1

    .line 648
    if-ne v14, v15, :cond_28

    .line 649
    .line 650
    const/4 v15, 0x4

    .line 651
    invoke-virtual {v5, v15, v12, v13}, LL0/l;->p(III)Ld2/a;

    .line 652
    .line 653
    .line 654
    move-result-object v12

    .line 655
    invoke-virtual {v5, v12}, LL0/l;->q(Ld2/a;)V

    .line 656
    .line 657
    .line 658
    move v12, v9

    .line 659
    const/4 v13, 0x0

    .line 660
    goto :goto_13

    .line 661
    :cond_28
    const/4 v15, 0x4

    .line 662
    :goto_13
    const/4 v14, 0x0

    .line 663
    :goto_14
    const/16 v20, 0x1

    .line 664
    .line 665
    goto :goto_16

    .line 666
    :goto_15
    if-nez v14, :cond_29

    .line 667
    .line 668
    invoke-virtual {v5, v15, v12, v13}, LL0/l;->p(III)Ld2/a;

    .line 669
    .line 670
    .line 671
    move-result-object v12

    .line 672
    invoke-virtual {v5, v12}, LL0/l;->g(Ld2/a;)V

    .line 673
    .line 674
    .line 675
    move v12, v9

    .line 676
    const/4 v13, 0x0

    .line 677
    :cond_29
    const/4 v14, 0x1

    .line 678
    goto :goto_14

    .line 679
    :goto_16
    add-int/lit8 v13, v13, 0x1

    .line 680
    .line 681
    add-int/lit8 v9, v9, 0x1

    .line 682
    .line 683
    const/16 v15, 0x8

    .line 684
    .line 685
    goto :goto_12

    .line 686
    :cond_2a
    iget v9, v4, Ld2/a;->c:I

    .line 687
    .line 688
    if-eq v13, v9, :cond_2b

    .line 689
    .line 690
    invoke-virtual {v7, v4}, Lb1/d;->c(Ljava/lang/Object;)Z

    .line 691
    .line 692
    .line 693
    const/4 v15, 0x4

    .line 694
    invoke-virtual {v5, v15, v12, v13}, LL0/l;->p(III)Ld2/a;

    .line 695
    .line 696
    .line 697
    move-result-object v4

    .line 698
    goto :goto_17

    .line 699
    :cond_2b
    const/4 v15, 0x4

    .line 700
    :goto_17
    if-nez v14, :cond_2c

    .line 701
    .line 702
    invoke-virtual {v5, v4}, LL0/l;->g(Ld2/a;)V

    .line 703
    .line 704
    .line 705
    goto :goto_11

    .line 706
    :cond_2c
    invoke-virtual {v5, v4}, LL0/l;->q(Ld2/a;)V

    .line 707
    .line 708
    .line 709
    goto :goto_11

    .line 710
    :cond_2d
    const/4 v15, 0x4

    .line 711
    iget v9, v4, Ld2/a;->b:I

    .line 712
    .line 713
    iget v11, v4, Ld2/a;->c:I

    .line 714
    .line 715
    add-int/2addr v11, v9

    .line 716
    move v12, v9

    .line 717
    const/4 v13, 0x0

    .line 718
    const/4 v14, -0x1

    .line 719
    :goto_18
    if-ge v12, v11, :cond_33

    .line 720
    .line 721
    invoke-virtual {v8, v12}, Ld2/x;->b(I)Ld2/V;

    .line 722
    .line 723
    .line 724
    move-result-object v19

    .line 725
    if-nez v19, :cond_2e

    .line 726
    .line 727
    invoke-virtual {v5, v12}, LL0/l;->e(I)Z

    .line 728
    .line 729
    .line 730
    move-result v19

    .line 731
    if-eqz v19, :cond_2f

    .line 732
    .line 733
    :cond_2e
    const/4 v15, 0x2

    .line 734
    goto :goto_1a

    .line 735
    :cond_2f
    const/4 v15, 0x1

    .line 736
    if-ne v14, v15, :cond_30

    .line 737
    .line 738
    const/4 v15, 0x2

    .line 739
    invoke-virtual {v5, v15, v9, v13}, LL0/l;->p(III)Ld2/a;

    .line 740
    .line 741
    .line 742
    move-result-object v14

    .line 743
    invoke-virtual {v5, v14}, LL0/l;->q(Ld2/a;)V

    .line 744
    .line 745
    .line 746
    const/4 v14, 0x1

    .line 747
    goto :goto_19

    .line 748
    :cond_30
    const/4 v15, 0x2

    .line 749
    const/4 v14, 0x0

    .line 750
    :goto_19
    const/4 v15, 0x0

    .line 751
    goto :goto_1c

    .line 752
    :goto_1a
    if-nez v14, :cond_31

    .line 753
    .line 754
    invoke-virtual {v5, v15, v9, v13}, LL0/l;->p(III)Ld2/a;

    .line 755
    .line 756
    .line 757
    move-result-object v14

    .line 758
    invoke-virtual {v5, v14}, LL0/l;->g(Ld2/a;)V

    .line 759
    .line 760
    .line 761
    const/4 v14, 0x1

    .line 762
    goto :goto_1b

    .line 763
    :cond_31
    const/4 v14, 0x0

    .line 764
    :goto_1b
    const/4 v15, 0x1

    .line 765
    :goto_1c
    if-eqz v14, :cond_32

    .line 766
    .line 767
    sub-int/2addr v12, v13

    .line 768
    sub-int/2addr v11, v13

    .line 769
    const/4 v13, 0x1

    .line 770
    :goto_1d
    const/16 v20, 0x1

    .line 771
    .line 772
    goto :goto_1e

    .line 773
    :cond_32
    add-int/lit8 v13, v13, 0x1

    .line 774
    .line 775
    goto :goto_1d

    .line 776
    :goto_1e
    add-int/lit8 v12, v12, 0x1

    .line 777
    .line 778
    move v14, v15

    .line 779
    const/4 v15, 0x4

    .line 780
    goto :goto_18

    .line 781
    :cond_33
    const/16 v20, 0x1

    .line 782
    .line 783
    iget v11, v4, Ld2/a;->c:I

    .line 784
    .line 785
    if-eq v13, v11, :cond_34

    .line 786
    .line 787
    invoke-virtual {v7, v4}, Lb1/d;->c(Ljava/lang/Object;)Z

    .line 788
    .line 789
    .line 790
    const/4 v12, 0x2

    .line 791
    invoke-virtual {v5, v12, v9, v13}, LL0/l;->p(III)Ld2/a;

    .line 792
    .line 793
    .line 794
    move-result-object v4

    .line 795
    goto :goto_1f

    .line 796
    :cond_34
    const/4 v12, 0x2

    .line 797
    :goto_1f
    if-nez v14, :cond_35

    .line 798
    .line 799
    invoke-virtual {v5, v4}, LL0/l;->g(Ld2/a;)V

    .line 800
    .line 801
    .line 802
    goto :goto_20

    .line 803
    :cond_35
    invoke-virtual {v5, v4}, LL0/l;->q(Ld2/a;)V

    .line 804
    .line 805
    .line 806
    goto :goto_20

    .line 807
    :cond_36
    move/from16 v20, v11

    .line 808
    .line 809
    const/4 v12, 0x2

    .line 810
    invoke-virtual {v5, v4}, LL0/l;->q(Ld2/a;)V

    .line 811
    .line 812
    .line 813
    :goto_20
    add-int/lit8 v3, v3, 0x1

    .line 814
    .line 815
    const/16 v15, 0x8

    .line 816
    .line 817
    goto/16 :goto_10

    .line 818
    .line 819
    :cond_37
    invoke-virtual {v10}, Ljava/util/ArrayList;->clear()V

    .line 820
    .line 821
    .line 822
    goto :goto_21

    .line 823
    :cond_38
    move-object/from16 v22, v4

    .line 824
    .line 825
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 826
    .line 827
    invoke-virtual {v2}, LL0/l;->f()V

    .line 828
    .line 829
    .line 830
    :goto_21
    iget-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->v0:Z

    .line 831
    .line 832
    const/4 v3, 0x1

    .line 833
    const/4 v4, 0x0

    .line 834
    if-nez v2, :cond_3a

    .line 835
    .line 836
    iget-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->w0:Z

    .line 837
    .line 838
    if-eqz v2, :cond_39

    .line 839
    .line 840
    goto :goto_22

    .line 841
    :cond_39
    move v2, v4

    .line 842
    goto :goto_23

    .line 843
    :cond_3a
    :goto_22
    move v2, v3

    .line 844
    :goto_23
    iget-boolean v5, v0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 845
    .line 846
    if-eqz v5, :cond_3d

    .line 847
    .line 848
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 849
    .line 850
    if-eqz v5, :cond_3d

    .line 851
    .line 852
    iget-boolean v5, v0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 853
    .line 854
    if-nez v5, :cond_3b

    .line 855
    .line 856
    if-nez v2, :cond_3b

    .line 857
    .line 858
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 859
    .line 860
    iget-boolean v7, v7, Ld2/G;->f:Z

    .line 861
    .line 862
    if-eqz v7, :cond_3d

    .line 863
    .line 864
    :cond_3b
    if-eqz v5, :cond_3c

    .line 865
    .line 866
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 867
    .line 868
    iget-boolean v5, v5, Ld2/z;->b:Z

    .line 869
    .line 870
    if-eqz v5, :cond_3d

    .line 871
    .line 872
    :cond_3c
    move v5, v3

    .line 873
    goto :goto_24

    .line 874
    :cond_3d
    move v5, v4

    .line 875
    :goto_24
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 876
    .line 877
    iput-boolean v5, v7, Ld2/S;->j:Z

    .line 878
    .line 879
    if-eqz v5, :cond_3e

    .line 880
    .line 881
    if-eqz v2, :cond_3e

    .line 882
    .line 883
    iget-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 884
    .line 885
    if-nez v2, :cond_3e

    .line 886
    .line 887
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 888
    .line 889
    if-eqz v2, :cond_3e

    .line 890
    .line 891
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 892
    .line 893
    invoke-virtual {v2}, Ld2/G;->z0()Z

    .line 894
    .line 895
    .line 896
    move-result v2

    .line 897
    if-eqz v2, :cond_3e

    .line 898
    .line 899
    goto :goto_25

    .line 900
    :cond_3e
    move v3, v4

    .line 901
    :goto_25
    iput-boolean v3, v7, Ld2/S;->k:Z

    .line 902
    .line 903
    iget-boolean v2, v0, Landroidx/recyclerview/widget/RecyclerView;->o0:Z

    .line 904
    .line 905
    const/4 v3, 0x0

    .line 906
    if-eqz v2, :cond_3f

    .line 907
    .line 908
    invoke-virtual {v0}, Landroid/view/View;->hasFocus()Z

    .line 909
    .line 910
    .line 911
    move-result v2

    .line 912
    if-eqz v2, :cond_3f

    .line 913
    .line 914
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 915
    .line 916
    if-eqz v2, :cond_3f

    .line 917
    .line 918
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 919
    .line 920
    .line 921
    move-result-object v2

    .line 922
    goto :goto_26

    .line 923
    :cond_3f
    move-object v2, v3

    .line 924
    :goto_26
    if-nez v2, :cond_40

    .line 925
    .line 926
    goto :goto_27

    .line 927
    :cond_40
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->A(Landroid/view/View;)Landroid/view/View;

    .line 928
    .line 929
    .line 930
    move-result-object v2

    .line 931
    if-nez v2, :cond_41

    .line 932
    .line 933
    goto :goto_27

    .line 934
    :cond_41
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->H(Landroid/view/View;)Ld2/V;

    .line 935
    .line 936
    .line 937
    move-result-object v3

    .line 938
    :goto_27
    const-wide/16 v4, -0x1

    .line 939
    .line 940
    const/4 v2, -0x1

    .line 941
    if-nez v3, :cond_42

    .line 942
    .line 943
    iput-wide v4, v1, Ld2/S;->m:J

    .line 944
    .line 945
    iput v2, v1, Ld2/S;->l:I

    .line 946
    .line 947
    iput v2, v1, Ld2/S;->n:I

    .line 948
    .line 949
    goto :goto_2b

    .line 950
    :cond_42
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 951
    .line 952
    iget-boolean v7, v7, Ld2/z;->b:Z

    .line 953
    .line 954
    if-eqz v7, :cond_43

    .line 955
    .line 956
    iget-wide v4, v3, Ld2/V;->e:J

    .line 957
    .line 958
    :cond_43
    iput-wide v4, v1, Ld2/S;->m:J

    .line 959
    .line 960
    iget-boolean v4, v0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 961
    .line 962
    if-eqz v4, :cond_44

    .line 963
    .line 964
    :goto_28
    move v4, v2

    .line 965
    goto :goto_29

    .line 966
    :cond_44
    invoke-virtual {v3}, Ld2/V;->h()Z

    .line 967
    .line 968
    .line 969
    move-result v4

    .line 970
    if-eqz v4, :cond_45

    .line 971
    .line 972
    iget v4, v3, Ld2/V;->d:I

    .line 973
    .line 974
    goto :goto_29

    .line 975
    :cond_45
    iget-object v4, v3, Ld2/V;->r:Landroidx/recyclerview/widget/RecyclerView;

    .line 976
    .line 977
    if-nez v4, :cond_46

    .line 978
    .line 979
    goto :goto_28

    .line 980
    :cond_46
    invoke-virtual {v4, v3}, Landroidx/recyclerview/widget/RecyclerView;->F(Ld2/V;)I

    .line 981
    .line 982
    .line 983
    move-result v4

    .line 984
    :goto_29
    iput v4, v1, Ld2/S;->l:I

    .line 985
    .line 986
    iget-object v3, v3, Ld2/V;->a:Landroid/view/View;

    .line 987
    .line 988
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 989
    .line 990
    .line 991
    move-result v4

    .line 992
    :cond_47
    :goto_2a
    invoke-virtual {v3}, Landroid/view/View;->isFocused()Z

    .line 993
    .line 994
    .line 995
    move-result v5

    .line 996
    if-nez v5, :cond_48

    .line 997
    .line 998
    instance-of v5, v3, Landroid/view/ViewGroup;

    .line 999
    .line 1000
    if-eqz v5, :cond_48

    .line 1001
    .line 1002
    invoke-virtual {v3}, Landroid/view/View;->hasFocus()Z

    .line 1003
    .line 1004
    .line 1005
    move-result v5

    .line 1006
    if-eqz v5, :cond_48

    .line 1007
    .line 1008
    check-cast v3, Landroid/view/ViewGroup;

    .line 1009
    .line 1010
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getFocusedChild()Landroid/view/View;

    .line 1011
    .line 1012
    .line 1013
    move-result-object v3

    .line 1014
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 1015
    .line 1016
    .line 1017
    move-result v5

    .line 1018
    if-eq v5, v2, :cond_47

    .line 1019
    .line 1020
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 1021
    .line 1022
    .line 1023
    move-result v4

    .line 1024
    goto :goto_2a

    .line 1025
    :cond_48
    iput v4, v1, Ld2/S;->n:I

    .line 1026
    .line 1027
    :goto_2b
    iget-boolean v3, v1, Ld2/S;->j:Z

    .line 1028
    .line 1029
    if-eqz v3, :cond_49

    .line 1030
    .line 1031
    iget-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->w0:Z

    .line 1032
    .line 1033
    if-eqz v3, :cond_49

    .line 1034
    .line 1035
    const/4 v3, 0x1

    .line 1036
    goto :goto_2c

    .line 1037
    :cond_49
    const/4 v3, 0x0

    .line 1038
    :goto_2c
    iput-boolean v3, v1, Ld2/S;->h:Z

    .line 1039
    .line 1040
    const/4 v3, 0x0

    .line 1041
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->w0:Z

    .line 1042
    .line 1043
    iput-boolean v3, v0, Landroidx/recyclerview/widget/RecyclerView;->v0:Z

    .line 1044
    .line 1045
    iget-boolean v3, v1, Ld2/S;->k:Z

    .line 1046
    .line 1047
    iput-boolean v3, v1, Ld2/S;->g:Z

    .line 1048
    .line 1049
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 1050
    .line 1051
    invoke-virtual {v3}, Ld2/z;->a()I

    .line 1052
    .line 1053
    .line 1054
    move-result v3

    .line 1055
    iput v3, v1, Ld2/S;->e:I

    .line 1056
    .line 1057
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->A0:[I

    .line 1058
    .line 1059
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->C([I)V

    .line 1060
    .line 1061
    .line 1062
    iget-boolean v3, v1, Ld2/S;->j:Z

    .line 1063
    .line 1064
    if-eqz v3, :cond_4d

    .line 1065
    .line 1066
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 1067
    .line 1068
    invoke-virtual {v3}, LB0/G0;->v()I

    .line 1069
    .line 1070
    .line 1071
    move-result v3

    .line 1072
    const/4 v4, 0x0

    .line 1073
    :goto_2d
    if-ge v4, v3, :cond_4d

    .line 1074
    .line 1075
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 1076
    .line 1077
    invoke-virtual {v5, v4}, LB0/G0;->u(I)Landroid/view/View;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v5

    .line 1081
    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 1082
    .line 1083
    .line 1084
    move-result-object v5

    .line 1085
    invoke-virtual {v5}, Ld2/V;->o()Z

    .line 1086
    .line 1087
    .line 1088
    move-result v7

    .line 1089
    if-nez v7, :cond_4a

    .line 1090
    .line 1091
    invoke-virtual {v5}, Ld2/V;->f()Z

    .line 1092
    .line 1093
    .line 1094
    move-result v7

    .line 1095
    if-eqz v7, :cond_4b

    .line 1096
    .line 1097
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 1098
    .line 1099
    iget-boolean v7, v7, Ld2/z;->b:Z

    .line 1100
    .line 1101
    if-nez v7, :cond_4b

    .line 1102
    .line 1103
    :cond_4a
    move-object/from16 v9, v22

    .line 1104
    .line 1105
    goto :goto_2e

    .line 1106
    :cond_4b
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 1107
    .line 1108
    invoke-static {v5}, Ld2/D;->b(Ld2/V;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-virtual {v5}, Ld2/V;->c()Ljava/util/List;

    .line 1112
    .line 1113
    .line 1114
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1115
    .line 1116
    .line 1117
    new-instance v7, LM/t;

    .line 1118
    .line 1119
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1120
    .line 1121
    .line 1122
    invoke-virtual {v7, v5}, LM/t;->a(Ld2/V;)V

    .line 1123
    .line 1124
    .line 1125
    invoke-virtual {v6, v5}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v8

    .line 1129
    check-cast v8, Ld2/g0;

    .line 1130
    .line 1131
    if-nez v8, :cond_4c

    .line 1132
    .line 1133
    invoke-static {}, Ld2/g0;->a()Ld2/g0;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v8

    .line 1137
    invoke-virtual {v6, v5, v8}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    :cond_4c
    iput-object v7, v8, Ld2/g0;->b:LM/t;

    .line 1141
    .line 1142
    iget v7, v8, Ld2/g0;->a:I

    .line 1143
    .line 1144
    or-int/lit8 v7, v7, 0x4

    .line 1145
    .line 1146
    iput v7, v8, Ld2/g0;->a:I

    .line 1147
    .line 1148
    iget-boolean v7, v1, Ld2/S;->h:Z

    .line 1149
    .line 1150
    if-eqz v7, :cond_4a

    .line 1151
    .line 1152
    invoke-virtual {v5}, Ld2/V;->k()Z

    .line 1153
    .line 1154
    .line 1155
    move-result v7

    .line 1156
    if-eqz v7, :cond_4a

    .line 1157
    .line 1158
    invoke-virtual {v5}, Ld2/V;->h()Z

    .line 1159
    .line 1160
    .line 1161
    move-result v7

    .line 1162
    if-nez v7, :cond_4a

    .line 1163
    .line 1164
    invoke-virtual {v5}, Ld2/V;->o()Z

    .line 1165
    .line 1166
    .line 1167
    move-result v7

    .line 1168
    if-nez v7, :cond_4a

    .line 1169
    .line 1170
    invoke-virtual {v5}, Ld2/V;->f()Z

    .line 1171
    .line 1172
    .line 1173
    move-result v7

    .line 1174
    if-nez v7, :cond_4a

    .line 1175
    .line 1176
    invoke-virtual {v0, v5}, Landroidx/recyclerview/widget/RecyclerView;->G(Ld2/V;)J

    .line 1177
    .line 1178
    .line 1179
    move-result-wide v7

    .line 1180
    move-object/from16 v9, v22

    .line 1181
    .line 1182
    invoke-virtual {v9, v7, v8, v5}, Lr/q;->e(JLjava/lang/Object;)V

    .line 1183
    .line 1184
    .line 1185
    :goto_2e
    add-int/lit8 v4, v4, 0x1

    .line 1186
    .line 1187
    move-object/from16 v22, v9

    .line 1188
    .line 1189
    goto :goto_2d

    .line 1190
    :cond_4d
    iget-boolean v3, v1, Ld2/S;->k:Z

    .line 1191
    .line 1192
    const/4 v4, 0x2

    .line 1193
    if-eqz v3, :cond_56

    .line 1194
    .line 1195
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 1196
    .line 1197
    invoke-virtual {v3}, LB0/G0;->G()I

    .line 1198
    .line 1199
    .line 1200
    move-result v3

    .line 1201
    const/4 v5, 0x0

    .line 1202
    :goto_2f
    if-ge v5, v3, :cond_4f

    .line 1203
    .line 1204
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 1205
    .line 1206
    invoke-virtual {v7, v5}, LB0/G0;->F(I)Landroid/view/View;

    .line 1207
    .line 1208
    .line 1209
    move-result-object v7

    .line 1210
    invoke-static {v7}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 1211
    .line 1212
    .line 1213
    move-result-object v7

    .line 1214
    invoke-virtual {v7}, Ld2/V;->o()Z

    .line 1215
    .line 1216
    .line 1217
    move-result v8

    .line 1218
    if-nez v8, :cond_4e

    .line 1219
    .line 1220
    iget v8, v7, Ld2/V;->d:I

    .line 1221
    .line 1222
    if-ne v8, v2, :cond_4e

    .line 1223
    .line 1224
    iget v8, v7, Ld2/V;->c:I

    .line 1225
    .line 1226
    iput v8, v7, Ld2/V;->d:I

    .line 1227
    .line 1228
    :cond_4e
    add-int/lit8 v5, v5, 0x1

    .line 1229
    .line 1230
    goto :goto_2f

    .line 1231
    :cond_4f
    iget-boolean v2, v1, Ld2/S;->f:Z

    .line 1232
    .line 1233
    const/4 v3, 0x0

    .line 1234
    iput-boolean v3, v1, Ld2/S;->f:Z

    .line 1235
    .line 1236
    iget-object v3, v0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 1237
    .line 1238
    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 1239
    .line 1240
    invoke-virtual {v3, v5, v1}, Ld2/G;->b0(Ld2/M;Ld2/S;)V

    .line 1241
    .line 1242
    .line 1243
    iput-boolean v2, v1, Ld2/S;->f:Z

    .line 1244
    .line 1245
    const/4 v3, 0x0

    .line 1246
    :goto_30
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 1247
    .line 1248
    invoke-virtual {v2}, LB0/G0;->v()I

    .line 1249
    .line 1250
    .line 1251
    move-result v2

    .line 1252
    if-ge v3, v2, :cond_55

    .line 1253
    .line 1254
    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 1255
    .line 1256
    invoke-virtual {v2, v3}, LB0/G0;->u(I)Landroid/view/View;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v2

    .line 1260
    invoke-static {v2}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 1261
    .line 1262
    .line 1263
    move-result-object v2

    .line 1264
    invoke-virtual {v2}, Ld2/V;->o()Z

    .line 1265
    .line 1266
    .line 1267
    move-result v5

    .line 1268
    if-eqz v5, :cond_50

    .line 1269
    .line 1270
    goto :goto_32

    .line 1271
    :cond_50
    invoke-virtual {v6, v2}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1272
    .line 1273
    .line 1274
    move-result-object v5

    .line 1275
    check-cast v5, Ld2/g0;

    .line 1276
    .line 1277
    if-eqz v5, :cond_51

    .line 1278
    .line 1279
    iget v5, v5, Ld2/g0;->a:I

    .line 1280
    .line 1281
    and-int/lit8 v5, v5, 0x4

    .line 1282
    .line 1283
    if-eqz v5, :cond_51

    .line 1284
    .line 1285
    goto :goto_32

    .line 1286
    :cond_51
    invoke-static {v2}, Ld2/D;->b(Ld2/V;)V

    .line 1287
    .line 1288
    .line 1289
    iget v5, v2, Ld2/V;->j:I

    .line 1290
    .line 1291
    and-int/lit16 v5, v5, 0x2000

    .line 1292
    .line 1293
    if-eqz v5, :cond_52

    .line 1294
    .line 1295
    const/4 v5, 0x1

    .line 1296
    goto :goto_31

    .line 1297
    :cond_52
    const/4 v5, 0x0

    .line 1298
    :goto_31
    iget-object v7, v0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 1299
    .line 1300
    invoke-virtual {v2}, Ld2/V;->c()Ljava/util/List;

    .line 1301
    .line 1302
    .line 1303
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1304
    .line 1305
    .line 1306
    new-instance v7, LM/t;

    .line 1307
    .line 1308
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 1309
    .line 1310
    .line 1311
    invoke-virtual {v7, v2}, LM/t;->a(Ld2/V;)V

    .line 1312
    .line 1313
    .line 1314
    if-eqz v5, :cond_53

    .line 1315
    .line 1316
    invoke-virtual {v0, v2, v7}, Landroidx/recyclerview/widget/RecyclerView;->T(Ld2/V;LM/t;)V

    .line 1317
    .line 1318
    .line 1319
    goto :goto_32

    .line 1320
    :cond_53
    invoke-virtual {v6, v2}, Lr/Q;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1321
    .line 1322
    .line 1323
    move-result-object v5

    .line 1324
    check-cast v5, Ld2/g0;

    .line 1325
    .line 1326
    if-nez v5, :cond_54

    .line 1327
    .line 1328
    invoke-static {}, Ld2/g0;->a()Ld2/g0;

    .line 1329
    .line 1330
    .line 1331
    move-result-object v5

    .line 1332
    invoke-virtual {v6, v2, v5}, Lr/Q;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1333
    .line 1334
    .line 1335
    :cond_54
    iget v2, v5, Ld2/g0;->a:I

    .line 1336
    .line 1337
    or-int/2addr v2, v4

    .line 1338
    iput v2, v5, Ld2/g0;->a:I

    .line 1339
    .line 1340
    iput-object v7, v5, Ld2/g0;->b:LM/t;

    .line 1341
    .line 1342
    :goto_32
    add-int/lit8 v3, v3, 0x1

    .line 1343
    .line 1344
    goto :goto_30

    .line 1345
    :cond_55
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->k()V

    .line 1346
    .line 1347
    .line 1348
    :goto_33
    const/4 v2, 0x1

    .line 1349
    goto :goto_34

    .line 1350
    :cond_56
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->k()V

    .line 1351
    .line 1352
    .line 1353
    goto :goto_33

    .line 1354
    :goto_34
    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    .line 1355
    .line 1356
    .line 1357
    const/4 v3, 0x0

    .line 1358
    invoke-virtual {v0, v3}, Landroidx/recyclerview/widget/RecyclerView;->b0(Z)V

    .line 1359
    .line 1360
    .line 1361
    iput v4, v1, Ld2/S;->d:I

    .line 1362
    .line 1363
    return-void
.end method

.method public final q()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->a0()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->P()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x6

    .line 8
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 9
    .line 10
    invoke-virtual {v1, v0}, Ld2/S;->a(I)V

    .line 11
    .line 12
    .line 13
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 14
    .line 15
    invoke-virtual {v0}, LL0/l;->f()V

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 19
    .line 20
    invoke-virtual {v0}, Ld2/z;->a()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iput v0, v1, Ld2/S;->e:I

    .line 25
    .line 26
    const/4 v0, 0x0

    .line 27
    iput v0, v1, Ld2/S;->c:I

    .line 28
    .line 29
    iput-boolean v0, v1, Ld2/S;->g:Z

    .line 30
    .line 31
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 32
    .line 33
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 34
    .line 35
    invoke-virtual {v2, v3, v1}, Ld2/G;->b0(Ld2/M;Ld2/S;)V

    .line 36
    .line 37
    .line 38
    iput-boolean v0, v1, Ld2/S;->f:Z

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->s:Ld2/O;

    .line 42
    .line 43
    iget-boolean v2, v1, Ld2/S;->j:Z

    .line 44
    .line 45
    const/4 v3, 0x1

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    move v2, v3

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    move v2, v0

    .line 55
    :goto_0
    iput-boolean v2, v1, Ld2/S;->j:Z

    .line 56
    .line 57
    const/4 v2, 0x4

    .line 58
    iput v2, v1, Ld2/S;->d:I

    .line 59
    .line 60
    invoke-virtual {p0, v3}, Landroidx/recyclerview/widget/RecyclerView;->Q(Z)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->b0(Z)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public final r(III[I[I)Z
    .locals 6

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move-object v4, p4

    .line 9
    move-object v5, p5

    .line 10
    invoke-virtual/range {v0 .. v5}, Lw1/j;->c(III[I[I)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    return p1
.end method

.method public final removeDetachedView(Landroid/view/View;Z)V
    .locals 2

    .line 1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {v0}, Ld2/V;->j()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    iget v1, v0, Ld2/V;->j:I

    .line 14
    .line 15
    and-int/lit16 v1, v1, -0x101

    .line 16
    .line 17
    iput v1, v0, Ld2/V;->j:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    invoke-virtual {v0}, Ld2/V;->o()Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    new-instance p2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v1, "Called removeDetachedView with a view which is not flagged as tmp detached."

    .line 32
    .line 33
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->clearAnimation()V

    .line 55
    .line 56
    .line 57
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 58
    .line 59
    .line 60
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->removeDetachedView(Landroid/view/View;Z)V

    .line 61
    .line 62
    .line 63
    return-void
.end method

.method public final requestChildFocus(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    iget-object v0, v0, Ld2/G;->e:Ld2/t;

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-boolean v0, v0, Ld2/t;->e:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    if-eqz p2, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->U(Landroid/view/View;Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :cond_2
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->requestChildFocus(Landroid/view/View;Landroid/view/View;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final requestChildRectangleOnScreen(Landroid/view/View;Landroid/graphics/Rect;Z)Z
    .locals 6

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    move-object v1, p0

    .line 5
    move-object v2, p1

    .line 6
    move-object v3, p2

    .line 7
    move v4, p3

    .line 8
    invoke-virtual/range {v0 .. v5}, Ld2/G;->k0(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;Landroid/graphics/Rect;ZZ)Z

    .line 9
    .line 10
    .line 11
    move-result p1

    .line 12
    return p1
.end method

.method public final requestDisallowInterceptTouchEvent(Z)V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->D:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    const/4 v2, 0x0

    .line 8
    :goto_0
    if-ge v2, v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    check-cast v3, Ld2/k;

    .line 15
    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    add-int/lit8 v2, v2, 0x1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->requestDisallowInterceptTouchEvent(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final requestLayout()V
    .locals 1

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->I:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0}, Landroid/view/View;->requestLayout()V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 15
    .line 16
    return-void
.end method

.method public final s(IIII[II[I)V
    .locals 8

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    move v1, p1

    .line 6
    move v2, p2

    .line 7
    move v3, p3

    .line 8
    move v4, p4

    .line 9
    move-object v5, p5

    .line 10
    move v6, p6

    .line 11
    move-object v7, p7

    .line 12
    invoke-virtual/range {v0 .. v7}, Lw1/j;->d(IIII[II[I)Z

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final scrollBy(II)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const-string p1, "RecyclerView"

    .line 6
    .line 7
    const-string p2, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument."

    .line 8
    .line 9
    invoke-static {p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    invoke-virtual {v0}, Ld2/G;->d()Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 23
    .line 24
    invoke-virtual {v1}, Ld2/G;->e()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-nez v0, :cond_3

    .line 29
    .line 30
    if-eqz v1, :cond_2

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_2
    :goto_0
    return-void

    .line 34
    :cond_3
    :goto_1
    const/4 v2, 0x0

    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_4
    move p1, v2

    .line 39
    :goto_2
    if-eqz v1, :cond_5

    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_5
    move p2, v2

    .line 43
    :goto_3
    const/4 v0, 0x0

    .line 44
    invoke-virtual {p0, p1, p2, v0}, Landroidx/recyclerview/widget/RecyclerView;->W(IILandroid/view/MotionEvent;)Z

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final scrollTo(II)V
    .locals 0

    .line 1
    const-string p1, "RecyclerView"

    .line 2
    .line 3
    const-string p2, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead"

    .line 4
    .line 5
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1}, Landroid/view/accessibility/AccessibilityEvent;->getContentChangeTypes()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move p1, v0

    .line 16
    :goto_0
    if-nez p1, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    move v0, p1

    .line 20
    :goto_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 21
    .line 22
    or-int/2addr p1, v0

    .line 23
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->M:I

    .line 24
    .line 25
    return-void

    .line 26
    :cond_2
    invoke-super {p0, p1}, Landroid/view/View;->sendAccessibilityEventUnchecked(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public setAccessibilityDelegateCompat(Ld2/X;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->z0:Ld2/X;

    .line 2
    .line 3
    invoke-static {p0, p1}, Lw1/K;->m(Landroid/view/View;Lw1/b;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setAdapter(Ld2/z;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutFrozen(Z)V

    .line 3
    .line 4
    .line 5
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 6
    .line 7
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->q:LO3/B;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-object v1, v1, Ld2/z;->a:Ld2/A;

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Landroid/database/Observable;->unregisterObserver(Ljava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-virtual {v1}, Ld2/D;->e()V

    .line 26
    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 29
    .line 30
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 31
    .line 32
    if-eqz v1, :cond_2

    .line 33
    .line 34
    invoke-virtual {v1, v3}, Ld2/G;->g0(Ld2/M;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 38
    .line 39
    invoke-virtual {v1, v3}, Ld2/G;->h0(Ld2/M;)V

    .line 40
    .line 41
    .line 42
    :cond_2
    iget-object v1, v3, Ld2/M;->a:Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ld2/M;->d()V

    .line 48
    .line 49
    .line 50
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->t:LL0/l;

    .line 51
    .line 52
    iget-object v4, v1, LL0/l;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v4, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-virtual {v1, v4}, LL0/l;->r(Ljava/util/ArrayList;)V

    .line 57
    .line 58
    .line 59
    iget-object v4, v1, LL0/l;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v4, Ljava/util/ArrayList;

    .line 62
    .line 63
    invoke-virtual {v1, v4}, LL0/l;->r(Ljava/util/ArrayList;)V

    .line 64
    .line 65
    .line 66
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 67
    .line 68
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iget-object p1, p1, Ld2/z;->a:Ld2/A;

    .line 73
    .line 74
    invoke-virtual {p1, v2}, Landroid/database/Observable;->registerObserver(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    :cond_3
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 78
    .line 79
    iget-object v2, v3, Ld2/M;->a:Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v3}, Ld2/M;->d()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3}, Ld2/M;->c()Ld2/L;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    const/4 v3, 0x1

    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    iget v1, v2, Ld2/L;->b:I

    .line 95
    .line 96
    sub-int/2addr v1, v3

    .line 97
    iput v1, v2, Ld2/L;->b:I

    .line 98
    .line 99
    :cond_4
    iget v1, v2, Ld2/L;->b:I

    .line 100
    .line 101
    if-nez v1, :cond_5

    .line 102
    .line 103
    iget-object v1, v2, Ld2/L;->a:Landroid/util/SparseArray;

    .line 104
    .line 105
    move v4, v0

    .line 106
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    .line 107
    .line 108
    .line 109
    move-result v5

    .line 110
    if-ge v4, v5, :cond_5

    .line 111
    .line 112
    invoke-virtual {v1, v4}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object v5

    .line 116
    check-cast v5, Ld2/K;

    .line 117
    .line 118
    iget-object v5, v5, Ld2/K;->a:Ljava/util/ArrayList;

    .line 119
    .line 120
    invoke-virtual {v5}, Ljava/util/ArrayList;->clear()V

    .line 121
    .line 122
    .line 123
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :cond_5
    if-eqz p1, :cond_6

    .line 127
    .line 128
    iget p1, v2, Ld2/L;->b:I

    .line 129
    .line 130
    add-int/2addr p1, v3

    .line 131
    iput p1, v2, Ld2/L;->b:I

    .line 132
    .line 133
    :cond_6
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->s0:Ld2/S;

    .line 134
    .line 135
    iput-boolean v3, p1, Ld2/S;->f:Z

    .line 136
    .line 137
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 138
    .line 139
    or-int/2addr p1, v0

    .line 140
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->P:Z

    .line 141
    .line 142
    const/4 p1, 0x1

    .line 143
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->O:Z

    .line 144
    .line 145
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 146
    .line 147
    invoke-virtual {p1}, LB0/G0;->G()I

    .line 148
    .line 149
    .line 150
    move-result p1

    .line 151
    const/4 v0, 0x0

    .line 152
    move v1, v0

    .line 153
    :goto_1
    const/4 v2, 0x6

    .line 154
    if-ge v1, p1, :cond_8

    .line 155
    .line 156
    iget-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 157
    .line 158
    invoke-virtual {v3, v1}, LB0/G0;->F(I)Landroid/view/View;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    invoke-static {v3}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 163
    .line 164
    .line 165
    move-result-object v3

    .line 166
    if-eqz v3, :cond_7

    .line 167
    .line 168
    invoke-virtual {v3}, Ld2/V;->o()Z

    .line 169
    .line 170
    .line 171
    move-result v4

    .line 172
    if-nez v4, :cond_7

    .line 173
    .line 174
    invoke-virtual {v3, v2}, Ld2/V;->a(I)V

    .line 175
    .line 176
    .line 177
    :cond_7
    add-int/lit8 v1, v1, 0x1

    .line 178
    .line 179
    goto :goto_1

    .line 180
    :cond_8
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->N()V

    .line 181
    .line 182
    .line 183
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 184
    .line 185
    iget-object v1, p1, Ld2/M;->c:Ljava/util/ArrayList;

    .line 186
    .line 187
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    :goto_2
    if-ge v0, v3, :cond_a

    .line 192
    .line 193
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object v4

    .line 197
    check-cast v4, Ld2/V;

    .line 198
    .line 199
    if-eqz v4, :cond_9

    .line 200
    .line 201
    invoke-virtual {v4, v2}, Ld2/V;->a(I)V

    .line 202
    .line 203
    .line 204
    const/16 v5, 0x400

    .line 205
    .line 206
    invoke-virtual {v4, v5}, Ld2/V;->a(I)V

    .line 207
    .line 208
    .line 209
    :cond_9
    add-int/lit8 v0, v0, 0x1

    .line 210
    .line 211
    goto :goto_2

    .line 212
    :cond_a
    iget-object v0, p1, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 213
    .line 214
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 215
    .line 216
    if-eqz v0, :cond_b

    .line 217
    .line 218
    iget-boolean v0, v0, Ld2/z;->b:Z

    .line 219
    .line 220
    if-nez v0, :cond_c

    .line 221
    .line 222
    :cond_b
    invoke-virtual {p1}, Ld2/M;->d()V

    .line 223
    .line 224
    .line 225
    :cond_c
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 226
    .line 227
    .line 228
    return-void
.end method

.method public setChildDrawingOrderCallback(Ld2/B;)V
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    const/4 p1, 0x0

    .line 5
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setChildrenDrawingOrderEnabled(Z)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setClipToPadding(Z)V
    .locals 1

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 7
    .line 8
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 9
    .line 10
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 11
    .line 12
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 13
    .line 14
    :cond_0
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 15
    .line 16
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 17
    .line 18
    .line 19
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->H:Z

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 24
    .line 25
    .line 26
    :cond_1
    return-void
.end method

.method public setEdgeEffectFactory(Ld2/C;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->S:Ld2/C;

    .line 5
    .line 6
    const/4 p1, 0x0

    .line 7
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 8
    .line 9
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 10
    .line 11
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 14
    .line 15
    return-void
.end method

.method public setHasFixedSize(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->G:Z

    .line 2
    .line 3
    return-void
.end method

.method public setItemAnimator(Ld2/D;)V
    .locals 2

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ld2/D;->e()V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    iput-object v1, v0, Ld2/D;->a:Ld2/y;

    .line 12
    .line 13
    :cond_0
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->x0:Ld2/y;

    .line 18
    .line 19
    iput-object v0, p1, Ld2/D;->a:Ld2/y;

    .line 20
    .line 21
    :cond_1
    return-void
.end method

.method public setItemViewCacheSize(I)V
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 2
    .line 3
    iput p1, v0, Ld2/M;->e:I

    .line 4
    .line 5
    invoke-virtual {v0}, Ld2/M;->k()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public setLayoutFrozen(Z)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->suppressLayout(Z)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public setLayoutManager(Ld2/G;)V
    .locals 10

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 8
    .line 9
    .line 10
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 11
    .line 12
    iget-object v2, v1, Ld2/U;->w:Landroidx/recyclerview/widget/RecyclerView;

    .line 13
    .line 14
    invoke-virtual {v2, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 15
    .line 16
    .line 17
    iget-object v1, v1, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v1, v1, Ld2/G;->e:Ld2/t;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {v1}, Ld2/t;->i()V

    .line 31
    .line 32
    .line 33
    :cond_1
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 34
    .line 35
    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 36
    .line 37
    if-eqz v1, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->a0:Ld2/D;

    .line 40
    .line 41
    if-eqz v1, :cond_2

    .line 42
    .line 43
    invoke-virtual {v1}, Ld2/D;->e()V

    .line 44
    .line 45
    .line 46
    :cond_2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 47
    .line 48
    invoke-virtual {v1, v2}, Ld2/G;->g0(Ld2/M;)V

    .line 49
    .line 50
    .line 51
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ld2/G;->h0(Ld2/M;)V

    .line 54
    .line 55
    .line 56
    iget-object v1, v2, Ld2/M;->a:Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ld2/M;->d()V

    .line 62
    .line 63
    .line 64
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 65
    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 69
    .line 70
    iput-boolean v0, v1, Ld2/G;->g:Z

    .line 71
    .line 72
    invoke-virtual {v1, p0}, Ld2/G;->R(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 76
    .line 77
    const/4 v3, 0x0

    .line 78
    invoke-virtual {v1, v3}, Ld2/G;->t0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 79
    .line 80
    .line 81
    iput-object v3, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_4
    iget-object v1, v2, Ld2/M;->a:Ljava/util/ArrayList;

    .line 85
    .line 86
    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v2}, Ld2/M;->d()V

    .line 90
    .line 91
    .line 92
    :goto_0
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u:LB0/G0;

    .line 93
    .line 94
    iget-object v3, v1, LB0/G0;->r:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v3, Ld2/y;

    .line 97
    .line 98
    iget-object v3, v3, Ld2/y;->a:Landroidx/recyclerview/widget/RecyclerView;

    .line 99
    .line 100
    iget-object v4, v1, LB0/G0;->s:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v4, LO3/T;

    .line 103
    .line 104
    invoke-virtual {v4}, LO3/T;->j()V

    .line 105
    .line 106
    .line 107
    iget-object v1, v1, LB0/G0;->t:Ljava/lang/Object;

    .line 108
    .line 109
    check-cast v1, Ljava/util/ArrayList;

    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 112
    .line 113
    .line 114
    move-result v4

    .line 115
    const/4 v5, 0x1

    .line 116
    sub-int/2addr v4, v5

    .line 117
    :goto_1
    if-ltz v4, :cond_7

    .line 118
    .line 119
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v6

    .line 123
    check-cast v6, Landroid/view/View;

    .line 124
    .line 125
    invoke-static {v6}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    if-eqz v6, :cond_6

    .line 130
    .line 131
    iget v7, v6, Ld2/V;->p:I

    .line 132
    .line 133
    invoke-virtual {v3}, Landroidx/recyclerview/widget/RecyclerView;->L()Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-eqz v8, :cond_5

    .line 138
    .line 139
    iput v7, v6, Ld2/V;->q:I

    .line 140
    .line 141
    iget-object v7, v3, Landroidx/recyclerview/widget/RecyclerView;->F0:Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-virtual {v7, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 144
    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_5
    iget-object v8, v6, Ld2/V;->a:Landroid/view/View;

    .line 148
    .line 149
    sget-object v9, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 150
    .line 151
    invoke-virtual {v8, v7}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 152
    .line 153
    .line 154
    :goto_2
    iput v0, v6, Ld2/V;->p:I

    .line 155
    .line 156
    :cond_6
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    add-int/lit8 v4, v4, -0x1

    .line 160
    .line 161
    goto :goto_1

    .line 162
    :cond_7
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 163
    .line 164
    .line 165
    move-result v1

    .line 166
    :goto_3
    if-ge v0, v1, :cond_8

    .line 167
    .line 168
    invoke-virtual {v3, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 169
    .line 170
    .line 171
    move-result-object v4

    .line 172
    invoke-static {v4}, Landroidx/recyclerview/widget/RecyclerView;->I(Landroid/view/View;)Ld2/V;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4}, Landroid/view/View;->clearAnimation()V

    .line 176
    .line 177
    .line 178
    add-int/lit8 v0, v0, 0x1

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_8
    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 182
    .line 183
    .line 184
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 185
    .line 186
    if-eqz p1, :cond_a

    .line 187
    .line 188
    iget-object v0, p1, Ld2/G;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 189
    .line 190
    if-nez v0, :cond_9

    .line 191
    .line 192
    invoke-virtual {p1, p0}, Ld2/G;->t0(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 193
    .line 194
    .line 195
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->F:Z

    .line 196
    .line 197
    if-eqz p1, :cond_a

    .line 198
    .line 199
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 200
    .line 201
    iput-boolean v5, p1, Ld2/G;->g:Z

    .line 202
    .line 203
    invoke-virtual {p1, p0}, Ld2/G;->Q(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_9
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 208
    .line 209
    new-instance v1, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    const-string v2, "LayoutManager "

    .line 212
    .line 213
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    const-string v2, " is already attached to a RecyclerView:"

    .line 220
    .line 221
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 222
    .line 223
    .line 224
    iget-object p1, p1, Ld2/G;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 225
    .line 226
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->y()Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 238
    .line 239
    .line 240
    throw v0

    .line 241
    :cond_a
    :goto_4
    invoke-virtual {v2}, Ld2/M;->k()V

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 245
    .line 246
    .line 247
    return-void
.end method

.method public setLayoutTransition(Landroid/animation/LayoutTransition;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->setLayoutTransition(Landroid/animation/LayoutTransition;)V

    .line 5
    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 9
    .line 10
    const-string v0, "Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView"

    .line 11
    .line 12
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    throw p1
.end method

.method public setNestedScrollingEnabled(Z)V
    .locals 3

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-boolean v1, v0, Lw1/j;->d:Z

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    iget-object v1, v0, Lw1/j;->c:Landroid/view/ViewGroup;

    .line 10
    .line 11
    sget-object v2, Lw1/K;->a:Ljava/util/WeakHashMap;

    .line 12
    .line 13
    invoke-static {v1}, Lw1/B;->m(Landroid/view/View;)V

    .line 14
    .line 15
    .line 16
    :cond_0
    iput-boolean p1, v0, Lw1/j;->d:Z

    .line 17
    .line 18
    return-void
.end method

.method public setOnFlingListener(Ld2/I;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->j0:Ld2/I;

    .line 2
    .line 3
    return-void
.end method

.method public setOnScrollListener(Ld2/J;)V
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    iput-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->t0:Ld2/J;

    .line 2
    .line 3
    return-void
.end method

.method public setPreserveFocusAfterLayout(Z)V
    .locals 0

    .line 1
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->o0:Z

    .line 2
    .line 3
    return-void
.end method

.method public setRecycledViewPool(Ld2/L;)V
    .locals 3

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 2
    .line 3
    iget-object v1, v0, Ld2/M;->g:Ld2/L;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget v2, v1, Ld2/L;->b:I

    .line 8
    .line 9
    add-int/lit8 v2, v2, -0x1

    .line 10
    .line 11
    iput v2, v1, Ld2/L;->b:I

    .line 12
    .line 13
    :cond_0
    iput-object p1, v0, Ld2/M;->g:Ld2/L;

    .line 14
    .line 15
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, v0, Ld2/M;->h:Landroidx/recyclerview/widget/RecyclerView;

    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Ld2/z;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    iget-object p1, v0, Ld2/M;->g:Ld2/L;

    .line 26
    .line 27
    iget v0, p1, Ld2/L;->b:I

    .line 28
    .line 29
    add-int/lit8 v0, v0, 0x1

    .line 30
    .line 31
    iput v0, p1, Ld2/L;->b:I

    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public setRecyclerListener(Ld2/N;)V
    .locals 0

    .line 1
    return-void
.end method

.method public setScrollState(I)V
    .locals 2

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->b0:I

    .line 7
    .line 8
    const/4 v0, 0x2

    .line 9
    if-eq p1, v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 12
    .line 13
    iget-object v1, v0, Ld2/U;->w:Landroidx/recyclerview/widget/RecyclerView;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 16
    .line 17
    .line 18
    iget-object v0, v0, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 19
    .line 20
    invoke-virtual {v0}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 21
    .line 22
    .line 23
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    iget-object v0, v0, Ld2/G;->e:Ld2/t;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    invoke-virtual {v0}, Ld2/t;->i()V

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 35
    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ld2/G;->f0(I)V

    .line 39
    .line 40
    .line 41
    :cond_2
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t0:Ld2/J;

    .line 42
    .line 43
    if-eqz v0, :cond_3

    .line 44
    .line 45
    invoke-virtual {v0, p0, p1}, Ld2/J;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 46
    .line 47
    .line 48
    :cond_3
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 49
    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/lit8 v0, v0, -0x1

    .line 57
    .line 58
    :goto_0
    if-ltz v0, :cond_4

    .line 59
    .line 60
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    check-cast v1, Ld2/J;

    .line 67
    .line 68
    invoke-virtual {v1, p0, p1}, Ld2/J;->a(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 69
    .line 70
    .line 71
    add-int/lit8 v0, v0, -0x1

    .line 72
    .line 73
    goto :goto_0

    .line 74
    :cond_4
    :goto_1
    return-void
.end method

.method public setScrollingTouchSlop(I)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-eq p1, v1, :cond_0

    .line 13
    .line 14
    new-instance v1, Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v2, "setScrollingTouchSlop(): bad argument constant "

    .line 17
    .line 18
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    const-string p1, "; using default value"

    .line 25
    .line 26
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    const-string v1, "RecyclerView"

    .line 34
    .line 35
    invoke-static {v1, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledPagingTouchSlop()I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 44
    .line 45
    return-void

    .line 46
    :cond_1
    :goto_0
    invoke-virtual {v0}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->i0:I

    .line 51
    .line 52
    return-void
.end method

.method public setViewCacheExtension(Ld2/T;)V
    .locals 0

    .line 1
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->r:Ld2/M;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final startNestedScroll(I)Z
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, v1}, Lw1/j;->g(II)Z

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1
.end method

.method public final stopNestedScroll()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollingChildHelper()Lw1/j;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, v1}, Lw1/j;->h(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final suppressLayout(Z)V
    .locals 9

    .line 1
    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 2
    .line 3
    if-eq p1, v0, :cond_2

    .line 4
    .line 5
    const-string v0, "Do not suppressLayout in layout or scroll"

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->i(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    if-nez p1, :cond_1

    .line 12
    .line 13
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 14
    .line 15
    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 20
    .line 21
    if-eqz p1, :cond_0

    .line 22
    .line 23
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 24
    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->requestLayout()V

    .line 28
    .line 29
    .line 30
    :cond_0
    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView;->J:Z

    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v5, 0x3

    .line 40
    const/4 v6, 0x0

    .line 41
    move-wide v3, v1

    .line 42
    invoke-static/range {v1 .. v8}, Landroid/view/MotionEvent;->obtain(JJIFFI)Landroid/view/MotionEvent;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    invoke-virtual {p0, p1}, Landroidx/recyclerview/widget/RecyclerView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 47
    .line 48
    .line 49
    const/4 p1, 0x1

    .line 50
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->K:Z

    .line 51
    .line 52
    iput-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView;->L:Z

    .line 53
    .line 54
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->setScrollState(I)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 58
    .line 59
    iget-object v0, p1, Ld2/U;->w:Landroidx/recyclerview/widget/RecyclerView;

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    iget-object p1, p1, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/widget/OverScroller;->abortAnimation()V

    .line 67
    .line 68
    .line 69
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    iget-object p1, p1, Ld2/G;->e:Ld2/t;

    .line 74
    .line 75
    if-eqz p1, :cond_2

    .line 76
    .line 77
    invoke-virtual {p1}, Ld2/t;->i()V

    .line 78
    .line 79
    .line 80
    :cond_2
    return-void
.end method

.method public final t(II)V
    .locals 4

    .line 1
    iget v0, p0, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 2
    .line 3
    add-int/lit8 v0, v0, 0x1

    .line 4
    .line 5
    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getScrollX()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getScrollY()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    sub-int v2, v0, p1

    .line 16
    .line 17
    sub-int v3, v1, p2

    .line 18
    .line 19
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/view/View;->onScrollChanged(IIII)V

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->t0:Ld2/J;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, p0, p1, p2}, Ld2/J;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 27
    .line 28
    .line 29
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 30
    .line 31
    if-eqz v0, :cond_1

    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/lit8 v0, v0, -0x1

    .line 38
    .line 39
    :goto_0
    if-ltz v0, :cond_1

    .line 40
    .line 41
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->u0:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    check-cast v1, Ld2/J;

    .line 48
    .line 49
    invoke-virtual {v1, p0, p1, p2}, Ld2/J;->b(Landroidx/recyclerview/widget/RecyclerView;II)V

    .line 50
    .line 51
    .line 52
    add-int/lit8 v0, v0, -0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    iget p1, p0, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 56
    .line 57
    add-int/lit8 p1, p1, -0x1

    .line 58
    .line 59
    iput p1, p0, Landroidx/recyclerview/widget/RecyclerView;->R:I

    .line 60
    .line 61
    return-void
.end method

.method public final u()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->S:Ld2/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->W:Landroid/widget/EdgeEffect;

    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-int/2addr v1, v2

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sub-int/2addr v1, v2

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int/2addr v2, v3

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    sub-int/2addr v2, v3

    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final v()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->S:Ld2/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->T:Landroid/widget/EdgeEffect;

    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-int/2addr v1, v2

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sub-int/2addr v1, v2

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int/2addr v2, v3

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    sub-int/2addr v2, v3

    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final w()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->S:Ld2/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->V:Landroid/widget/EdgeEffect;

    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-int/2addr v1, v2

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sub-int/2addr v1, v2

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int/2addr v2, v3

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    sub-int/2addr v2, v3

    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final x()V
    .locals 4

    .line 1
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->S:Ld2/C;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    new-instance v0, Landroid/widget/EdgeEffect;

    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, Landroid/widget/EdgeEffect;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->U:Landroid/widget/EdgeEffect;

    .line 21
    .line 22
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView;->w:Z

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    sub-int/2addr v1, v2

    .line 35
    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    sub-int/2addr v1, v2

    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    .line 45
    .line 46
    .line 47
    move-result v3

    .line 48
    sub-int/2addr v2, v3

    .line 49
    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    sub-int/2addr v2, v3

    .line 54
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 55
    .line 56
    .line 57
    return-void

    .line 58
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 63
    .line 64
    .line 65
    move-result v2

    .line 66
    invoke-virtual {v0, v1, v2}, Landroid/widget/EdgeEffect;->setSize(II)V

    .line 67
    .line 68
    .line 69
    return-void
.end method

.method public final y()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, ", adapter:"

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->A:Ld2/z;

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v1, ", layout:"

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView;->B:Ld2/G;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ", context:"

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    return-object v0
.end method

.method public final z(Ld2/S;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView;->getScrollState()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x2

    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView;->p0:Ld2/U;

    .line 9
    .line 10
    iget-object v0, v0, Ld2/U;->s:Landroid/widget/OverScroller;

    .line 11
    .line 12
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalX()I

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrX()I

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getFinalY()I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Landroid/widget/OverScroller;->getCurrY()I

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    return-void
.end method
